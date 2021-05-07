package com.spring.demo.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public final class TrainerRowMapper implements RowMapper<Trainer> {

    @Override
    public Trainer mapRow(ResultSet rs, int rowIndex) throws SQLException {
        Trainer trainer = new Trainer();
        trainer.setId(rs.getInt(1));
        trainer.setName(rs.getString(2));
        trainer.setEmail(rs.getString(3));
        return trainer;
    }

}
