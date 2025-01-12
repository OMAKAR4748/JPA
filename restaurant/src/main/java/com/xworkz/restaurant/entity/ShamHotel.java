package com.xworkz.restaurant.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
@Table(name = "ShamHotel")
@NamedQuery(name = "getAllData",query = "Select hotel from ShamHotel hotel")
@NamedQuery(name = "getByName" ,query = "select hotel from ShamHotel hotel where hotel.hotelName =:name")
@NamedQuery(name = "count" ,query = "select count(hotel) from ShamHotel hotel where hotel.location =:location")

public class ShamHotel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "hotelName")
    private String hotelName;
    private String type;
    private Boolean taste;
    private String location;

}
