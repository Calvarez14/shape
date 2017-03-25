package edu.jalc.shape.rectangle;

public class Square extends Rectangle{

  public Square(double side){
    super(side, side);
  }

  public String toString(){
    return "Square Perimeter: "+ getPerimeter() + "\n"+
           "Square Area: "+ getArea();
  }
}
