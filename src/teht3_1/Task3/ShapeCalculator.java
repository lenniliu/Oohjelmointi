package teht3_1.Task3;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ShapeCalculator {
    private ArrayList<Shape> shapes = new ArrayList<>();

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public void displayShapes() {
        System.out.println("Shapes in the calculator:");
        for (Shape shape : shapes) {
            System.out.println("Area: " + shape.calculateArea());
        }
    }



    public static void main(String[] args) {
        ShapeCalculator calculator = new ShapeCalculator();
        calculator.addShape(new Circle(5));
        calculator.addShape(new Rectangle(4, 6));
        calculator.addShape(new Triangle(3, 7));
        calculator.displayShapes();
    }
}
