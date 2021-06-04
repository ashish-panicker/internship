package com.rest.demo.restdemo1.controllers;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import com.rest.demo.restdemo1.controllers.payloads.request.TraineeRequest;
import com.rest.demo.restdemo1.model.Trainee;
import com.rest.demo.restdemo1.service.TraineeService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
// import org.springframework.web.util.UriComponentsBuilder;

@RestController
public class TraineeeController {

    private TraineeService traineeService;

    public TraineeeController(TraineeService traineeService){
        this.traineeService = traineeService;
    }

    @GetMapping("/trainees")
    public List<Trainee> getAllTrainees() {
        return this.traineeService.findAll();
    }

    @GetMapping("/trainees/{id}")
    public Trainee getOneTrainee(@PathVariable Long id) {
        return traineeService.findOne(id);
    }

    @PostMapping("/trainees")
    public Trainee postTrainee(@RequestBody @Valid TraineeRequest trainee) {
        //  UriComponentsBuilder ucb
        // URI localtionUri =
        // ucb.path("/trainees/").path(String.valueOf(trainee.getId())).build().toUri();
        return this.traineeService.createTrainee(trainee);
    }

    @PutMapping("/trainees/{id}")
    public Trainee putTrainee(@PathVariable Long id, @RequestBody TraineeRequest trainee) {
        return this.traineeService.updateTrainee(id, trainee);
    }

    @DeleteMapping("/trainees/{id}")
    public Boolean deleteTrainee(@PathVariable Long id) {
        traineeService.deleTrainee(id);
        return true;
    }
}
