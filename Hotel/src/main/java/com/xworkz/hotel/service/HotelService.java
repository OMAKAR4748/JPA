package com.xworkz.hotel.service;

import com.xworkz.hotel.entity.HotelEntity;

public interface HotelService {

    void save(HotelEntity entity);
    void getById(int id);
    void getByName(String name);
    void updateByName(String location, String hotelName);


}
