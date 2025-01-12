package com.xworkz.restaurant.runner;

import com.xworkz.restaurant.entity.ShamHotel;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ShamHotelRunner {
    public static void main(String[] args) {
        ShamHotel shamHotel = new ShamHotel(0,"ShamHotel","Veg and Non-Veg",true,"Bashyam Circle");
        ShamHotel shamHotel1 = new ShamHotel(0,"RameshHotel","Veg",true,"Navrang");
        ShamHotel shamHotel2 = new ShamHotel(0,"SureshHotel","Veg and Non-Veg",false,"Majestic");
        ShamHotel shamHotel3 = new ShamHotel(0,"OmHotel","Veg",true,"Chikpatte");
        ShamHotel shamHotel4 = new ShamHotel(0,"SomHotel","Veg and Non-Veg",true,"VijayNagar");


        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hotel");
        EntityManager entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();
//        entityManager.persist(shamHotel);
//        entityManager.persist(shamHotel1);
//        entityManager.persist(shamHotel2);
//        entityManager.persist(shamHotel3);
//        entityManager.persist(shamHotel4);

        //find
        ShamHotel hotel =entityManager.find(ShamHotel.class,4);
        System.out.println(hotel);

        if (hotel != null)
        {
            entityManager.remove(4);
            System.out.println("Deleted");
        }else {
            System.out.println("Not Deleted");
        }

//        entityManager.remove(4);
        

        entityManager.getTransaction().commit();
    }
}
