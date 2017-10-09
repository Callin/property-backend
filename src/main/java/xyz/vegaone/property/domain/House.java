package xyz.vegaone.property.domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table (name = "house")
public class House {
    @Column(name = "id")
    @Id
    long id;

    @Column(name = "address")
    String address;

    @Column(name = "property_area")
    int propertyArea;

    @Column(name = "house area")
    int houseArea;
}
