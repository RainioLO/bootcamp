import java.math.BigDecimal;

public abstract class Shape { // to be extended by other class
  // abstract vs class // abstract means this Class can have abstract method
  // abstract can not be "new"
  // the son can call this abstract by super()
  // super () is to inherit the variable from shape

  // Difference
  // 1. Cannot be "new"
  // 2. May contain abstract method(s), implicitly public
  //

  // Same:
  // 1. Still have instance variables (attributes)
  // 2. Still instance methods
  // 3. still have static method
  // 4. still have constructor, cannot be "new", for super () only

  private String color;

  private double length;

  abstract double area(); // implicitly public // the sons inherit this to do somwthing

  public Shape() {

  }

  public Shape(String color) {
    this.color = color;
  }


  public double getLength() {
    return this.length;
  }

  public String getColor() {
    return this.color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void setLength(double length) {
    this.length = length;
  }

  public static double totalArea(Shape[] shapes) { // ensure the object in shapes inherit the Shape
    BigDecimal total = BigDecimal.valueOf(0);
    for (Shape shape : shapes) {
      total = total.add(BigDecimal.valueOf(shape.area())); // shape.area() determins which object (Circle/Square) -> different implementation -> on area
    }
    return total.doubleValue();
  }

  public static void main(String[] args) {

    Shape s1 = new Circle(3.2d, "Yellow"); // Polymorhismc // it determine what s1 can be exposed
    // Java compile time: s1 has area () method, getColor(), getRadius() ??
    // sub class put in the shape (have relationship)
    System.out.println("s1 area= " + s1.area());
    System.out.println("s1 color= " + s1.getColor());
    // Cant print s1 radius= s1.getRadius();
    // Use shape to receive the circle, only have shape variable

    Circle c2 = (Circle) s1;
    System.out.println(c2.getRadius()); // getRadius() is the skill only by Class Circle

    Circle c1 = new Circle();
    System.out.println("c1 area= " + c1.area());
    System.out.println("c1 color= " + c1.getColor());
    System.out.println("c1 radius= " + c1.getRadius()); // Use Circle to receive the object --> can see radius


    Shape[] shapes = new Shape[] {new Circle(4.2), new Square(9)}; // can put all sons in this class array
    System.out.println(totalArea(shapes));


  }



}


