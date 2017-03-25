package edu.jalc.shape.ellipse;

import java.lang.*;

public class Circle extends Ellipse{

  private double radius;

  private Circle(){
    super(0.0, 0.0);
    this.radius = radius;
  }

  public Circle(double radius){
    super(radius, radius);
    this.radius = radius;
  }

  public String toString(){
    return "Circle Circumference: "+ getPerimeter() + "\n" +
           "Circle Area: "+ getArea();
  }
}
