package com.spring.demo.shapes;

public class Triangle extends Shape {

    @Override
    public void draw() {
        System.out.println("This is a triangle " + super.getColor().getPaint() + " color.");
    }
}
