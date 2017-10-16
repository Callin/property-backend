package xyz.vegaone.property.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import xyz.vegaone.property.domain.House;

@Repository
public interface HouseDao extends JpaRepository<House, Long> {
}
