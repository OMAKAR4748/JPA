//package com.xworkz.jpaproject.repo;
//
//import com.xworkz.jpaproject.dto.RestaurantDTO;
//import com.xworkz.jpaproject.entity.RestaurantEntity;
//import org.apache.commons.beanutils.BeanUtils;
//
//import javax.validation.ConstraintViolation;
//import javax.validation.Validation;
//import javax.validation.Validator;
//import javax.validation.ValidatorFactory;
//import java.lang.reflect.InvocationTargetException;
//import java.util.Set;
//
//public class RestaurantRepoImpl implements RestaurantRepo{
//
//
//    @Override
//    public void validateAndSave(RestaurantDTO restaurantDTO) {
//
//       ValidatorFactory validatorFactory= Validation.buildDefaultValidatorFactory();
//       Validator validator=validatorFactory.getValidator();
//        Set<ConstraintViolation<RestaurantDTO>> validate=validator.validate(restaurantDTO);
//        if(!validate.isEmpty()) {
//            validate.stream().forEach(err -> System.out.println(err.getMessage()));
//        }else {
//
//            RestaurantEntity restaurantEntity = new RestaurantEntity();
//            restaurantEntity.setId(1);
//            restaurantEntity.setRestaurantName("Mauli hotel");
//            restaurantEntity.setRestaurantType("Veg");
//            restaurantEntity.setLocation("Bashyam Circle");
//            restaurantEntity.setPinCode(5900114L);
//            restaurantEntity.setMobileNum(8296032460L);
//            restaurantEntity.setRating(4.5);
//
//            System.out.println(restaurantEntity);
//
//            try {
//                RestaurantRepo restaurantRepo =new RestaurantRepoImpl();
//                BeanUtils.copyProperties(restaurantEntity,restaurantDTO);
//                System.out.println(restaurantEntity);
//            } catch (InvocationTargetException | IllegalAccessException e) {
//                System.out.println(e.getMessage());
//            }
//        }
//    }
//
//
//}
