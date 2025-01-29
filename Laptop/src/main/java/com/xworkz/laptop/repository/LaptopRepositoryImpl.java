package com.xworkz.laptop.repository;

import com.xworkz.laptop.dto.LaptopDto;
import com.xworkz.laptop.entity.LaptopEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.validation.*;
import java.util.Set;

public class LaptopRepositoryImpl implements LaptopRepository {

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("restaurant");

    @Override
    public boolean save(LaptopEntity entity) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            em.persist(entity);
            em.getTransaction().commit();
            return true;
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
            return false;
        } finally {
            em.close();
        }
    }

    @Override
    public void validateAndSave(LaptopDto dto) {
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        Validator validator = validatorFactory.getValidator();
        Set<ConstraintViolation<LaptopDto>> violations = validator.validate(dto);

        if (violations.isEmpty()) {
            LaptopEntity entity = new LaptopEntity();
            entity.setName(dto.getName());
            entity.setBrand(dto.getBrand());
            entity.setColor(dto.getColor());
            entity.setProcessor(dto.getProcessor());
            entity.setStorage(dto.getStorage());
            entity.setRam(dto.getRam());

            save(entity);
            System.out.println("Data is saved.");
        } else {
            violations.stream().forEach(error -> System.out.println(error.getMessage()));
            System.out.println("Validation failed: Data is not saved.");
        }
    }
}
