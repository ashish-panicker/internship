package com.spring.demo;

import java.io.FileReader;
import java.util.Properties;

import com.spring.demo.config.AppConfig;
import com.spring.demo.dao.CourseDao;
import com.spring.demo.dao.TrainerDao;
import com.spring.demo.model.Course;
import com.spring.demo.model.Trainer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * Hello world!
 *
 */
public class App {

    // @Autowired
    // private CourseDao courseDao;

    public static void main(String[] args) {
        
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Trainer trainer = new Trainer(1, "Ashish", "ashish@cognizant.com");
        Course course = new Course(1, "Java FSE");

        TrainerDao trainerDao = context.getBean(TrainerDao.class);
        CourseDao courseDao = context.getBean(CourseDao.class);

        // System.out.println("Creating new trainer: " + trainerDao.create(trainer));
        // System.out.println(trainer);
        // System.out.println("Creating new course: " + courseDao.create(course));
        // System.out.println(course);

        System.out.println("Trainers\n" + trainerDao.findAll());

        System.out.println("Course \n" + courseDao.findAll() );
        
    }
}
