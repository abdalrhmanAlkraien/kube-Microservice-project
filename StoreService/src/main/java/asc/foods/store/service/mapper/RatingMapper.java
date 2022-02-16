package asc.foods.store.service.mapper;

import asc.foods.store.domain.Rating;
import asc.foods.store.service.dto.RatingDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Rating} and its DTO {@link RatingDTO}.
 */
@Mapper(componentModel = "spring", uses = { AppUserMapper.class, DriverMapper.class, AscOrderMapper.class })
public interface RatingMapper extends EntityMapper<RatingDTO, Rating> {
    @Mapping(target = "appUser", source = "appUser", qualifiedByName = "id")
    @Mapping(target = "driver", source = "driver", qualifiedByName = "id")
    @Mapping(target = "order", source = "order", qualifiedByName = "id")
    RatingDTO toDto(Rating s);
}
