package com.xworkz.pg_book.repo;

import com.xworkz.pg_book.entity.PgBook;

import java.util.List;

public interface PgBookRepository {
    void save(PgBook pgBook);

    PgBook findByEmail(String email);

    List<PgBook> findAll();
}
