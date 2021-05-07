package com.spring.demo.dao;

import java.util.List;

import com.spring.demo.model.Trainer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class TrainerDaoImpl implements TrainerDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int create(Trainer trainer) {
        return jdbcTemplate.update("insert into trainers values (?, ?, ?)", trainer.getId(), trainer.getName(), trainer.getEmail());
    }

    @Override
    public List<Trainer> findAll() {
        return jdbcTemplate.query("select * from trainers", 
            (rs, index) -> new Trainer(rs.getInt(1), rs.getString(2), rs.getString(3)));
    }
    
}
