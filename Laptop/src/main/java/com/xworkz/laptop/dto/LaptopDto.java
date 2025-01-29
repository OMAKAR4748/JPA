package com.xworkz.laptop.dto;

import lombok.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class LaptopDto {
    private Integer id;
    @NotNull(message = "Laptop name should be null")
    @Size(min = 2,max = 10,message = "Laptop name should be min 2 and max 10")
    private String name;
    private String brand;
    private String color;
    private String processor;
    private Integer storage;
    private Integer ram;
}
