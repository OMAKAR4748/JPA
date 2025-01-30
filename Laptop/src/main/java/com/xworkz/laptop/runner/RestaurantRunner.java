package com.xworkz.laptop.runner;

import com.xworkz.laptop.entity.RestaurantEntity;
import com.xworkz.laptop.repository.RestaurantRepo;
import com.xworkz.laptop.repository.RestaurantRepoImpl;

public class RestaurantRunner {
    public static void main(String[] args) {
        RestaurantEntity entity = new RestaurantEntity();
        entity.setName("Annapurna");
        entity.setLocation("Hubbli");
        entity.setRating(4.5);
        entity.setPincode(590020L);
        entity.setType("Veg");
        entity.setC_no(8797545761L);

        RestaurantRepo repo = new RestaurantRepoImpl();
        repo.saveData(entity);

        System.out.println("=====================================================");

        repo.Update(34,"Shiv");

        System.out.println("=====================================================");

        repo.delete(33);
    }
}
