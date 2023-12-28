import java.math.BigDecimal;

public class Triangle extends Shape {

  // Attributes: length, colour, area() can be from the Shape "Parent Class"

  private double base;
  private double height;

  public Triangle() {

  }

  public Triangle(double base, double height, String color) {
    super(color);
    this.base = base;
    this.height = height;
  }

  public double getHeight() {
    return this.height;
  }

  public double getBase() {
    return this.base;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public void setBase(double base) {
    this.base = base;
  }



  @Override
  public double area() {
    return BigDecimal.valueOf(this.base)
        .multiply(BigDecimal.valueOf(this.height)).divide(BigDecimal.valueOf(2))
        .doubleValue();
    // divide() _> 10/3 -> 3.33333, x.divide(y, 2, RoundingMode.HALF_UP)
  }



  public static void main(String[] args) {

    Triangle t1 = new Triangle(10d, 20d, "Red");
    System.out.println("t1 area: " + t1.area());
    System.out.println("t1 color: " + t1.getColor());

    Shape s1 = new Triangle(20d, 30d, "Yellow");
    System.out.println("s1 color: " + s1.getColor());
    // System.out.println("s1 base: " + s1.getBase()); // the shape object reference cannot get thr infomation of the Triangle object. No attributes defined
    System.out.println("s1 area: " + s1.area());



  }



}
