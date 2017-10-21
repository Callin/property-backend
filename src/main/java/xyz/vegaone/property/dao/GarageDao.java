package xyz.vegaone.property.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import xyz.vegaone.property.domain.Apartment;
import xyz.vegaone.property.domain.Garage;

public interface GarageDao extends JpaRepository<Garage,Long> {
}
