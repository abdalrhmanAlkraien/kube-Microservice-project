package asc.foods.store.service.mapper;

import asc.foods.store.domain.Branch;
import asc.foods.store.service.dto.BranchDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Branch} and its DTO {@link BranchDTO}.
 */
@Mapper(componentModel = "spring", uses = { AscStoreMapper.class })
public interface BranchMapper extends EntityMapper<BranchDTO, Branch> {
    @Mapping(target = "store", source = "store", qualifiedByName = "id")
    BranchDTO toDto(Branch s);

    @Named("id")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    BranchDTO toDtoId(Branch branch);
}
