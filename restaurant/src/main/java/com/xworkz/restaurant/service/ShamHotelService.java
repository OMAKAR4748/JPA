package com.xworkz.restaurant.service;

import com.xworkz.restaurant.entity.ShamHotel;

public interface ShamHotelService {
    void save(ShamHotel shamHotel);
    void findById(int id);
    void findByName(String hotelName);
}
