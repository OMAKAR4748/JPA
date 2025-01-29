package com.xworkz.hotel.dto;

import lombok.*;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@ToString
@Data
@AllArgsConstructor
@NoArgsConstructor
public class HotelDto {

    private Integer id;
    @NotNull(message = "htoel name should be null")
    @Size(min = 4,max = 20,message = "hote name should be min 4 max 20")
    private String hotelName;
    @Min(value = 1,message = "rating should be at least 1")
    private String type;
    private Boolean taste;
    private String location;
}
