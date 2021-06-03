package com.easyskillup.trainerservice.repository;

import com.easyskillup.trainerservice.model.Trainer;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TrainerRepository extends JpaRepository<Trainer, Integer>{
    
}
