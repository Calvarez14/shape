package edu.jalc.shape;

import java.lang.*;

public class EllipseTest{

  public void testCircumference(){
    System.out.println("Testing Ellipse Circumference: :getCircumference");
    Ellipse ellipse = new Ellipse(5,5);
    assert(ellipse.getPerimeter() == 2* Math.PI* Math.sqrt((Math.pow(5,2) + Math.pow(5,2))/2));
  }

  public void testArea(){
    System.out.println("Testing Ellipse Area: :getArea");
    Ellipse ellipse = new Ellipse(5,5);
    assert(ellipse.getArea() == Math.PI* 5* 5);
  }

  public void testToSquare(){
    System.out.println("Testing Ellipse to Square");
    Ellipse ellipse = new Ellipse(5,5);
    Square square = ellipse.toSquare();
    assert(Math.round(ellipse.getArea()) == Math.round(square.getArea()));
  }

  public static void main(String... args){
    EllipseTest ellipseTest = new EllipseTest();
    ellipseTest.testCircumference();
    ellipseTest.testArea();
    ellipseTest.testToSquare();
    System.out.println("Ellipse Test Passed");
  }
}
