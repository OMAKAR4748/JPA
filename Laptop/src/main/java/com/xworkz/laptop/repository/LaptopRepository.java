package com.xworkz.laptop.repository;

import com.xworkz.laptop.dto.LaptopDto;
import com.xworkz.laptop.entity.LaptopEntity;

public interface LaptopRepository {
    boolean save(LaptopEntity entity);
    void validateAndSave(LaptopDto dto);
}
