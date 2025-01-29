package com.xworkz.laptop.runner;

import com.xworkz.laptop.entity.LaptopEntity;
import com.xworkz.laptop.service.LaptopService;
import com.xworkz.laptop.service.LaptopServiceImpl;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class LaptopRunner {
    private static LaptopService service = new LaptopServiceImpl();

    public static void main(String[] args) {
        LaptopEntity laptop = new LaptopEntity(0,"MacBook Pro", "Apple", "Space Grey", "Apple M1", 512, 8);

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("laptop");
        EntityManager entityManager = emf.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.persist(laptop);
        entityManager.find(LaptopEntity.class,1);
        entityManager.getTransaction().commit();

        service.save(laptop);

    }
}
