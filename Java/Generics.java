import java.util.ArrayList;
import java.util.List;

public class Generics {
    public static void main(String[] args) {
    
        List<Rectangle> rectangles = new ArrayList<>();
        List<Circle> circles = new ArrayList<>();

        rectangles.add(new Rectangle());
        rectangles.add(new Rectangle());
        rectangles.add(new Rectangle());

        circles.add(new Circle());
        circles.add(new Circle());
        circles.add(new Circle());

        DrawShapes ds = new DrawShapes();
        ds.paint(circles);
        ds.paint(rectangles);
    }

}

interface Shape {
    public void draw();
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("This is a cicle.");
    }
}

class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("This is a rectangle.");
    }
}
class DrawShapes {

    public void paint(List<? extends Shape> shapes){
        for (Shape s : shapes) {
            s.draw();
        }
    }

}