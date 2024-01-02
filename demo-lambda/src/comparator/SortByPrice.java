package comparator;

import java.util.Comparator;

public class SortByPrice implements Comparator<Ball> {

  @Override
  public int compare(Ball b1, Ball b2) {
    return b1.getPrice() > b2.getPrice() ? 1 : -1; // accending
  }

}
