package xyz.vegaone.property.mapper;

import org.mapstruct.Mapper;
import xyz.vegaone.property.dto.User;

@Mapper
public interface UserMapper {
    User domainToDto(xyz.vegaone.property.domain.User user);

    xyz.vegaone.property.domain.User dtoToDomain(User user);
}
