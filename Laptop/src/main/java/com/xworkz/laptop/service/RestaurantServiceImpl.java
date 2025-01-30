//package com.xworkz.laptop.service;
//
//import java.util.List;
//import java.util.Optional;
//
//import com.xworkz.laptop.entity.RestaurantEntity;
//import com.xworkz.laptop.repository.RestaurantRepo;
//import com.xworkz.laptop.repository.RestaurantRepoImpl;
//
//public class RestaurantServiceImpl implements RestaurantService{
//
//    private RestaurantRepo restaurantRepo = new RestaurantRepoImpl();
//
//    public List<RestaurantEntity> findAll() {
//        return restaurantRepo.findAll();
//    }
//
//    public Optional<RestaurantEntity> findById(Long c_no) {
//        return restaurantRepo.findById(c_no);
//    }
//
//    public RestaurantEntity save(RestaurantEntity restaurant) {
//        return restaurantRepo.save(restaurant);
//    }
//
//    public void deleteById(Long c_no) {
//        restaurantRepo.deleteById(c_no);
//    }
//}
