package com.rest.demo.restdemo1.doa;

import com.rest.demo.restdemo1.model.Trainee;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TraineeRepo extends JpaRepository<Trainee, Long>{
    
}
