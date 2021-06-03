package com.easyskillup.trainerservice.controller;

import com.easyskillup.trainerservice.model.Trainer;
import com.easyskillup.trainerservice.repository.TrainerRepository;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrainerController {

    private TrainerRepository trainerRepository;

    public TrainerController(TrainerRepository trainerRepository) {
        this.trainerRepository = trainerRepository;
    }

    @PostMapping("/trainers")
    public ResponseEntity<Trainer> createTrainer(@RequestBody Trainer trainer) {
        var t = trainerRepository.save(trainer);
        return ResponseEntity.ok().body(t);
    }

}
