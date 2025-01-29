package com.xworkz.pg_book.repo;

import com.xworkz.pg_book.entity.PgBook;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PgBookRepositoryImpl implements PgBookRepository {
    private List<PgBook> bookings = new ArrayList<>();


    @Override
    public void save(PgBook pgBook) {

    }

    @Override
    public PgBook findByEmail(String email) {
        return null;
    }

    @Override
    public List<PgBook> findAll() {
        return Collections.emptyList();
    }
}
