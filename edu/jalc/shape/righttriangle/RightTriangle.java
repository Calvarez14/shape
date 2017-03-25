package edu.jalc.shape.righttriangle;

import java.lang.*;
import edu.jalc.shape.twodimensionalshape.TwoDimensionalShape;

public class RightTriangle extends TwoDimensionalShape{

  private double aLeg;
  private double bLeg;

  private RightTriangle(){
    this.aLeg = 0.0;
    this.bLeg = 0.0;
  }

  public RightTriangle(double aLeg, double bLeg){
    this.aLeg = aLeg;
    this.bLeg = bLeg;
    setPerimeter();
    setArea();
  }

  private void setPerimeter(){
    setPerimeter(aLeg+bLeg + Math.sqrt(Math.pow(aLeg,2) + Math.pow(bLeg,2)));
  }

  private void setArea(){
    setArea(aLeg*bLeg/2);
  }

  public String toString(){
    return "RightTriangle Perimeter: "+ getPerimeter() + "\n"+
           "RightTriangle Area: "+ getArea();
  }
}
