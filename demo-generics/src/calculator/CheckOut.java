package calculator;

import java.util.List;

public class CheckOut {

  // call formula ()
  // Force the method caller to pass an object implementing Calculator Interface

  //
  public static <T extends Adjustment> double calculate(List<T> items, double adjustment) { // <T> can be anything
    //<T extends Adjustment> can only be Adjustment T extends an interface
    double total = 0.0d;
    for (T item : items) {
      total += item.adjust(adjustment); //       total += item.adjust(adjustment); not ok if T is not locked...
    } // can call .adjust because T is bounded by a contract Adjustment.class, know which method can be called from
    return total;
  }

  public static void main(String[] args) {



  }
}
