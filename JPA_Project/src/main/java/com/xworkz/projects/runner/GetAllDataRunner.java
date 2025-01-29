package com.xworkz.projects.runner;

import com.xworkz.projects.entity.PgEntity;
import com.xworkz.projects.service.PgEntityService;
import com.xworkz.projects.service.PgEntityServiceImpl;

public class GetAllDataRunner {
    private static PgEntityService service = new PgEntityServiceImpl();
    public static void main(String[] args) {

//        PgEntity entity = new PgEntity(null,"Boy PG","Bashyam Circle",8245457778L,7000.0);
//        service.save(entity);
        service.getById(4);

        System.out.println("============================");
//        System.out.println(entity);
        service.getByName("Cozy Nest");

        System.out.println("============================");

        service.updateById("Bashyam Circle",6);

        System.out.println("============================");

        service.updateByName("Indira Circle","Cozy Nest");

        System.out.println("============================");

//        service.IdByLocation("MG Road");

        service.getIdByLocation("Bashyam Circle");

        service.getLocationByName("Sunshine PG");
    }
}
