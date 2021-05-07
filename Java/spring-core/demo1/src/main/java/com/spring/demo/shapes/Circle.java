package com.spring.demo.shapes;

public class Circle extends Shape {

    @Override
    public void draw() {
        System.out.println("This is a circle with " + super.getColor().getPaint() + " color.");
    }
}
