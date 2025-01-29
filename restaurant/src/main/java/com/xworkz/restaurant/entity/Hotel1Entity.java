package com.xworkz.restaurant.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "hotel")
@NamedQuery(name = "getAllData",query = "Select hotel from ShamHotel hotel")
@NamedQuery(name = "getByName" ,query = "select hotel from ShamHotel hotel where hotel.hotelName =:name")
public class Hotel1Entity {
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "location")
    private String location;
    @Column(name = "rating")
    private double rating;
    @Column(name = "rooms")
    private int rooms;
    @Column(name = "amenities")
    private String amenities;
    @Column(name = "diningOptions")
    private String diningOptions;
    @Column(name = "priceRange")
    private String priceRange;
}
