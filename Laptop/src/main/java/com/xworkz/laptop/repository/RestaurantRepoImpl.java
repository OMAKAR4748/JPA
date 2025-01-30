package com.xworkz.laptop.repository;

import com.xworkz.laptop.entity.RestaurantEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class RestaurantRepoImpl implements RestaurantRepo{
    EntityManagerFactory emf =Persistence.createEntityManagerFactory("restaurant");
    @Override
    public void saveData(RestaurantEntity entity) {
        EntityManager em =emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        try {
            et.begin();
            em.persist(entity);
            et.commit();

            System.out.println(entity);
        }catch (Exception e)
        {
            et.rollback();
        }
        finally {
            em.close();
        }
    }

    @Override
    public String Update(Integer id,String name) {
        EntityManager em =emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        try{
            et.begin();
            RestaurantEntity entity = em.find(RestaurantEntity.class,id);
            if (entity != null) {
                System.out.println("Before update " + entity);
                entity.setName(name);
                em.merge(entity);
                System.out.println("After update " + entity);
                et.commit();
            }

        }catch (Exception e)
        {
            et.rollback();
        }finally {
            em.close();
        }
        return "true";
    }

    @Override
    public void delete(Integer id) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        try {
            et.begin();
            RestaurantEntity entity = em.find(RestaurantEntity.class, id);
            if (entity != null) {
                em.remove(entity);
                System.out.println("Data deleted " + entity);
            }
            et.commit();
        } catch (Exception e) {
            et.rollback();
        } finally {
            em.close();
            emf.close();
        }
    }




}
