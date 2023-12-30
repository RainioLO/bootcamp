package lambda;

import java.util.function.Predicate;

public class DemoPredicate {


  public static void main(String[] args) {
    int age = 17;
    // boolean isAdult = age >= 18;
    // System.out.println(isAdult); // false


    // lambda boolean
    // get a T to return boolean
    Predicate<Integer> isAdult2 = x -> x >= 18;
    System.out.println(isAdult2.test(17)); // false
    System.out.println(isAdult2.test(18)); // true
    System.out.println(isAdult2.test(19)); // true

    
  }
}
