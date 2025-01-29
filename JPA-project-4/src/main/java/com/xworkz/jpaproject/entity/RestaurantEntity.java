package com.xworkz.jpaproject.entity;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "restaurant_info")
public class RestaurantEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String restaurantName;
    private String restaurantType;
    private String location;
    private Long pinCode;
    private Long mobileNum;
    private Double rating;
}
