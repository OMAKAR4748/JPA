package com.xworkz.ups.repository;

import com.xworkz.ups.entity.UpsEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.Collections;
import java.util.List;

public class UpsRepositoryImpl implements UpsRepository{
    @Override
    public String saveData(UpsEntity ups) {
        EntityManagerFactory emf  = Persistence.createEntityManagerFactory("UPS");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        try {
            et.begin();
            em.persist(ups);
            et.commit();
            return "Data is Saved";
        }catch (Exception e)
        {
            e.getMessage();
        }finally {
            emf.close();
            em.close();
        }
        return "Data is not Saved";
    }

    @Override
    public List<UpsEntity> getUpsAllData() {
        EntityManagerFactory emf  = Persistence.createEntityManagerFactory("UPS");
        List<UpsEntity> result = emf.createEntityManager().createNamedQuery("getUpsData").getResultList();
        return result;
    }
}
