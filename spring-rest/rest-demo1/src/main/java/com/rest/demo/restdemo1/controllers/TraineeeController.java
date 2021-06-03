package com.rest.demo.restdemo1.controllers;

import java.util.ArrayList;
import java.util.List;

import com.rest.demo.restdemo1.model.Trainee;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TraineeeController {
    
    
    private static List<Trainee> trainees;

    static{
        trainees = new ArrayList<>();
        trainees.add(new Trainee(1, "arun.s", "Arun S", "CDE"));
        trainees.add(new Trainee(2, "rahul.p", "Rahul P", "ADM"));
        trainees.add(new Trainee(3, "sai.k.s", "Sai K S", "SD"));
        trainees.add(new Trainee(4, "amal.p", "Amal P", "CDE"));
    }

    @GetMapping("/trainees")
    public List<Trainee> getAllTrainees(){
        return this.trainees;
    }

    @GetMapping("/trainees/{id}")
    public Trainee getOneTrainee(@PathVariable Integer id){
        return trainees.stream().filter(t -> t.getId().equals(id)).findAny().orElseThrow();
    }

    @PostMapping("/trainees")
    public Trainee postTrainee(@RequestBody Trainee trainee){
        trainees.add(trainee);
        return trainee;
    }

    @PutMapping("/trainees/{id}")
    public Trainee putTrainee(@PathVariable Integer id, @RequestBody Trainee trainee){
        var toBeUpdated = trainees.stream().filter(t -> t.getId().equals(id)).findAny().orElseThrow();
        trainees.set(trainees.indexOf(toBeUpdated), trainee);
        return trainee;
    }

    @DeleteMapping("/trainees/{id}")
    public Boolean deleteTrainee(@PathVariable Integer id){
        var toBeDeleted = trainees.stream().filter(t -> t.getId().equals(id)).findAny().orElseThrow();
        return trainees.remove(toBeDeleted);
    }
}
