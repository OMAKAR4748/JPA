package com.xworkz.pg_book.service;

import com.xworkz.pg_book.entity.PgBook;
import com.xworkz.pg_book.repo.PgBookRepository;
import com.xworkz.pg_book.repo.PgBookRepositoryImpl;


import java.util.ArrayList;
import java.util.List;

public class PgBookServiceImpl implements PgBookService {

    private PgBookRepository repository = new PgBookRepositoryImpl();
    private List<PgBook> bookings = new ArrayList<>();

    @Override
    public void save(PgBook pgBook) {
        repository.save(pgBook);
        if (pgBook != null) {
            bookings.add(pgBook);
            System.out.println("Booking saved: " + pgBook);
        } else {
            System.out.println("Cannot save null booking.");
        }
    }

    @Override
    public PgBook findByEmail(String email) {
        PgBook pgBook = repository.findByEmail("email");
        return pgBook;
    }

    @Override
    public List<PgBook> findAll() {
        List<PgBook> pgBooks = repository.findAll();
        return pgBooks;
    }

}
