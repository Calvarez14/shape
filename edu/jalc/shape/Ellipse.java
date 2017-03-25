package edu.jalc.shape;

import java.lang.*;
import edu.jalc.shape.twodimensionalshape.TwoDimensionalShape;

public class Ellipse extends TwoDimensionalShape{

  private double minorAxis;
  private double majorAxis;

  public Ellipse(double minorAxis, double majorAxis){
    this.minorAxis = minorAxis;
    this.majorAxis = majorAxis;
    setCircumference();
    setArea();
  }

  private void setCircumference(){
    setPerimeter(2* Math.PI* Math.sqrt((Math.pow(majorAxis,2) + Math.pow(minorAxis,2))/2));
  }

  private void setArea(){
    setArea(Math.PI* majorAxis* minorAxis);
  }

  public Square toSquare(){
    return new Square(Math.sqrt(getArea()));
  }

  public String toString(){
    return "Ellipse Circumference: "+ getPerimeter() +"\n" +
           "Ellipse Area: "+ getArea();
  }
}
