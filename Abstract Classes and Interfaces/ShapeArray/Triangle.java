//Rectangle.java defines a Rectangle class
public class Triangle extends Shape {

    private double side1, side2, side3; // 3 sides
    // triangle length1-3
    Triangle(double length1, double length2, double length3) {
       this.side1 = length1;
       this.side2 = length2;
       this.side3 = length3;
    }
  
    @Override
    public double area() {
       // (lenth * width) / 2
       return ((side1 * side2) / 2 );
    }
    
    @Override // calculate perimter
    public double perimeter() {
      // add all sides together
      return (side1 + side2 + side3);
    }
 
    @Override // print out the informtion
    public String toString() {
      return "Triangle: \n" +
            "Area: " + area() 
            + " Perimeter: " + perimeter() + "\n";
    }
 }