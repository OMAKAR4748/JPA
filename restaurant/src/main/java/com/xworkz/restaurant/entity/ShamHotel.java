package com.xworkz.restaurant.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
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
    @Column(name = "id")
    private int id;
    @Column(name = "hotelName")
    private String hotelName;
    private String type;
    private Boolean taste;
    private String location;


}
