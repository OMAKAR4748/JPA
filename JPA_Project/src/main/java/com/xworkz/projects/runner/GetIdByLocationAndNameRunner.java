package com.xworkz.projects.runner;

import com.xworkz.projects.service.PgEntityService;
import com.xworkz.projects.service.PgEntityServiceImpl;

public class GetIdByLocationAndNameRunner {
    private static PgEntityService service = new PgEntityServiceImpl();

    public static void main(String[] args) {
        service.getIdByLocationAndName(2);
    }
}
