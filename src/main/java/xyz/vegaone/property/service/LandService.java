package xyz.vegaone.property.service;

import org.springframework.stereotype.Service;
import xyz.vegaone.property.dao.LandDao;
import xyz.vegaone.property.dto.Land;
import xyz.vegaone.property.mapper.LandMapper;

@Service
public class LandService {

    private LandDao landDao;

    private LandMapper landMapper;

    public Land getLand(Long id){return landMapper.domainToDto(landDao.getOne(id));}
    public Land saveLand(Land land) {
        xyz.vegaone.property.domain.Land savedLand =
                landDao.save(landMapper.dtoToDomain(land));

        return landMapper.domainToDto(savedLand);
    }

    public Land updateLand(Land land) {
        xyz.vegaone.property.domain.Land savedLand =
                landDao.save(landMapper.dtoToDomain(land));

        return landMapper.domainToDto(savedLand);
    }

    public void deleteLand(Long id) {
        landDao.delete(id);
    }
}
