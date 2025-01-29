package com.xworkz.projects.service;

import com.xworkz.projects.entity.PgEntity;
import com.xworkz.projects.repository.PgEntityRepository;
import com.xworkz.projects.repository.PgEntityRepositoryImpl;

import java.util.Collections;
import java.util.List;

public class PgEntityServiceImpl implements PgEntityService{
    PgEntityRepository repository = new PgEntityRepositoryImpl();
    @Override
    public Boolean save(PgEntity entity) {
        boolean save = repository.save(entity);
        if (save) {
            System.out.println("Data is saved");
        } else {
            System.out.println("Data is not saved");
        }
        return null;
    }

    @Override
    public void getById(Integer id) {
        PgEntity entity = repository.getById(id);
        if (entity != null) {
            System.out.println(entity);
        } else {
            System.out.println("Not Found");
        }
    }

    @Override
    public void getByName(String name) {
        PgEntity entity = repository.getByName(name);
        if (entity != null) {
            System.out.println("Data Found " +entity);
        } else {
            System.out.println("Data Not Found ");
        }
    }

    @Override
    public void updateByName(String location, String name) {
       PgEntity entity = repository.updateByName(location,name);
       if (entity != null)
       {
           System.out.println("Data Updated " +entity);
       }else {
           System.out.println("Data not Updated ");
       }
    }

    @Override
    public void getIdByLocation(Integer id) {
        PgEntity entity = repository.getIdByLocation(id);
        if (entity != null)
        {
            System.out.println("Data Found " +entity);
        }else {
            System.out.println("Data not Found");
        }
    }

    @Override
    public void getIdByLocationAndName(Integer id) {
        PgEntity entity = repository.getIdByLocationAndName(id);
        if (entity != null)
        {
            System.out.println("Data Found " +entity);
        }else {
            System.out.println("Data not Found");
        }
    }

    @Override
    public void updateById(String location, Integer id) {
        PgEntity entity = repository.updateById(location,id);
        if (entity != null)
        {
            System.out.println("Data Updated  " +entity);
        }else {
            System.out.println("Data not Updated");
        }
    }

    @Override
    public PgEntity IdByLocation(String location) {
        PgEntity entity = repository.IdByLocation("MG Road");
        if (entity != null)
        {
            System.out.println("Data Updated  " +entity);
        }else {
            System.out.println("Data not Updated");
        }
        return entity;
    }

    @Override
    public PgEntity getIdByLocation(String location) {
        return repository.getIdByLocation(location);
    }

    @Override
    public String getLocationByName(String name) {
        return repository.getLocationByName(name);
    }

//    @Override
//    public List<Object[]> getLocationAndStateByName(String name) {
//        return repository.getLocationAndStateByName(name);
//    }
//
//    @Override
//    public List<Object[]> getLocationNameAndStateById(Integer id) {
//        return repository.getLocationNameAndStateById(id);
//    }
}
