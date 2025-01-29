package com.xworkz.restaurant.runner;

import com.xworkz.restaurant.entity.ShamHotel;
import com.xworkz.restaurant.service.ShamHotelService;
import com.xworkz.restaurant.service.ShamHotelServiceImpl;

public class ShamHotelsRunner {
    static ShamHotelService service = new ShamHotelServiceImpl();

    public static void main(String[] args) {
        ShamHotel shamHotel = new ShamHotel();
        service.save(shamHotel);

        service.findById(1);
        service.findByName("ShamHotel");

    }
}
