package com.jpa.demo.service;

import java.util.List;
import java.util.Optional;

import com.jpa.demo.model.Book;
import com.jpa.demo.repos.BookRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    private BookRepository repository;

    public List<Book> findByFirstName(String firstName){
        return repository.findByFirstName(firstName);
    }

    public List<Book> findByTitle(String title){
        return repository.findByTitle(title);
    }

    public List<Book> findByFirstNameAndTitle(String firstName, String title){
        return findByFirstNameAndTitle(firstName, title);
    }

    public Book save(Book book){
        return repository.save(book);
    }

    public List<Book> findAll(){
        return repository.findAll();
    }
    
    public Optional<Book> findById(String id){
        return repository.findById(id);
    }
}
