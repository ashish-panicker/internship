package com.spring.demo.dao.util;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.spring.demo.model.Course;

import org.springframework.jdbc.core.RowMapper;

public final class CourseRowMapper implements RowMapper<Course>{

    @Override
    public Course mapRow(ResultSet rs, int row) throws SQLException {
        Course course = new Course(rs.getInt(1), rs.getString(2));
        return course;
    }
    
}
