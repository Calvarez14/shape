package edu.jalc.shape;

import java.lang.*;

public class RectangleTest{

  public void testPerimeter(){
    System.out.println("Testing Rectangle Perimeter: :getPerimeter");
    Rectangle rectangle = new Rectangle(2,3);
    assert(rectangle.getPerimeter() == 2*(2 + 3));
  }

  public void testArea(){
    System.out.println("Testing Rectangle Area: :getArea");
    Rectangle rectangle = new Rectangle(2,3);
    assert(rectangle.getArea() == 2*3);
  }

  public void testToCircle(){
    System.out.println("Testing Rectangle to Circle");
    Rectangle rectangle = new Rectangle(2,3);
    Circle circle = rectangle.toCircle();
    assert(Math.round(rectangle.getArea()) == Math.round(circle.getArea()));
  }

  public static void main(String... args){
    RectangleTest rectangleTest = new RectangleTest();
    rectangleTest.testPerimeter();
    rectangleTest.testArea();
    rectangleTest.testToCircle();
    System.out.println("Rectangle Test Passed");
  }
}
