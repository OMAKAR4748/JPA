package com.xworkz.laptop.service;

import com.xworkz.laptop.dto.LaptopDto;
import com.xworkz.laptop.entity.LaptopEntity;
import com.xworkz.laptop.repository.LaptopRepository;
import com.xworkz.laptop.repository.LaptopRepositoryImpl;

public class LaptopServiceImpl implements LaptopService {

    private LaptopRepository repository = new LaptopRepositoryImpl();

   @Override
    public void save(LaptopEntity entity) {
        boolean save = repository.save(entity);
        if (save) {
            System.out.println("Data is saved.");
        } else {
            System.out.println("Data is not saved.");
        }
    }

    @Override
    public void validateAndSave(LaptopDto dto) {
       repository.validateAndSave(dto);
    }
}
