package xyz.vegaone.property.mapper;

import org.mapstruct.Mapper;
import xyz.vegaone.property.dto.Apartment;


@Mapper
public interface ApartmentMapper {
    Apartment domainToDto(xyz.vegaone.property.domain.Apartment apartment);

    xyz.vegaone.property.domain.Apartment dtoToDomain(Apartment apartment);
}
