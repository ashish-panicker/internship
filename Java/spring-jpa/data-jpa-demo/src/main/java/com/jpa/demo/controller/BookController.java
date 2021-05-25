package com.jpa.demo.controller;

import java.util.List;

import com.jpa.demo.model.Book;
import com.jpa.demo.repos.BookRepository;
import com.jpa.demo.service.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping({ "", "/" })
    public Book onPostCreateBook(@RequestBody Book book) {
        return bookService.save(book);
    }

    @GetMapping({ "", "/" })
    public List<Book> onGetAllBooks() {
        return bookService.findAll();
    }

    @GetMapping({ "/{bookId}" })
    public Book onGetOneBook(@PathVariable String bookId) {
        return bookService.findById(bookId).orElseThrow();
    }

    @GetMapping({ "/author/{firstName}" })
    public List<Book> onGetByFirstName(@PathVariable String firstName) {
        return bookService.findByFirstName(firstName);
    }

    @GetMapping({ "/title/{title}" })
    public List<Book> onGetByTitle(@PathVariable String title) {
        return bookService.findByTitle(title);
    }
}
