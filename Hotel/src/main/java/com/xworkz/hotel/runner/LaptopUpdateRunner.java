package com.xworkz.hotel.runner;

import com.xworkz.hotel.entity.Laptop;
import com.xworkz.hotel.service.LaptopService;
import com.xworkz.hotel.service.LaptopServiceImpl;

public class LaptopUpdateRunner {
    private static LaptopService service = new LaptopServiceImpl();

    public static void main(String[] args) {
        service.updateName("DarkBlue","Asus");
    }
}
