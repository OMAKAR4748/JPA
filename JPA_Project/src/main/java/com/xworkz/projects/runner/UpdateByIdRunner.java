package com.xworkz.projects.runner;

import com.xworkz.projects.service.PgEntityService;
import com.xworkz.projects.service.PgEntityServiceImpl;

public class UpdateByIdRunner {
    private static PgEntityService service = new PgEntityServiceImpl();

    public static void main(String[] args) {
        service.updateById("Navrang Circle",6);
    }
}
