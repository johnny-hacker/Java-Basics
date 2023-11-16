//Rectangle.java defines a Rectangle class
public class Rectangle extends Shape {

   private double length, width; // lenth and width
   // rectangle constuctor
   Rectangle(double length, double width) {
      this.length = length;
      this.width = width;
   }
 
   @Override // calculate perimte
   public double area() {
      // length * width
      return (length * width);
   }
   
   @Override // calculate perimeter
   public double perimeter() {
      // ( 2 (lenth*width)
      return ( 2 * (length + width));
   }

   @Override // print out the informtion
   public String toString() {
      return "Rectangle: \n" +
            "Area: " + area() 
            + " Perimeter: " + perimeter() + "\n"; 
   }
}