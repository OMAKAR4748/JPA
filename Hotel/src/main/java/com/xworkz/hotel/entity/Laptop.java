package com.xworkz.hotel.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
@Table(name = "Laptop_info")
@NamedQuery(name = "getName" ,query = "select Laptop_info from Laptop Laptop_info where Laptop_info.name =:name")
@NamedQuery(name = "updateName" ,query = "update Laptop Laptop_info set Laptop_info.color=:color where Laptop_info.name=:name")
public class Laptop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    private String color;
    private String processor;
    private int storage;
    private int ram;

}
