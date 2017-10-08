package xyz.vegaone.property.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class User {
    private Long id;

    private String name;

    private String email;

    private String password;
}
