package com.xworkz.hotel.runner;

import com.xworkz.hotel.entity.Laptop;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class LaptopRunner {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop(0, "Lenovo", "Black", "Intel i7", 512, 16);
        Laptop laptop2 = new Laptop(0, "Dell", "Silver", "Intel i5", 256, 8);
        Laptop laptop3 = new Laptop(0, "HP", "Blue", "AMD Ryzen 5", 512, 16);
        Laptop laptop4 = new Laptop(0, "Apple", "Gray", "M1", 1024, 16);
        Laptop laptop5 = new Laptop(0, "Asus", "Red", "Intel i9", 512, 32);

        EntityManagerFactory emf =Persistence.createEntityManagerFactory("hotel");
        EntityManager entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(laptop1);
        entityManager.persist(laptop2);
        entityManager.persist(laptop3);
        entityManager.persist(laptop4);
        entityManager.persist(laptop5);

        entityManager.getTransaction().commit();
    }
}
