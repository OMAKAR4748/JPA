package com.xworkz.restaurant.repository;

import com.xworkz.restaurant.entity.ShamHotel;

public interface ShamHotelRepository {
    Boolean save(ShamHotel shamHotel);
    ShamHotel getAllData(Integer id);
    public void getByName(String name);

    void findById(int id);
    void findByName(String hotelName);
}
