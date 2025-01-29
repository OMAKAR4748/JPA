package com.xworkz.restaurant.repository;

import com.xworkz.restaurant.entity.ShamHotel;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class ShamHotelRepositoryImpl implements ShamHotelRepository {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("hotel");

    @Override
    public Boolean save(ShamHotel shamHotel) {
        System.out.println("Repository ShamHotel: " + shamHotel);
        EntityManager entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(shamHotel);
        entityManager.getTransaction().commit();
        entityManager.close();
        return true;
    }

    @Override
    public ShamHotel getAllData(Integer id) {
        EntityManager entityManager = emf.createEntityManager();
        ShamHotel shamHotel = entityManager.find(ShamHotel.class, id);
        entityManager.close();
        return shamHotel;
    }

    @Override
    public void getByName(String hotelName) {
        EntityManager entityManager = emf.createEntityManager();
        try {
            Query query = entityManager.createNamedQuery("ShamHotel.getByName");
            query.setParameter("name", hotelName);
            ShamHotel shamHotel = (ShamHotel) query.getSingleResult();
            System.out.println(shamHotel.getHotelName());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            entityManager.close();
        }
    }

    @Override
    public void findById(int id) {
        EntityManager entityManager = emf.createEntityManager();
        ShamHotel shamHotel = entityManager.find(ShamHotel.class,1);
        if (shamHotel != null) {
                  shamHotel.setId(1);
            }

    }

    @Override
    public void findByName(String hotelName) {
        EntityManager entityManager = emf.createEntityManager();
        ShamHotel shamHotel = entityManager.find(ShamHotel.class,1);
        if (shamHotel != null) {
            shamHotel.setHotelName("Majestic");
        }
    }
}
