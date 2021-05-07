package com.spring.demo.jdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("trainerDao")
public class TrainerDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int createTrainer(Trainer trainer) {
        if (jdbcTemplate == null) {
            System.err.println("null template");
        }
        return this.jdbcTemplate.update("insert into trainers values (?, ?, ?)", trainer.getId(), trainer.getName(),
                trainer.getEmail());
    }

    public List<Trainer> findAll() {
        return jdbcTemplate.query("select * from trainers", new BeanPropertyRowMapper(Trainer.class));
    }

}
