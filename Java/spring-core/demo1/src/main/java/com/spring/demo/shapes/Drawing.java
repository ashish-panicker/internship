package com.spring.demo.shapes;

public class Drawing {

    private Shape shape;

    private Color color;

    public Drawing(){}

    public Drawing(Shape shape, Color color) {
        this.shape = shape;
        this.color = color;
    }

    public void setColor(Color color) {this.color = color;}

    public void setShape(Shape shape) {this.shape = shape;}

    public void drawShape(){
        shape.setColor(color);
        shape.draw();
    }

    public void initialize() {System.err.println("bean initializing.....");}

    public void destroy(){System.err.println("bean destroying.....");}
    
}
