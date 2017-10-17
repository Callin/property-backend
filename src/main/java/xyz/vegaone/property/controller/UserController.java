package xyz.vegaone.property.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import xyz.vegaone.property.dto.User;
import xyz.vegaone.property.service.UserService;

@RestController
@RequestMapping(value = "/user")
@Slf4j
public class UserController {

    private UserService userService;

    @GetMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public User getUser(@PathVariable(name = "id") String id) {
//        log.info("Inside get");
        User user = new User(1L, "johny", "jo@doe.com", "parola");

        return user;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public User saveUser(@RequestBody User user) {

        return userService.saveUser(user);
    }

    @PutMapping
    public User putUser(User user) {

        return userService.updateUser(user);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteUser(@PathVariable(name = "id") String id) {
        userService.deleteUser(Long.valueOf(id));
    }
}
