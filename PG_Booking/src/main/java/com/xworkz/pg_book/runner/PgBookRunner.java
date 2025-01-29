package com.xworkz.pg_book.runner;

import com.xworkz.pg_book.entity.PgBook;
import com.xworkz.pg_book.service.PgBookService;
import com.xworkz.pg_book.service.PgBookServiceImpl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class PgBookRunner {
    private static PgBookService service = new PgBookServiceImpl();
    public static void main(String[] args) {

//        PgBook booking1 = new PgBook(null,"John Doe", "john@example.com", 9876543210L, "Single Room");
//        PgBook booking2 = new PgBook(null,"Jane Smith", "jane@example.com", 8765432109L, "Double Room");
//
//        service.save(booking1);
//        service.save(booking2);
//
//        PgBook findByEmail = service.findByEmail("john@example.com");
//        System.out.println("All Bookings: " + findByEmail);
//
//        List<PgBook> findAll = service.findAll();
//        System.out.println("find All Booking: " + findAll);

        PgBook pgBook = new PgBook();
        pgBook.setName("BoysPG");
        pgBook.setEmail("Boyspg@gmail.com");
        pgBook.setPhone(85447454545L);
        pgBook.setRoomType("Single");


       EntityManagerFactory emf = Persistence.createEntityManagerFactory("PgBook");
       EntityManager entityManager = emf.createEntityManager();
       entityManager.getTransaction().begin();
       entityManager.persist(pgBook);
       entityManager.getTransaction().commit();
    }
}
