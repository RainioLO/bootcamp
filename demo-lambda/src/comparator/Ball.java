package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ball {

  private Color color;
  private double price;

  public Ball() {

  }

  public Ball(Color color, double price) {
    this.color = color;
    this.price = price;
  }

  public Color getColor() {
    return this.color;
  }

  public double getPrice() {
    return this.price;
  }

  @Override
  public String toString() {
    return "Ball(Price= $" + this.price + " Color=" + this.color.name() + ")"; // ,name() for enum
  }

  public static void main(String[] args) {

    List<Ball> ballList = new ArrayList<>(
        List.of(new Ball(Color.BLUE, 20.2), new Ball(Color.RED, 30.1),
            new Ball(Color.GREEN, 30.1), new Ball(Color.BLUE, 111)));

    // Approach 1 // create a SortByColor Class implementing Comparator <Ball>
    Collections.sort(ballList, new SortByColor()); // the new object SortByColor must have comparator
    System.out.println(ballList);

    Collections.sort(ballList, new SortByPrice()); // accending
    System.out.println(ballList);

    // Approach 2
    // *** create comparator inside the class by lambda
    // 1. implementing the logic of the required method // implement the Comparator interface
    // 2. new the object with the implementation
    Comparator<Ball> sortByColor = (b1, b2) -> {
      return b2.getColor().name().compareTo(b1.getColor().name()); // already new the sortByColor
    };

    Comparator<Ball> sortByPrice = (b1, b2) -> {
      return b2.getPrice() > b1.getPrice() ? 1 : -1;
    };

    Comparator<Ball> sortByColorAndThenPrice = // interface in class
        sortByColor.thenComparing(sortByPrice); // use thenComparing method from comparator<T> interface

    Collections.sort(ballList, sortByColorAndThenPrice); // sort color first and then price
    System.out.println(ballList);



  }


}
