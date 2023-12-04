public class Circle {

  private double radius;

  // Empty Constructor
  public Circle() {

  }

  // Argument Constructor
  public Circle(double radius) {
    this.radius = radius;

  }

  // Setter - Instance Method
  public void setRadius(double radius) { // lock the type
    this.radius = radius;
  }

  // Getter - Instance Method
  public double getRadius() {

    return this.radius;
  }

  public double getDiameter() {

    double diameter = this.radius * 2;
    return diameter;
  }

  public double getArea() {


    return Math.pow(this.radius, 2) * Math.PI;

    // double area = (this.radius)*(this.radius)*3.14;
    // return area;
    // Math Library

  }



  public static void main(String[] args) {

    Circle c1 = new Circle();
    c1.setRadius(3.2);
    System.out.println("Radius of c1: " + c1.getRadius());
    System.out.println("c1 Area:" + c1.getArea());
    System.out.println("c1 Diameter:" + c1.getDiameter());

    Circle c2 = new Circle(3.4);
    System.out.println("Radius of c2: " + c2.getRadius());
    System.out.println("Diameter of c2: " + c2.getDiameter());
    System.out.println("Radius of c2: " + c2.getArea());

    // Pass by reference, they point to the same address
    c1 = c2; // c1 is equal to c2's address now
    System.out.println("Radius of c1: " + c1.getRadius());
    System.out.println("Radius of c2: " + c2.getRadius());



  }



}
