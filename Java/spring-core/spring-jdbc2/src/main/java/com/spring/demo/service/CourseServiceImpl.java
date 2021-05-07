package com.spring.demo.service;

import java.util.List;

import com.spring.demo.dao.CourseDao;
import com.spring.demo.model.Course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl implements CourseService{

    @Autowired
    private CourseDao courseDao;

    @Override
    public int create(Course course) {
        return courseDao.create(course);
    }

    @Override
    public List<Course> findAll() {
        return courseDao.findAll();
    }
    
}
