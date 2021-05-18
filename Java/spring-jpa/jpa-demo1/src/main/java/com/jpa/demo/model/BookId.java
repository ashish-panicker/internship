package com.jpa.demo.model;

import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.Setter;

@Embeddable @Getter @Setter
public class BookId {

    private String isbn;

    private String author;
    
}
