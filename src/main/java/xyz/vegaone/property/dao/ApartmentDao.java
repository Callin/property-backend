package xyz.vegaone.property.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import xyz.vegaone.property.domain.Apartment;

@Repository
public interface ApartmentDao extends JpaRepository<Apartment, Long> {
}
