package comparator;

import java.util.Comparator;

public class SortByColor implements Comparator<Ball> {

  @Override
  public int compare(Ball b1, Ball b2){
    return b2.getColor().name().compareTo(b1.getColor().name()); // comparing the String gives -1, 0 ,1 
  }  // decending order
  
}
