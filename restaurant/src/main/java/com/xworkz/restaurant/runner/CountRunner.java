package com.xworkz.restaurant.runner;

import com.xworkz.restaurant.entity.ShamHotel;

import javax.persistence.*;

public class CountRunner {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hotel");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Query query = entityManager.createNamedQuery("count");
        query.setParameter("location","Bashyam Circle");
        Long count =(Long) query.getSingleResult();
        System.out.println(count);


    }
}
