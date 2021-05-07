package com.spring.demo;

import com.spring.demo.jdbc.TestComponent;
import com.spring.demo.jdbc.Trainer;
import com.spring.demo.jdbc.TrainerDao;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);

        Trainer trainer = new Trainer(1, "Ashish", "ashish.s@cognizant.com");

        TrainerDao trainerDao = context.getBean(TrainerDao.class);

        TestComponent component = context.getBean(TestComponent.class);

        component.method();
        
        System.out.println(trainerDao.findAll());
    }

}
