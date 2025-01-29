package com.xworkz.laptop.runner;

import com.xworkz.laptop.entity.RestaurantEntity;
import com.xworkz.laptop.repository.RestaurantRepo;
import com.xworkz.laptop.repository.RestaurantRepoImpl;

public class RestaurantRunner {
    public static void main(String[] args) {
        RestaurantEntity entity = new RestaurantEntity();
        entity.setName("Rudra");
        entity.setLocation("Bashyam Circle");
        entity.setRating(4.1);
        entity.setPincode(5900117L);
        entity.setType("Veg");
        entity.setC_no(8945457787L);

        System.out.println(entity);
        RestaurantRepo repo = new RestaurantRepoImpl();
//        repo.saveData(entity);
        repo.Update(7,"KFC");

        System.out.println("=====================================================");

        repo.delete(24);
    }
}
