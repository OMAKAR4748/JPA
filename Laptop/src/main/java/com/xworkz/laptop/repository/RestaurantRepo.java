package com.xworkz.laptop.repository;

import com.xworkz.laptop.entity.RestaurantEntity;

public interface RestaurantRepo {
    void saveData(RestaurantEntity entity);
    String Update(Integer id ,String name);
    void delete(Integer id);

}
