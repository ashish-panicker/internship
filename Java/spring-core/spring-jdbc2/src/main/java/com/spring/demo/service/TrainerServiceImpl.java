package com.spring.demo.service;

import java.util.List;

import com.spring.demo.dao.TrainerDao;
import com.spring.demo.model.Trainer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrainerServiceImpl implements TrainerService{

    @Autowired
    private TrainerDao trainerDao;

    @Override
    public int create(Trainer trainer) {
        return trainerDao.create(trainer);
    }

    @Override
    public List<Trainer> findAll() {
        return trainerDao.findAll();
    }
    
}
