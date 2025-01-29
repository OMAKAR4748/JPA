package com.xworkz.hotel.runner;

import com.xworkz.hotel.dto.HotelDto;
import com.xworkz.hotel.entity.HotelEntity;
import com.xworkz.hotel.service.HotelService;
import com.xworkz.hotel.service.HotelServiceImpl;

public class UpdateHotelRunner {
    private static HotelService service = new HotelServiceImpl();
    public static void main(String[] args) {
        HotelEntity entity = new HotelEntity(2,"MauliHotel","veg",true,"Belagavi");

       service.save(entity);
       service.getById(1);
       service.getByName("");

    }
}
