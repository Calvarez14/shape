package edu.jalc.shape;

import java.lang.*;

public class RightTriangleTest{

  public void testPerimeter(){
    System.out.println("Testing Right Triangle Perimeter: :getPerimeter");
    RightTriangle rightTriangle = new RightTriangle(4,7);
    assert(rightTriangle.getPerimeter() == (4+7 + Math.sqrt(Math.pow(4,2) + Math.pow(7,2))));
  }

  public void testArea(){
    System.out.println("Testing Right Triangle Area: :getArea");
    RightTriangle rightTriangle = new RightTriangle(4,7);
    assert(rightTriangle.getArea() == 4*7/2);
  }

  public static void main(String... args){
    RightTriangleTest rightTriangleTest = new RightTriangleTest();
    rightTriangleTest.testPerimeter();
    rightTriangleTest.testArea();
    System.out.println("Right Triangle Test Passed");
  }
}
