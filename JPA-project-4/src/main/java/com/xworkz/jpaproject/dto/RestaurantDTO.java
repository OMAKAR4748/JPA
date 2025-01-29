package com.xworkz.jpaproject.dto;


import lombok.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class RestaurantDTO {

    private Integer id;
    @NotNull(message = "Name should be Null")
    @Size(min = 3,max = 20,message = "Name should be min-3 and max-20 characters")
    private String restaurantName;
    @NotNull(message = "type should be null")
    private String restaurantType;
    @NotNull(message = "location should be null")
    private String location;
    @NotNull(message = "pincode should be null")
    private Long pinCode;
    @NotNull(message = "Mobile Number should be null")
    private Long mobileNum;
    @NotNull(message = "rating should be null")
    private Double rating;
}
