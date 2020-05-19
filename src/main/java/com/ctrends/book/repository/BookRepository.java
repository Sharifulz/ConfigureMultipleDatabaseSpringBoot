package com.ctrends.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ctrends.model.book.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}

