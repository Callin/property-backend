package xyz.vegaone.property.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.vegaone.property.dao.GarageDao;
import xyz.vegaone.property.dto.Garage;
import xyz.vegaone.property.mapper.GarageMapper;

@Service
public class GarageService {
    @Autowired
    private GarageDao garageDao;

    private GarageMapper garageMapper;

    public Garage getGarage(Long id) {
        return garageMapper.domainToDto(garageDao.getOne(id));
    }

    public Garage saveGarage(Garage garage) {
        xyz.vegaone.property.domain.Garage savedGarage =
                garageDao.save(garageMapper.dtoToDomain(garage));

        return garageMapper.domainToDto(savedGarage);
    }

    public Garage updateGarage(Garage garage) {
        xyz.vegaone.property.domain.Garage savedGarage =
                garageDao.save(garageMapper.dtoToDomain(garage));

        return garageMapper.domainToDto(savedGarage);
    }

    public void deleteGarage(Long id) {
        garageDao.delete(id);
    }
}