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
@Table(name = "restaurant")
public class RestaurantEntity {
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String r_Name;
    @Column(name = "rating")
    private double rating;
    @Column(name = "location")
    private String location;
    @Column(name = "c_no")
    private long contactNumber;
    @Column(name = "pincode")
    private long pincode;
    @Column(name = "type")
    private String r_Type;
}
