package com.xworkz.jpaproject.runner;

import com.xworkz.jpaproject.dto.RestaurantDTO;
import com.xworkz.jpaproject.entity.RestaurantEntity;
//import com.xworkz.jpaproject.repo.RestaurantRepo;
//import com.xworkz.jpaproject.repo.RestaurantRepoImpl;

public class RestaurantRunner {

    public static void main(String[] args) {


        RestaurantDTO restaurantDTO=new RestaurantDTO();

//        RestaurantRepo repo=new RestaurantRepoImpl();
        RestaurantEntity restaurantEntity = new RestaurantEntity();
        restaurantDTO.setId(3);
        restaurantDTO.setRestaurantName("Deepak Hotel");
        restaurantDTO.setRestaurantType("Pure Non-Veg");
        restaurantDTO.setLocation("Bashyam Circle");
        restaurantDTO.setPinCode(5600117L);
        restaurantDTO.setMobileNum(7798545989L);
        restaurantDTO.setRating(4.5);

        System.out.println(restaurantEntity);
//        repo.validateAndSave(restaurantDTO);


    }
}
