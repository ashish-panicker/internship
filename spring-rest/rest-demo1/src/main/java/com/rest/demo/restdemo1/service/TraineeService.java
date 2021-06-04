package com.rest.demo.restdemo1.service;

import java.util.List;

import com.rest.demo.restdemo1.controllers.payloads.request.TraineeRequest;
import com.rest.demo.restdemo1.doa.TraineeRepo;
import com.rest.demo.restdemo1.model.Trainee;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class TraineeService {

    private TraineeRepo repo;

    public TraineeService(TraineeRepo repo) {
        this.repo = repo;
    }

    public List<Trainee> findAll() {
        log.debug("[finding all trainees]");
        return repo.findAll();
    }

    public Trainee findOne(Long id) {
        log.debug("[finding trainee with id : " + id + "]");
        return repo.findById(id).orElseThrow();
    }

    public Trainee createTrainee(TraineeRequest traineeRequest) {

        Trainee trainee = new Trainee(Long.parseLong(traineeRequest.getId()), traineeRequest.getEmail(),
                traineeRequest.getName(), traineeRequest.getServiceLine());

        log.debug("[Creating trainee: " + trainee.toString() + "]");
        return repo.save(trainee);
    }

    public void deleTrainee(Long id) {
        log.debug("[deleting trainee with id : " + id + "]");
        repo.deleteById(id);
    }

    public Trainee updateTrainee(Long id, TraineeRequest updatedTrainee) {

        Trainee toBeUpdated = findOne(id);

        log.debug("[updating trainee with id: " + id + " : " + updatedTrainee.toString() + "]");
        toBeUpdated.setEmail(updatedTrainee.getEmail());
        toBeUpdated.setName(updatedTrainee.getName());
        toBeUpdated.setServiceLine(updatedTrainee.getServiceLine());

        return repo.save(toBeUpdated);
    }

}
