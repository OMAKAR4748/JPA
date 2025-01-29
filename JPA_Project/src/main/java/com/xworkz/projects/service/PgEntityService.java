package com.xworkz.projects.service;

import com.xworkz.projects.entity.PgEntity;

import java.util.List;

public interface PgEntityService {
    Boolean save(PgEntity entity);
    void getById(Integer id);
    void getByName(String name);
    void updateByName(String location, String name);
    void getIdByLocation(Integer id);
    void getIdByLocationAndName(Integer id);
    void updateById(String location,Integer id);
    PgEntity IdByLocation(String location);


    PgEntity getIdByLocation(String location);
    String getLocationByName(String name);
//    List<Object[]> getLocationAndStateByName(String name);
//    List<Object[]> getLocationNameAndStateById(Integer id);





}
