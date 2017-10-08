package xyz.vegaone.property.service;

import org.springframework.stereotype.Service;
import xyz.vegaone.property.dao.UserDao;
import xyz.vegaone.property.dto.User;
import xyz.vegaone.property.mapper.UserMapper;

@Service
public class UserService {

    private UserDao userDao;

    private UserMapper userMapper;

    public User getUser(Long id) {
        return userMapper.domainToDto(userDao.getOne(id));
    }

    public User saveUser(User user) {
        xyz.vegaone.property.domain.User savedUser =
                userDao.save(userMapper.dtoToDomain(user));

        return userMapper.domainToDto(savedUser);
    }

    public User updateUser(User user) {
        xyz.vegaone.property.domain.User savedUser =
                userDao.save(userMapper.dtoToDomain(user));

        return userMapper.domainToDto(savedUser);
    }

    public void deleteUser(Long id) {
        userDao.delete(id);
    }
}
