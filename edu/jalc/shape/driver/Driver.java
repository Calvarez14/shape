package edu.jalc.shape.driver;

import edu.jalc.shape.ellipse.Ellipse;
import edu.jalc.shape.ellipse.Circle;
import edu.jalc.shape.rectangle.Rectangle;
import edu.jalc.shape.rectangle.Square;
import edu.jalc.shape.righttriangle.RightTriangle;

public class Driver{

  public static void main(String... args){

    Ellipse ellipse = new Ellipse(5,5);
    Circle circle = new Circle(10);
    Rectangle rectangle = new Rectangle (10,2);
    Square square = new Square(7);
    RightTriangle rightTriangle = new RightTriangle(10,4);

    System.out.println(ellipse.toString() + "\n");
    System.out.println(circle.toString() + "\n");
    System.out.println(rectangle.toString() + "\n");
    System.out.println(square.toString() + "\n");
    System.out.println(rightTriangle.toString() + "\n");

    System.out.print("The area of the Rectangle is equal to the area of a Right Triangle: ");
    System.out.println(rectangle.getArea() == rightTriangle.getArea());
    System.out.print("The area of a Ellipse is equal to the area of a Square: ");
    System.out.println(ellipse.getArea() == square.getArea());
    System.out.print("The area of a Circle is equal to the area of a Right Triangle: ");
    System.out.println(circle.getArea() == rightTriangle.getArea());

  }

}
