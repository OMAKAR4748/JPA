package com.xworkz.hotel.repository;

import com.xworkz.hotel.entity.HotelEntity;

public interface HotelRepository {
    boolean save(HotelEntity hotel);

    HotelEntity getById(int id);

    HotelEntity getByName(String name);

    HotelEntity updateByName(String location, String hotelName);

}