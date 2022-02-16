package asc.foods.order.service.mapper;

import asc.foods.order.domain.UserAddress;
import asc.foods.order.service.dto.UserAddressDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link UserAddress} and its DTO {@link UserAddressDTO}.
 */
@Mapper(componentModel = "spring", uses = { AppUserMapper.class })
public interface UserAddressMapper extends EntityMapper<UserAddressDTO, UserAddress> {
    @Mapping(target = "appUser", source = "appUser", qualifiedByName = "id")
    UserAddressDTO toDto(UserAddress s);

    @Named("id")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    UserAddressDTO toDtoId(UserAddress userAddress);
}
