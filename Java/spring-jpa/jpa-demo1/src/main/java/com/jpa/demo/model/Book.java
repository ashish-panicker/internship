package com.jpa.demo.model;

import java.time.LocalDate;

import javax.persistence.EmbeddedId;

public class Book {

    @EmbeddedId
    private BookId bookId;

    private String title;

    private LocalDate publishedDate;

    // book.bookId.isbn = ? and book.bookId.author = ?
    
}
