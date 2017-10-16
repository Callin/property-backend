package xyz.vegaone.property.mapper;

import org.mapstruct.Mapper;
import xyz.vegaone.property.dto.House;

public interface HouseMapper {
    House domainToDto(xyz.vegaone.property.domain.House house);

    xyz.vegaone.property.domain.House dtoToDomain(House house);
}
