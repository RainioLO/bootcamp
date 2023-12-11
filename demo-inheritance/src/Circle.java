import java.math.BigDecimal;

public class Circle extends Shape {

  private double radius;

  // Circle extends Shaoe, so it has to override all abstract methods in Parent abstract class
  // for example, no .area()
  @Override
  public double area() {
    return BigDecimal.valueOf(this.radius)
        .multiply(BigDecimal.valueOf(this.radius))
        .multiply(BigDecimal.valueOf(Math.PI)).doubleValue();
    // divide() _> 10/3 -> 3.33333, x.divide(y, 2, RoundingMode.HALF_UP)
  }

  public Circle() {
    // super() calling shape ()
  }

  public Circle(double radius) {
    // super() calling shape ()
    this.radius = radius;
  }

  public Circle(double radius, String color) {
    // super() calling shape ()
    super(color); // call parent's color, color is private in shape
    this.radius = radius;
  }

  public double getRadius() {
    return radius;
  }




  public static void main(String[] args) {

    Circle circle = new Circle(3.6d, "RED");

    System.out.println(circle.area());


  }

}
