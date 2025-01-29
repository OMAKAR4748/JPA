package com.xworkz.projects.repository;

import com.xworkz.projects.entity.PgEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.Collections;
import java.util.List;

public class PgEntityRepositoryImpl implements PgEntityRepository{
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("PG");
    @Override
    public Boolean save(PgEntity entity) {
        EntityManager entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(entity);
        entityManager.getTransaction().commit();
        entityManager.close();
        return true;
    }

    @Override
    public PgEntity getById(Integer id) {
        EntityManager entityManager = emf.createEntityManager();
        PgEntity entity = entityManager.find(PgEntity.class, id);
        entityManager.close();
        return entity;
    }

    @Override
    public PgEntity getByName(String name) {
        EntityManager entityManager = emf.createEntityManager();
        try {
            Query query = entityManager.createNamedQuery("getByName");
            query.setParameter("name", name);
            PgEntity entity = (PgEntity) query.getSingleResult();
            return entity;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            entityManager.close();
        }return null;
    }

    @Override
    public PgEntity updateByName(String location, String name) {
        EntityManager entityManager = emf.createEntityManager();
        try {
            entityManager.getTransaction().begin();
            Query query = entityManager.createNamedQuery("updateByName");
            query.setParameter("location", location);
            query.setParameter("name", name);
            query.executeUpdate();
            entityManager.getTransaction().commit();

            Query getName = entityManager.createNamedQuery("getByName");
            getName.setParameter("name", name);
            PgEntity entity = (PgEntity) getName.getSingleResult();
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

    @Override
    public PgEntity updateById(String location, Integer id) {
        EntityManager entityManager = emf.createEntityManager();
        try {
            entityManager.getTransaction().begin();
            Query query = entityManager.createNamedQuery("updateById");
            query.setParameter("location", location);
            query.setParameter("id",id );
            query.executeUpdate();
            entityManager.getTransaction().commit();

            Query getName = entityManager.createNamedQuery("getById");
            getName.setParameter("id", id);
            PgEntity entity = (PgEntity) getName.getSingleResult();
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

    @Override
    public PgEntity getIdByLocation(Integer id) {
        EntityManager entityManager = emf.createEntityManager();
        try {
            Query query = entityManager.createNamedQuery("getIdByLocation");
            query.setParameter("id",id);
            PgEntity location = (PgEntity) query.getSingleResult();
            System.out.println(location);

            return location;
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }finally {
            entityManager.close();
        }return null;
    }

    @Override
    public PgEntity IdByLocation(String location) {
        EntityManager entityManager = emf.createEntityManager();
        try {
            Query query = entityManager.createNamedQuery("getDataIdByLocation");
            query.setParameter("location", location);
            PgEntity entity = (PgEntity) query.getSingleResult();
            return entity;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            entityManager.close();
        }return null;
    }

    @Override
    public PgEntity getIdByLocationAndName(Integer id) {
        EntityManager entityManager = emf.createEntityManager();
        try {
            Query locationAndTaste = entityManager.createNamedQuery("IdByLocationAndName");
            locationAndTaste.setParameter("id",id);
            PgEntity entity = (PgEntity) locationAndTaste.getSingleResult();
            return entity;
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }finally {
            entityManager.close();
        }return null;
    }

    @Override
    public PgEntity getIdByLocation(String location) {
        EntityManager entityManager = emf.createEntityManager();
        try {
            Query locationAndTaste = entityManager.createNamedQuery("getidbylocation");
            locationAndTaste.setParameter("location",location);
            PgEntity entity = (PgEntity) locationAndTaste.getSingleResult();
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }finally {
            entityManager.close();
        }return null;
    }

    @Override
    public String getLocationByName(String name) {
        EntityManager entityManager = emf.createEntityManager();
        try {
            Query locationAndTaste = entityManager.createNamedQuery("getlocationbyname");
            locationAndTaste.setParameter("name",name);
            PgEntity entity = (PgEntity) locationAndTaste.getSingleResult();
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }finally {
            entityManager.close();
        }return null;
    }


}
