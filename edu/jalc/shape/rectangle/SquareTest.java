package edu.jalc.shape;

import java.lang.*;

public class SquareTest{

  public void testPerimeter(){
    System.out.println("Testing Square Perimeter: :getPerimeter");
    Square square = new Square(7);
    assert(square.getPerimeter() == 4*7);
  }

  public void testArea(){
    System.out.println("Testing Square Area: :getArea");
    Square square = new Square(7);
    assert(square.getArea() == Math.pow(7,2));
  }

  public static void main(String... args){
    SquareTest squareTest = new SquareTest();
    squareTest.testPerimeter();
    squareTest.testArea();
    System.out.println("Square Test Passed");
  }
}
