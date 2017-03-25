package edu.jalc.shape.ellipse;

import java.lang.*;

public class CircleTest{

  public void testCircumference(){
    System.out.println("Testing Circle Circumference: :getCircumference");
    Circle circle = new Circle(10);
    assert(circle.getPerimeter() == 2* Math.PI* 10);
  }

  public void testArea(){
    System.out.println("Testing Circle Area: :getArea");
    Circle circle = new Circle(5);
    assert(circle.getArea() == Math.PI* Math.pow(10,2));
  }

  public static void main(String... args){
    CircleTest circleTest = new CircleTest();
    circleTest.testCircumference();
    circleTest.testArea();
    System.out.println("Circle Test Passed");
  }
}
