import java.math.BigDecimal;

public class DemoBigDecimal { // BifDecimal for calculation


  public static void main(String[] args) {

    // Problem statement
    double d = 0.2 + 0.1;
    System.out.println("d= " + d);

    if (d > 0.3)
      System.out.println("d > 0.3");


    // Solution
    BigDecimal bd1 = new BigDecimal("0.2");
    BigDecimal bd2 = new BigDecimal("0.1");
    BigDecimal bd3 = bd1.add(bd2);
    System.out.println("bd3= " + bd3.doubleValue());

    BigDecimal bd4 = BigDecimal.valueOf(0.2);
    BigDecimal bd5 = BigDecimal.valueOf(0.1);
    BigDecimal bd6 = bd4.add(bd5);
    System.out.println("bd6= " + bd6.doubleValue());
    System.out.println("bd4= " + bd4.doubleValue());

    // Problem Statement: Substration (0.3-0.1)
    double s2 = 0.3 - 0.1;
    System.out.println(s2); // 0.19999999999999998

    BigDecimal b1 = BigDecimal.valueOf(0.3).subtract(BigDecimal.valueOf(0.1)); // this returns BigDecimal's object
    System.out.println("b1: " + b1.doubleValue());

    // multiply 0.1 * 0.2

    double s3 = 0.1 * 0.2;
    System.out.println("s3: " + s3);

    BigDecimal b2 = BigDecimal.valueOf(0.1).multiply(BigDecimal.valueOf(0.2)); // BigDecimal is a blueprint, b2 is a pointer, can use .method
    System.out.println("b2: " + b2.doubleValue());

    BigDecimal b3 = BigDecimal.valueOf(0.3).divide(BigDecimal.valueOf(0.1));
    System.out.println("b3: " + b3.doubleValue()); // b3 is always an address to object so can use method.


    // divide 0.3/0.1


    System.out.println("Trial: " + sum(0.2, 0.1));

  }


  public static double sum(double d1, double d2) {
    return BigDecimal.valueOf(d1).add(BigDecimal.valueOf(d2)).doubleValue();

  }



}
