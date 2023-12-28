package box;

public class Circle extends Shape{

  private double radius;

  public Circle (double radius){
    this.radius = radius;
  }

  @Override
  public double area() {
    return this.radius * this.radius * Math.PI;
  }



}
