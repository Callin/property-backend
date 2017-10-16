package xyz.vegaone.property.service;

import org.springframework.stereotype.Service;
import xyz.vegaone.property.dao.ApartmentDao;
import xyz.vegaone.property.dto.Apartment;
import xyz.vegaone.property.mapper.ApartmentMapper;

@Service
public class ApartmentService {
    private ApartmentDao apartmentDao;

    private ApartmentMapper apartmentMapper;

    public Apartment getAppartment(Long id) {
      return apartmentMapper.domainToDto(apartmentDao.getOne(id));
    }

    public Apartment saveApartment(Apartment apartment) {
        xyz.vegaone.property.domain.Apartment savedApartment =
                apartmentDao.save(apartmentMapper.dtoToDomain(apartment));

        return apartmentMapper.domainToDto(savedApartment);
    }

    public Apartment updateApartment(Apartment apartment) {
        xyz.vegaone.property.domain.Apartment savedApartment =
                apartmentDao.save(apartmentMapper.dtoToDomain(apartment));

        return apartmentMapper.domainToDto(savedApartment);
    }

    public void deleteApartment(Long id) {
        apartmentDao.delete(id);
    }
}