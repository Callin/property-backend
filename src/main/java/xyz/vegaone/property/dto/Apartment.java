package xyz.vegaone.property.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;


//@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Setter
public class Apartment {
    private Long id;

    private String address;

    private Integer numberOfRooms;

    private Integer floor;

    private Integer area;

    private Long owner;

    public Apartment(){
}

    public Apartment (Long id, String address, Integer numberOfRooms, Integer floor, Integer area, Long owner){
        this.id = id;
        this.address = address;
        this.numberOfRooms = numberOfRooms;
        this.floor = floor;
        this.area  = area;
        this.owner = owner;
    }

}

