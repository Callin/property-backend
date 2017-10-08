package xyz.vegaone.property.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import xyz.vegaone.property.domain.User;

@Repository
public interface UserDao extends JpaRepository<User, Long> {
}
