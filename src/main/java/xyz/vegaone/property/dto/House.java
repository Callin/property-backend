package xyz.vegaone.property.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.criteria.CriteriaBuilder;


//@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Setter
public class House {
    private Long id;

    private String address;

    private Integer property_area;

    private Integer house_area;

    public House(Long id, String address, Integer property_area, Integer house_area){
        this.id = id;
        this.address = address;
        this.property_area = property_area;
        this.house_area = house_area;
    }

    public House() {

    }
}
