package com.xworkz.restaurant.runner;

import com.xworkz.restaurant.entity.RestaurantEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.sql.SQLException;

public class RestaurantRunner {
    public static void main(String[] args) {
        System.out.println("Main Method Running");

//        RestaurantEntity restaurant =new RestaurantEntity();
//        restaurant.setId(2);
//        restaurant.setR_Name("Samudra");
//        restaurant.setRating(4);
//        restaurant.setLocation("Bashyam Circle");
//        restaurant.setContactNumber(8975477454L);
//        restaurant.setPincode(5600114L);
//        restaurant.setR_Type("Veg");

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("restaurant");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        //find(read)
        try {
            RestaurantEntity restaurantEntity = entityManager.find(RestaurantEntity.class,2);
            if (restaurantEntity != null)
            {
                System.out.println("Data Found");
                restaurantEntity.setR_Name("Savali");
                entityManager.getTransaction().begin();

                //Update(merge)
                entityManager.merge(restaurantEntity);
                entityManager.getTransaction().commit();
                entityManager.close();

            }
            else{
                System.out.println("Data Not Found");
            }
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
            entityManager.getTransaction().rollback();
        }

        //create(persist)
//        entityManager.persist(restaurant);
//        entityManager.getTransaction().commit();
    }
}
