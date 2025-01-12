package com.xworkz.restaurant.runner;

import com.xworkz.restaurant.tableEntity.MayurHotel;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class MayurHotelRunner {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hotel");
        EntityManager entityManager = emf.createEntityManager();

        List<MayurHotel> list = new ArrayList<>();
        MayurHotel mayurHotel1 = new MayurHotel(0, "ShamHotel", "Veg and Non-Veg", true, "Bashyam Circle");
        MayurHotel mayurHotel2 = new MayurHotel(0, "RameshHotel", "Veg", true, "Navrang");
        MayurHotel mayurHotel3 = new MayurHotel(0, "SureshHotel", "Veg and Non-Veg", false, "Majestic");
        MayurHotel mayurHotel4 = new MayurHotel(0, "OmHotel", "Veg", true, "Chikpatte");
        MayurHotel mayurHotel5 = new MayurHotel(0, "SomHotel", "Veg and Non-Veg", true, "VijayNagar");
        MayurHotel mayurHotel6 = new MayurHotel(0, "HarishHotel", "Non-Veg", true, "Kengeri");
        MayurHotel mayurHotel7 = new MayurHotel(0, "SatishHotel", "Veg", true, "Basavanagudi");
        MayurHotel mayurHotel8 = new MayurHotel(0, "MaheshHotel", "Veg and Non-Veg", true, "BTM Layout");
        MayurHotel mayurHotel9 = new MayurHotel(0, "GaneshHotel", "Veg and Non-Veg", false, "JP Nagar");
        MayurHotel mayurHotel10 = new MayurHotel(0, "RajuHotel", "Non-Veg", true, "Jayanagar");
        list.add(mayurHotel1);
        list.add(mayurHotel2);
        list.add(mayurHotel3);
        list.add(mayurHotel4);
        list.add(mayurHotel5);
        list.add(mayurHotel6);
        list.add(mayurHotel7);
        list.add(mayurHotel8);
        list.add(mayurHotel9);
        list.add(mayurHotel10);

        entityManager.getTransaction().begin();
        for (MayurHotel hotel : list) {
            entityManager.persist(hotel);
        }
        entityManager.getTransaction().commit();

    }
}
