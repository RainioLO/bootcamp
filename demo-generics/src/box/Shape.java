package box;

import java.util.ArrayList;
import java.util.List;

public class Shape { // normal class

  public double area() {
    return -1.0;
  }

  // Static Method: Sum up all area from the class object (circle/square)
  public static <T extends Shape> double area1(List<T> shapes) { // declare at main
    double totalArea = 0;
    for (T t : shapes) { // shapes is the pointor // what is T and t ????
      totalArea += t.area();
    }
    return totalArea;
  }

  public static double area3(List<? extends Shape> shapes) { // <? extends Shape> Shape or below Class
    double totalArea = 0.0d; // List<? extends Shape> lock the upper bound
    for (Shape t : shapes) { // get the circle object and square object to put on a Shape
      totalArea += t.area();
    }
    return totalArea;
  }

  // public static double area4(List<? super Shape> shapes) { // cannot be super // can have the parent
  //   double totalArea = 0.0d; // not sure it is Shape or not, can be Shape Parent
  //   for (Shape t : shapes) {
  //     // for (Object t : shapes) { --> OK
  //     totalArea += t.area();
  //   }
  //   return totalArea;
  // }

  public static double area2(List<Shape> shapes) { // Shape --> square/circle
    double totalArea = 0.0d;
    for (Shape t : shapes) {
      totalArea += t.area();
    }
    return totalArea;
  }


  public static void main(String[] args) {


    // area1
    List<Circle> circles = new ArrayList<>(); // define a Circle list in this class
    circles.add(new Circle(3.0));
    circles.add(new Circle(4.0));
    System.out.println(area1(circles));

    List<Square> squares = new ArrayList<>();
    squares.add(new Square(3.0));
    squares.add(new Square(4.0));
    System.out.println(area1(squares));


    // area2
    List<Shape> shapes = new ArrayList<>();
    shapes.add(new Square(3.0)); // .add method is polymorphasism
    shapes.add(new Circle(4.0));
    System.out.println(area2(shapes));



  }
}
