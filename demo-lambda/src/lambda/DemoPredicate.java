package lambda;

import java.util.Objects;
import java.util.function.BiPredicate;
import java.util.function.Function;
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

    Function<Integer, Boolean> predicateFunction = x -> x >= 18; // same idea as predicate

    Predicate<Integer> isOdd = x -> x % 2 == 1; // create "isOdd" object
    System.out.println(isOdd.test(10));

    Predicate<Integer> isEvenAndPositive = x -> x % 2 == 0 && x > 0;

    // Approach 2 (and)
    Predicate<Integer> isPOsitive = x -> x > 0; // set function in a class
    System.out.println(isOdd.and(isPOsitive).test(2)); // false
    System.out.println(isOdd.and(isPOsitive).test(1)); // true
    System.out.println(isOdd.and(isPOsitive).test(-2)); // false

    //
    BiPredicate<Integer, Integer> isGreater = (x, y) -> x + y >= 100;
    System.out.println(isGreater.test(55, 10));

    BiPredicate<String, Integer> isSame = (str, x) -> str.length() == x;
    System.out.println(isSame.test("SEDEDF", 6)); // true

    BiPredicate<String, Integer> isVowel = (str, x) -> { // implement the interface with pointor
      Objects.nonNull(str);
      Objects.nonNull(x);
      if (x > str.length() - 1 || x < 0)
        return false;

      if (str.charAt(x) == 'a' || str.charAt(x) == 'e' || str.charAt(x) == 'i'
          || str.charAt(x) == 'o' || str.charAt(x) == 'u')
        return true;
      return false;
    };


    System.out.println(isVowel.test("hello", 2)); // false
    System.out.println(isVowel.test("hello", 4)); // true
    System.out.println(isVowel.test("hello", -1)); // false
    System.out.println(isVowel.test("hello", 5)); // false
    // System.out.println(isVowel.test(null, null)); java.lang.NullPointerException

    BiPredicate<String, String> isEqual = (s1, s2) -> s1.equals(s2);
    System.out.println(isEqual.test("hello", "hello"));

  }
}
