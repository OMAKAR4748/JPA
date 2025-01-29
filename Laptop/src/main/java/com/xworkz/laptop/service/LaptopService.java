package com.xworkz.laptop.service;

import com.xworkz.laptop.dto.LaptopDto;
import com.xworkz.laptop.entity.LaptopEntity;

public interface LaptopService {
    void save(LaptopEntity entity);
    void validateAndSave(LaptopDto dto);
}
