package com.xworkz.hotel.service;

import com.xworkz.hotel.entity.Laptop;
import com.xworkz.hotel.repository.LaptopRepository;
import com.xworkz.hotel.repository.LaptopRepositoryImpl;

public class LaptopServiceImpl implements LaptopService{
    private LaptopRepository repository = new LaptopRepositoryImpl();
    @Override
    public void saved(Laptop laptop) {
        boolean save = repository.saved(laptop);
        if (save) {
            System.out.println("Data is saved");
        } else {
            System.out.println("Data is not saved");
        }
    }

    @Override
    public void updateName(String color, String name) {
        Laptop laptop = repository.updateName(color,name);
        if (laptop != null) {
            System.out.println(laptop);
        } else {
            System.out.println("Not Found");
        }

    }


}
