import java.math.BigInteger;

public class App {

  // public static Double calculate(Number u1, Number u2) {

  // }

  // public static Object sum(Object k1, Object k2) {

  // }

  // <K> is just like the topmost Class object
  // need to extends and give a range
  public static <K> K sum(K k1, K k2) { // <K> describles the scope of K object
    return k1;
  }

  public static <U extends Number> Double calculate(U u1, U u2) { // for readability
    // <U extends Number> is the type of the parameter u1, u2
    // Integer result = (Integer) u1 + (Integer) u2; // risky
    // return (U) result; // downcast

    // Byte, Short, Integer, Long, Float, Double
    // instanceof to check the type of U

    // public static BigInteger add(Number x, Number y) {

    double result = 0;

    // dunno if exactly the Class
    if (u1 instanceof Integer) { // if true --> the x object reference point to an object which is created by Long.class
      result += (Integer) u1;

    } else if (u1 instanceof Short) {
      result += (Short) u1;

    } else if (u1 instanceof Byte) {
      result += (Byte) u1;

    } else if (u1 instanceof Long) {
      result += (Long) u1;

    } else if (u1 instanceof Double) {
      result += (Double) u1;

    } else if (u1 instanceof Float) {
      result += (Float) u1;
    }


    if (u2 instanceof Integer) { // if true --> the x object reference point to an object which is created by Long.class
      result += (Integer) u2;

    } else if (u2 instanceof Short) {
      result += (Short) u2;

    } else if (u2 instanceof Byte) {
      result += (Byte) u2;

    } else if (u2 instanceof Long) {
      result += (Long) u2;

    } else if (u2 instanceof Double) {
      result += (Double) u2;

    } else if (u2 instanceof Float) {
      result += (Float) u2;
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println(calculate(1, 2));
    // System.out.println(calculate(1.2, 2.3)); //error

    Long x = (long) Integer.valueOf("10"); // unbox to int -> (long) -> autobox to Long

    System.out.println(calculate(10.33, 10.33));
    // System.out.println(calculate(1.2, 2.3)); // Double cannot be cast to class



  }
}
