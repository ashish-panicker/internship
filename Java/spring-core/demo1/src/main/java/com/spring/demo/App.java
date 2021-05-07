package com.spring.demo;

import com.spring.demo.shapes.Circle;
import com.spring.demo.shapes.Color;
import com.spring.demo.shapes.Drawing;
import com.spring.demo.shapes.Shape;
import com.spring.demo.shapes.Triangle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Drawing canvas = context.getBean("triangleCanvas", Drawing.class);

        canvas.drawShape();

    }
}
