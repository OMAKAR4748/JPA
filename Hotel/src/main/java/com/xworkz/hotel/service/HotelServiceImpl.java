package com.xworkz.hotel.service;

import com.xworkz.hotel.entity.HotelEntity;
import com.xworkz.hotel.repository.HotelRepository;
import com.xworkz.hotel.repository.HotelRepositoryImpl;

public class HotelServiceImpl implements HotelService {
    private HotelRepository repository = new HotelRepositoryImpl();

    @Override
    public void save(HotelEntity entity) {
        boolean save = repository.save(entity);
        if (save) {
            System.out.println("Data is saved");
        } else {
            System.out.println("Data is not saved");
        }
    }

    @Override
    public void getById(int id) {
        HotelEntity entity = repository.getById(id);
        if (entity != null) {
            System.out.println(entity);
        } else {
            System.out.println("Not Found");
        }
    }

    @Override
    public void getByName(String name) {
        HotelEntity entity = repository.getByName(name);
        if (entity != null) {
            System.out.println(entity);
        } else {
            System.out.println("Not Found");
        }
    }

    @Override
    public void updateByName(String location, String hotelName) {
        HotelEntity entity = repository.updateByName(location, hotelName);
        if (entity != null) {
            System.out.println(entity);
        } else {
            System.out.println("Not Found");
        }
    }

}
