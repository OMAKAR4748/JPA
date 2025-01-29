package com.xworkz.hotel.service;

import com.xworkz.hotel.entity.HotelEntity;
import com.xworkz.hotel.entity.Laptop;

public interface LaptopService {
    void saved(Laptop laptop);
    void updateName(String color, String name);
}
