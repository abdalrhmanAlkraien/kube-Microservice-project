package asc.foods.store.service.mapper;

import asc.foods.store.domain.LikePost;
import asc.foods.store.service.dto.LikePostDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link LikePost} and its DTO {@link LikePostDTO}.
 */
@Mapper(componentModel = "spring", uses = { PostMapper.class, AppUserMapper.class })
public interface LikePostMapper extends EntityMapper<LikePostDTO, LikePost> {
    @Mapping(target = "post", source = "post", qualifiedByName = "id")
    @Mapping(target = "appUser", source = "appUser", qualifiedByName = "id")
    LikePostDTO toDto(LikePost s);
}
