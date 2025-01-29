package com.xworkz.projects.runner;


import com.xworkz.projects.entity.PgEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class PgEntityRunner {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PG");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        PgEntity pg1 = new PgEntity(null, "Sunshine PG", "Koramangala", 8012345670L, 8000.0);
        PgEntity pg2 = new PgEntity(null, "Cozy Nest", "Indiranagar", 8023456781L, 7500.0);
        PgEntity pg3 = new PgEntity(null, "Comfort Stay", "Whitefield", 8034567893L, 8500.0);
        PgEntity pg4 = new PgEntity(null, "Happy Home", "MG Road", 8045678905L, 9000.0);
        PgEntity pg5 = new PgEntity(null, "Urban Living", "HSR Layout", 8056789019L, 9500.0);

        entityManager.persist(pg1);
        entityManager.persist(pg2);
        entityManager.persist(pg3);
        entityManager.persist(pg4);
        entityManager.persist(pg5);

        entityManager.getTransaction().commit();

        // Executing the named query to fetch all data
        TypedQuery<PgEntity> query = entityManager.createNamedQuery("getAllData", PgEntity.class);
        List<PgEntity> results = query.getResultList();
        results.forEach(System.out::println);

        entityManager.close();
        entityManagerFactory.close();
    }
}
