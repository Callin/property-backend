package xyz.vegaone.property.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import xyz.vegaone.property.dto.User;
import xyz.vegaone.property.service.UserService;

@RestController(value = "/user")
@Slf4j
public class UserController {

    private UserService userService;

    @GetMapping(value = "/{id}")
    public User getUser(@PathVariable String id) {
//        log.info("Inside get");
        return userService.getUser(Long.valueOf(id));
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public User saveUser(User user) {

        return userService.saveUser(user);
    }

    @PutMapping
    public User putUser(User user) {

        return userService.updateUser(user);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteUser(@PathVariable String id) {
        userService.deleteUser(Long.valueOf(id));
    }
}
