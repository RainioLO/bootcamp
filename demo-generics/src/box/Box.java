package box;

import java.util.ArrayList;
import java.util.List;

public class Box<T> { // Box can input all types

  public T t; // T is any type, t is attribute in this Box Class


  public T getT() {
    return t; // get the
  }

  public void setT(T t) { // T is any type
    this.t = t;
  }

  public static <T> Box<T> createBox(T t) {
    Box<T> box = new Box<>();
    box.setT(t);
    return box;
  }

  public static double calculate(Box<Shape> box) { // not polymorphism Box<Shape> Box<Circle>
    return box.getT().area(); // .getT() get the shape things in Box
  }

  public static void addSHape(List<Shape> ls, Shape shape) {
    ls.add(shape);
  }

  public static <U extends Shape> void xxx(U u) {
    u.area();

  }

  public static <T extends Shape> void addSHape2(List<? super Shape> ss,
      Shape shape) {
    // ls.add(shape); //error
    // ls.add((T) shape); badbad but ok
    ss.add(new Circle(3.0));
    ss.add(new Shape());

  }

  public static void addShape3(List<? super Circle> ls, Shape shape) { // ls is something that super Circle
    // List<Object> ls2 = (List<Object>) ls;
    ls.add(new Circle(3.0)); // the scope is certain can do upcast
    ls.add(new SmallCircle(2.0));
    // ls.add(new Shape()) // error because super Circle and only below Circle, other cannot be certain like shape, object...

    // ls can point to circle arraylist, maybe add Object in the Circle List --> Die
  }



  public static void main(String[] args) {
    Box<Circle> circleBox = new Box<>(); // Circle object in the box object
    Box<Shape> shapeBox = new Box<>();
    shapeBox.setT(new Circle(3.0)); // set the Type and the value of T // in shape box can new Circle as they are parent
    // System.out.println(calculate(circleBox)); // Box<Circle> can do this
    // calculate(circleBox); // error, Box<Circle> <-> Box<Shape> is not Parent Relationship

    Shape s = new Circle(3.0); // 28.274
    System.out.println(s.area());
    s = new Shape(); // pointer can point to Shape() --> no radius
    System.out.println(s.area()); // -1 // use Shape's method


    List<? extends Object> xs = new ArrayList<Circle>(); // xs can point to different type of ArrayList<>()
    // <? extends Object> bound xs pointer which type can be pointed
    // xs.add(new Circle(3.0));


    // Object o = xs.get(0); // .get(0) is Circle object (upcast)

    List<? extends Shape> ls = new ArrayList<Circle>();
    // List<? extends Shape> written in main Shape Circle
    // ls.add(new Circle(3.0)); // not ensure we can add circle , still can cast
    // ls can point to ArrayList<Circle>() or ArrayList<Shape>()
    // uncertain cannot use .add() method

    // ls is uncertain pointer
    // ls.add(s);
    Shape o2 = ls.get(0);
    ls = new ArrayList<Circle>();


    int max = Integer.MIN_VALUE


  }
}
