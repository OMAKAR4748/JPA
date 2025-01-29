package com.xworkz.projects.runner;

import com.xworkz.projects.service.PgEntityService;
import com.xworkz.projects.service.PgEntityServiceImpl;

public class GetIdByLocationRunner {
    private static PgEntityService service = new PgEntityServiceImpl();

    public static void main(String[] args) {
        service.getIdByLocation(1);
    }
}
