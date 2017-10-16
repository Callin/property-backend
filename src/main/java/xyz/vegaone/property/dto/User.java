package xyz.vegaone.property.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;


//@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Setter
public class User {
    private Long id;

    private String name;

    private String email;

    private String password;

    public User(){

    }

    public User(Long id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }
}
