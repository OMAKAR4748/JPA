package com.xworkz.laptop.repository;

import com.xworkz.laptop.entity.RestaurantEntity;

import java.util.List;
import java.util.Optional;

public interface RestaurantRepo {
    void saveData(RestaurantEntity entity);
    String Update(Integer id ,String name);
    void delete(Integer id);


//    List<RestaurantEntity> findAll();
//    Optional<RestaurantEntity> findById(Long c_no);
//    RestaurantEntity save(RestaurantEntity restaurant);
//    void deleteById(Long c_no);

}
