package com.xworkz.pg_book.service;

import com.xworkz.pg_book.entity.PgBook;

import java.util.List;

public interface PgBookService {
    void save(PgBook pgBook);

    PgBook findByEmail(String email);

    List<PgBook> findAll();
}
