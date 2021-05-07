package com.spring.demo.dao;

import java.util.List;

import com.spring.demo.dao.util.CourseRowMapper;
import com.spring.demo.model.Course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseDaoImpl implements CourseDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int create(Course course) {
        return jdbcTemplate.update("insert into courses values (?, ?)", course.getId(), course.getName());
    }

    @Override
    public List<Course> findAll() {
        return jdbcTemplate.query("select * from courses", new CourseRowMapper());
    }
    
}
