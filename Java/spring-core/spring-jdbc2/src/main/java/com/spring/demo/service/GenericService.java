package com.spring.demo.service;

import java.util.List;

public interface GenericService<T> {
    
    int create(T object);

    List<T> findAll();
}
