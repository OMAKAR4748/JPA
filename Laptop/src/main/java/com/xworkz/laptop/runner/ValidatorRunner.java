package com.xworkz.laptop.runner;

import com.xworkz.laptop.dto.LaptopDto;
import com.xworkz.laptop.repository.LaptopRepository;
import com.xworkz.laptop.repository.LaptopRepositoryImpl;


public class ValidatorRunner {

    private static LaptopRepository repository = new LaptopRepositoryImpl();
    public static void main(String[] args) {
        LaptopDto laptopDto = new LaptopDto();
        laptopDto.setName("Lenovo");
        laptopDto.setBrand("RYZEN");
        laptopDto.setColor("Black");
        laptopDto.setProcessor("lenovo ryzen 7000 series");
        laptopDto.setStorage(512);
        laptopDto.setRam(16);

        repository.validateAndSave(laptopDto);
    }
}
