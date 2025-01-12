package com.xworkz.restaurant.runner;

import com.xworkz.restaurant.entity.ShamHotel;

import javax.persistence.*;

public class GetByNameRunner {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hotel");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Query query = entityManager.createNamedQuery("getByName");
        query.setParameter("name", "omHotel");

        try {
            ShamHotel shamHotel = (ShamHotel) query.getSingleResult();
            System.out.println(shamHotel.getHotelName());
        }catch (NoResultException noResultException)
        {
            System.out.println(noResultException.getMessage());
        }
    }
}

