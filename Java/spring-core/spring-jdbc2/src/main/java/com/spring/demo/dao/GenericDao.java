package com.spring.demo.dao;

import java.util.List;

public interface GenericDao<T> {

    int create(T object);

    List<T> findAll();
    
}
