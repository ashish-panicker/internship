package com.jpa.demo.repos;

import java.util.List;

import com.jpa.demo.model.Book;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BookRepository extends JpaRepository<Book, String> {

    List<Book> findByFirstName(String firstName);

    List<Book> findByTitle(String title);

    @Query("select b from Book b where b.firstName = ?1 and b.title = ?2")
    List<Book> findByFirstNameAndTitle(String firstName, String title);

}
