package com.xworkz.projects.repository;

import com.xworkz.projects.entity.PgEntity;

import java.util.List;

public interface PgEntityRepository {
    Boolean save(PgEntity entity);
    PgEntity getById(Integer id);
    PgEntity getByName(String name);
    PgEntity updateByName(String location, String name);
    PgEntity updateById(String location,Integer id);
    PgEntity getIdByLocation(Integer id);
    PgEntity IdByLocation(String location);
    PgEntity getIdByLocationAndName(Integer id);

    PgEntity getIdByLocation(String location);
    String getLocationByName(String name);
//    PgEntity getLocationAndRentByName(String name);
//    PgEntity getLocationNameAndRentById(Integer id);

}
