package com.xworkz.som.runner;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SomRunner {
    public static void main(String[] args) {
        System.out.println("Main Method Running");

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Som");
    }
}
