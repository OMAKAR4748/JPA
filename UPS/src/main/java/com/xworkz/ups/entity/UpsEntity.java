package com.xworkz.ups.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Table(name = "Ups_info")
@Data
@AllArgsConstructor
@NoArgsConstructor
@NamedQuery(name = "getUpsData",query = "select u from UpsEntity u")
public class UpsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "brandName")
    private String brandName;
    @Column(name = "price")
    private Double price;
    @Column(name = "wattage")
    private String wattage;
    @Column(name = "batteryCapacity")
    private String batteryCapacity;

}
