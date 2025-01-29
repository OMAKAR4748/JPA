package com.xworkz.hotel.entity;

import lombok.*;
import net.bytebuddy.dynamic.loading.ClassReloadingStrategy;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "shamHotel")
@NamedQuery(name = "getAllData",query = "Select hotel from HotelEntity hotel")
@NamedQuery(name = "getByName" ,query = "select hotel from HotelEntity hotel where hotel.hotelName =:name")
@NamedQuery(name = "count" ,query = "select count(hotel) from HotelEntity hotel where hotel.location =:location")
@NamedQuery(name = "updateByName" ,query = "update HotelEntity hotel set hotel.location=:location where hotel.hotelName=:name")

public class HotelEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "hotelName")
    private String hotelName;
    private String type;
    private Boolean taste;
    private String location;
}
