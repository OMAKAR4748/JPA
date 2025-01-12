package com.xworkz.cantine.runner;

import javax.persistence.Persistence;

public class CantineRunner {
    public static void main(String[] args) {
        System.out.println("Main Method Running");
        Persistence.createEntityManagerFactory("Cantine");
    }
}
