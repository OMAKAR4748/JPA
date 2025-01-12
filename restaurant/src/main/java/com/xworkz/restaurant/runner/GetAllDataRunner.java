package com.xworkz.restaurant.runner;

import com.xworkz.restaurant.entity.ShamHotel;

import javax.persistence.*;
import java.util.List;

public class GetAllDataRunner {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hotel");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Query getAllData = entityManager.createNamedQuery("getAllData");
        List<ShamHotel> resulList =(List<ShamHotel>) getAllData.getResultList();
        for (ShamHotel shamHotel :resulList){
            System.out.println(shamHotel.getHotelName());
        }


    }
}
