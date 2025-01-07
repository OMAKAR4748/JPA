package com.xworkz.company.runner;

import javax.persistence.Persistence;

public class CompanyRunner {
    public static void main(String[] args) {
        System.out.println("Main Method Running");
        Persistence.createEntityManagerFactory("company");
    }
}
