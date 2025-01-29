package com.xworkz.restaurant.runner;

import com.xworkz.restaurant.entity.*;

import javax.persistence.*;
import java.util.List;

public class HotelRunner {
    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hotel");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        Hotel1Entity hotel1 = new Hotel1Entity(1, "Sunset Resort", "Bali, Indonesia", 5.0, 220, "Beach Access, Infinity Pool, Spa", "3 Restaurants, 2 Bars", "$250 - $900 per night");
        entityManager.persist(hotel1);

        Hotel2Entity hotel2 = new Hotel2Entity(2, "City Lights Hotel", "Paris, France", 4.5, 180, "Rooftop Terrace, Gym, Free WiFi", "2 Restaurants, 1 Cafe", "€180 - €700 per night");
        entityManager.persist(hotel2);

        Hotel3Entity hotel3 = new Hotel3Entity(3, "Hillside Haven", "Zurich, Switzerland", 4.0, 140, "Mountain View, Spa, Gym", "1 Restaurant, 1 Bar", "CHF 200 - CHF 650 per night");
        entityManager.persist(hotel3);

        Hotel4Entity hotel4 = new Hotel4Entity(4, "Ocean Breeze Inn", "Sydney, Australia", 4.5, 170, "Beach Access, Pool, Free WiFi", "2 Restaurants, 2 Bars", "AUD 220 - AUD 780 per night");
        entityManager.persist(hotel4);

        Hotel5Entity hotel5 = new Hotel5Entity(5, "Heritage Home", "Agra, India", 4.0, 130, "Heritage Tours, Pool, Free WiFi", "2 Restaurants, 1 Cafe", "₹8,000 - ₹30,000 per night");
        entityManager.persist(hotel5);

        entityManager.getTransaction().commit();


        entityManager.getTransaction().begin();


        Hotel1Entity entity1 = entityManager.find(Hotel1Entity.class, 1);
        if (entity1 != null) {
            entity1.setId(1);
        }

        Hotel2Entity entity2 = entityManager.find(Hotel2Entity.class, 2);
        if (entity2 != null) {
            entity2.setName("ShantiSagar");
        }

        Hotel3Entity entity3 = entityManager.find(Hotel3Entity.class, 3);
        if (entity3 != null) {
            entity3.setLocation("Bangalore");
        }

        Hotel4Entity entity4 = entityManager.find(Hotel4Entity.class, 4);
        if (entity4 != null) {
            entity4.setRating(4);
        }

        Hotel5Entity entity5 = entityManager.find(Hotel5Entity.class, 5);
        if (entity5 != null) {
            entity5.setName("Mauli");
        }
        Query query = entityManager.createNamedQuery("count");
        query.setParameter("location", "Bashyam Circle");
        Long count = (Long) query.getSingleResult();


        Query getAllData = entityManager.createNamedQuery("getAllData");
        List<Hotel1Entity> resulList = (List<Hotel1Entity>) getAllData.getResultList();
        for (Hotel1Entity hotel1Entity : resulList) {
            System.out.println(hotel1Entity.getName());
        }

        Query query1 = entityManager.createNamedQuery("getByName");
        query1.setParameter("name", "omHotel");

        try {
            ShamHotel shamHotel = (ShamHotel) query.getSingleResult();
            System.out.println(shamHotel.getHotelName());
        } catch (NoResultException noResultException) {
            System.out.println(noResultException.getMessage());
        }
        entityManager.getTransaction().commit();

    }
}

