//Circle.java defines a Circle class
public class Circle extends Shape {

   private double radius; // radius
   // circle constructor
   public Circle(double radius) {
      this.radius = radius;
   }

   @Override // find the area of a circle
   public double area() {
      // (PI (radius^2))
      return (Math.PI * Math.pow(radius, 2));
   }

   @Override // find perimeter
   public double perimeter() {
      // (2*(PI*radius))
      return ( 2 * (Math.PI * radius));
   }

   @Override // print out the informtion
   public String toString() {
      return "Circle: \n" +
            "Area: " + area() 
            + " Perimeter: " + perimeter() + "\n";
   }
}