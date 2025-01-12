package com.xworkz.showroom.runner;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ShowroomRunner {
    public static void main(String[] args) {
        System.out.println("Main Method Running");

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Showroom");
    }
}
