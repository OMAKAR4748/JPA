package com.xworkz.hotel.repository;

import com.xworkz.hotel.entity.HotelEntity;
import com.xworkz.hotel.entity.Laptop;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class LaptopRepositoryImpl implements LaptopRepository{
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("hotel");
    @Override
    public boolean saved(Laptop laptop) {
        System.out.println("Repository: "+laptop);
        EntityManager entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(laptop);
        entityManager.getTransaction().commit();
        entityManager.close();
        return true;
    }


    @Override
    public Laptop updateName(String color, String name) {
        EntityManager entityManager = emf.createEntityManager();
        try {
            entityManager.getTransaction().begin();
            Query query = entityManager.createNamedQuery("updateName");
            query.setParameter("color", color);
            query.setParameter("name",name);
            query.executeUpdate();
            entityManager.getTransaction().commit();

            Query getName = entityManager.createNamedQuery("getName");
            getName.setParameter("name", name);
            Laptop laptop = (Laptop) getName.getSingleResult();
            return laptop;
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
