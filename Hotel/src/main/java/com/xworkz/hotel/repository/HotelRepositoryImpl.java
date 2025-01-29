package com.xworkz.hotel.repository;

import com.xworkz.hotel.entity.HotelEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class HotelRepositoryImpl implements HotelRepository {
    private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("hotel");

    @Override
    public boolean save(HotelEntity hotel) {
        System.out.println("Repository HotelEntity: " + hotel);
        EntityManager entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(hotel);
        entityManager.getTransaction().commit();
        entityManager.close();
        return true;
    }

    @Override
    public HotelEntity getById(int id) {
        EntityManager entityManager = emf.createEntityManager();
        HotelEntity entity = entityManager.find(HotelEntity.class, id);
        entityManager.close();
        return entity;
    }

    @Override
    public HotelEntity getByName(String hotelName) {
        EntityManager entityManager = emf.createEntityManager();
        try {
            Query query = entityManager.createNamedQuery("getByName");
            query.setParameter("name", hotelName);
            HotelEntity entity = (HotelEntity) query.getSingleResult();
            return entity;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            entityManager.close();
        }return null;
    }

    @Override
    public HotelEntity updateByName(String location, String hotelName) {
        EntityManager entityManager = emf.createEntityManager();
        try {
            entityManager.getTransaction().begin();
            Query query = entityManager.createNamedQuery("updateByName");
            query.setParameter("location", location);
            query.setParameter("name", hotelName);
            query.executeUpdate();
            entityManager.getTransaction().commit();

            Query getName = entityManager.createNamedQuery("getByName");
            getName.setParameter("name", hotelName);
            HotelEntity entity = (HotelEntity) getName.getSingleResult();
            return entity;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            if (entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().rollback();
            }
        } finally {
            entityManager.close();
        }
        return null;
    }




}
