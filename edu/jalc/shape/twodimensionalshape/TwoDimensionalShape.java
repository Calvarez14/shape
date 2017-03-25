package edu.jalc.shape;

public abstract class TwoDimensionalShape{

  private double perimeter;
  private double area;
  public abstract String toString();

  public void setPerimeter(double perimeter){
    this.perimeter = perimeter;
  }

  public void setArea(double area){
    this.area = area;
  }

  public double getPerimeter(){
    return this.perimeter;
  }

  public double getArea(){
    return this.area;
  }

}
