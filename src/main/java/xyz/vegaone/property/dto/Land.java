package xyz.vegaone.property.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;


//@JsonInclude(JsonInclude.Include.NON_NULL)
public class Land {
    private Long id;

    private String address;

    private Integer area;

    public Land(){


    }
    public Land (Long id,String address, Integer area){
        this.id = id;
        this.address = address;
        this.area = area;
    }
}
