/*
Programmer Name: Johnny Olmedo
Date: 04/12/2022
This program demonstrates Abstraction, Inheritance, and Interfaces. This is all
done by calling instances of the Objects(Shapes) that inherit abstrct features from the abstract class
"Shape".
*/
import java.io.*;
import java.util.*;

public class ShapeArray extends Shape {
    private ArrayList<Shape> shapes; // ArrayList to hold shapes

    // Constructor to initialize the ArrayList
    public ShapeArray() {
        shapes = new ArrayList<>();
    }

    // Method to add shapes to the ArrayList
    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    // Implementation of area() method to calculate total area of all shapes
    @Override
    double area() {
        double totalArea = 0.0;
        for (Shape shape : shapes) {
            totalArea += shape.area();
        }
        return totalArea;
    }

    // Implementation of perimeter() method to calculate total perimeter of all shapes
    @Override
    double perimeter() {
        double totalPerimeter = 0.0;
        for (Shape shape : shapes) {
            totalPerimeter += shape.perimeter();
        }
        return totalPerimeter;
    }
    public static void main(String[] args) {
        // create instance of rectangle
        Rectangle rectangle = new Rectangle(3.0, 2.0); // length: 3 width:2
        // create instance of circle
        Circle circle = new Circle(2.0); // radius: 2
        // create instance of cirlce
        Triangle triangle = new Triangle(2.0, 2.0, 2.0); // length 1-3: 2
        // list that will hold all instances of objects created
        ArrayList<Object> shapeArray = new ArrayList<Object>();
        // load list will objects
        shapeArray.add(rectangle);
        shapeArray.add(circle);
        shapeArray.add(triangle);

        // use for loop to go through and print everything
        for (int i = 0; i < shapeArray.size(); i++) {
            System.out.println(shapeArray.get(i)); // print
        }
    }
}