package com.xworkz.laptop.runner;

import com.xworkz.laptop.entity.RestaurantEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class RestaurantRunner {
    public static void main(String[] args) {

        RestaurantEntity restaurant = new RestaurantEntity();
        restaurant.setId(22);
        restaurant.setName("Raju");
        restaurant.setRating(4.2);
        restaurant.setLocation("Bashyam Circle");
        restaurant.setC_no(9957564645L);
        restaurant.setPincode(5900120L);
        restaurant.setType("Veg And Non-Veg");

        System.out.println(restaurant);

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("restaurant");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        try {
            et.begin();
            em.persist(restaurant);
//
////            RestaurantEntity savedRestaurant = em.merge(restaurant);
            et.commit();

//            System.out.println("Saved Restaurant: " + savedRestaurant);
//            et.begin();
//            RestaurantEntity entity = em.find(RestaurantEntity.class, 20);
//            et.commit();
//            System.out.println("Before update: " + entity);
//
//            entity.setName("Mauli");
//            System.out.println("After update: " + entity);
//            RestaurantEntity updatedEntity = em.merge(entity);
//            System.out.println("Updated Entity: " + updatedEntity);
//
//            et.begin();
//            em.remove(em.contains(updatedEntity) ? updatedEntity : em.merge(updatedEntity));
//            if (updatedEntity != null)
//            {
//                System.out.println("Data deleted");
//            }else {
//                System.out.println("Data not deleted");
//            }
//            et.commit();

        } catch (Exception e) {
            System.out.println(e.getMessage());
            et.rollback();
        } finally {
            em.close();
            emf.close();
        }
    }
}
