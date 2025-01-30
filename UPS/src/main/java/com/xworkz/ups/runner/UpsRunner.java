package com.xworkz.ups.runner;

import com.xworkz.ups.entity.UpsEntity;
import com.xworkz.ups.repository.UpsRepository;
import com.xworkz.ups.repository.UpsRepositoryImpl;

import java.util.List;


public class UpsRunner {
    public static void main(String[] args) {

        UpsEntity ups = new UpsEntity();
        ups.setBrandName("Livguard");
        ups.setPrice(25000d);
        ups.setWattage("400vh");
        ups.setBatteryCapacity("20000mah");

        UpsRepository repository = new UpsRepositoryImpl();
        String result = repository.saveData(ups);
        System.out.println(result);

        List<UpsEntity> upsEntities =repository.getUpsAllData();
        upsEntities.forEach(u-> System.out.println(u));
    }
}
