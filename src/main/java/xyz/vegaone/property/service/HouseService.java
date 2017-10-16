package xyz.vegaone.property.service;

import org.springframework.stereotype.Service;
import xyz.vegaone.property.dao.HouseDao;
import xyz.vegaone.property.dto.House;
import xyz.vegaone.property.mapper.HouseMapper;

@Service
public class HouseService {

    private HouseDao houseDao;

    private HouseMapper houseMapper;

    public House getHouse(Long id) {
        return houseMapper.domainToDto(houseDao.getOne(id));
    }

    public House savehouse(House house) {
        xyz.vegaone.property.domain.House savedHouse =
                houseDao.save(houseMapper.dtoToDomain(house));

        return houseMapper.domainToDto(savedHouse);
    }

    public House updateHouse(House house) {
        xyz.vegaone.property.domain.House savedHouse =
                houseDao.save(houseMapper.dtoToDomain(house));

        return houseMapper.domainToDto(savedHouse);
    }

    public void deleteHouse(Long id) {
        houseDao.delete(id);
    }
}
