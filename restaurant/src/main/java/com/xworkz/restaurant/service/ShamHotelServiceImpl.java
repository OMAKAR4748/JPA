package com.xworkz.restaurant.service;

import com.xworkz.restaurant.entity.ShamHotel;
import com.xworkz.restaurant.repository.ShamHotelRepository;
import com.xworkz.restaurant.repository.ShamHotelRepositoryImpl;

public class ShamHotelServiceImpl implements ShamHotelService {
    private ShamHotelRepository shamHotelRepository = new ShamHotelRepositoryImpl();

    @Override
    public void save(ShamHotel shamHotel) {
        boolean save = shamHotelRepository.save(shamHotel);
        if (save) {
            System.out.println("Data is saved");
        } else {
            System.out.println("Data is not saved");
        }
    }

    @Override
    public void findById(int id) {

    }

    @Override
    public void findByName(String hotelName) {

    }

}
