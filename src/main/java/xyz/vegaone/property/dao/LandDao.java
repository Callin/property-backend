package xyz.vegaone.property.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import xyz.vegaone.property.domain.Land;

@Repository
public interface LandDao extends JpaRepository<Land, Long> {
}
