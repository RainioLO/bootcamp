public class Circle {

  private double radius;

  // Empty Constructor
  public Circle() {

  }

  // Argument Constructor
  public Circle(double radius) {
    this.radius = radius;

  }

  // Setter
  public void setRadius(double radius) { // lock the type
    this.radius = radius;
  }

  // Getter
  public double getRadius() {

    return this.radius;
  }

  public double getDiameter() {

    double diameter = this.radius * 2;
    return diameter;
  }

    public double getArea() {

      double area = (this.radius)*(this.radius)*3.14;
      return area;

    }

    

  public static void main(String[] args) {

    Circle c1 = new Circle();
    c1.setRadius(3.66);
    System.out.println("Radius of c1: " + c1.getRadius());

    Circle c2 = new Circle(3);
    System.out.println("Radius of c2: " + c2.getRadius());
    System.out.println("Diameter of c2: " + c2.getDiameter());
    System.out.println("Radius of c2: " + c2.getArea());
  }



}
