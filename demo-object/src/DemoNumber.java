import java.math.BigInteger;

public class DemoNumber {

  public static void main(String[] args) {

    Float f1 = Float.valueOf(60000.0f);
    Number n1 = f1; // upcast from Float to Number, n1 is a Number pointer to the float object.....

    System.out.println(n1.shortValue()); // overflow


    // System.out.println(add(1, 2)); // find int -> Integer -> Number
    // self locate the similar

    BigInteger bi1 = add(1, 3);
    BigInteger bi2 = add(2, 5);
    System.out.println(bi1.compareTo(bi2));

  }


  public static BigInteger add(Number x, Number y) {

    long l1 = 0;
    if (x instanceof Long) { // if true --> the x object reference point to an object which is created by Long.class
      l1 = (long) x;

    } else if (x instanceof Short) {
      l1 = (short) x;

    } else if (x instanceof Byte) {
      l1 = (byte) x;

    } else if (x instanceof Integer) {
      l1 = (Integer) x;
    }

    long l2 = 0;
    if (y instanceof Long) {
      l2 = (long) y;

    } else if (y instanceof Short) {
      l2 = (short) y;

    } else if (y instanceof Byte) {
      l2 = (byte) y;

    } else if (y instanceof Integer) {
      l2 = (Integer) y;
    }

    return BigInteger.valueOf(l1 + l2);


  }

  // public static BigInteger add(Integer x, Integer y) { // auto from int to Integer
  // return 2;
  // }

}
