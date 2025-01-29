package com.xworkz.hotel.repository;

import com.xworkz.hotel.entity.HotelEntity;
import com.xworkz.hotel.entity.Laptop;

public interface LaptopRepository {
    boolean saved(Laptop laptop);
    Laptop updateName(String color, String name);
}
