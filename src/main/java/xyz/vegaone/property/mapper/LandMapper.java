package xyz.vegaone.property.mapper;

import org.mapstruct.Mapper;
import xyz.vegaone.property.dto.Land;

@Mapper
public interface LandMapper {
    Land domainToDto(xyz.vegaone.property.domain.Land land);

    xyz.vegaone.property.domain.Land dtoToDomain(Land land);

}
