package xyz.vegaone.property.mapper;

import org.mapstruct.Mapper;
import xyz.vegaone.property.dto.Garage;


@Mapper
public interface GarageMapper {
    Garage domainToDto (xyz.vegaone.property.domain.Garage garage);

    xyz.vegaone.property.domain.Garage dtoToDomain (Garage garage);
}
