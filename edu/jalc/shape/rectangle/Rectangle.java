package edu.jalc.shape.rectangle;

import edu.jalc.shape.twodimensionalshape.TwoDimensionalShape;
import edu.jalc.shape.ellipse.Circle;

public class Rectangle extends TwoDimensionalShape{

  private double length;
  private double width;

  private Rectangle(){
    this.length = 0.0;
    this.width = 0.0;
  }

  public Rectangle(double length, double width){
    this.length = length;
    this.width = width;
    setPerimeter();
    setArea();
  }

  public void setPerimeter(){
    setPerimeter(2*(length + width));
  }

  public void setArea(){
    setArea(length*width);
  }

  public Circle toCircle(){
    return new Circle(Math.sqrt(getArea()/Math.PI));
  }

  public String toString(){
    return "Rectangle Perimeter: "+ getPerimeter() + "\n" +
           "Rectangle Area: "+ getArea();
  }
}
