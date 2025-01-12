package com.xworkz.restaurant.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "hotel")
public class Hotel4Entity {
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
