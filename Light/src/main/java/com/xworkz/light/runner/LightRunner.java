package com.xworkz.light.runner;


import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class LightRunner {
    public static void main(String[] args) {
        System.out.println("Main method running");

        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("Light");
    }
}
