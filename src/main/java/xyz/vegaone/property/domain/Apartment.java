package xyz.vegaone.property.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Bogdan on 08/10/2017.
 */
@Getter
@Setter
@Entity
@Table(name = "apartment")
public class Apartment {
    @Column(name = "id")
    @Id
    long id;

    @Column(name = "address")
    String address;

    @Column (name = "number_of_rooms")
    int numberOfRooms;

    @Column (name = "floor")
    int floor;

    @Column (name = "area")
    int area;

    @Column (name = "owner")
    long owner;
}
