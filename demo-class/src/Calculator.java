import java.math.BigDecimal;
import java.math.RoundingMode;

public class Calculator { // Class to hold variable


  private BigDecimal x;
  private BigDecimal y;

  public Calculator(BigDecimal x, BigDecimal y) { // constructor

    this.x = x;
    this.y = y;

  }

  public double add() { // method

    return x.add(y).doubleValue(); // without affecting self x and y
  }

  public double substract() {

    return x.subtract(y).doubleValue(); // x is rtefering to Class BigDecimal's object so that can call method on object.
  }


  public static Calculator of(double x, double y) {

    return new Calculator(BigDecimal.valueOf(x), BigDecimal.valueOf(y));

  }



  public static void main(String[] args) {


    Calculator calculator =
        new Calculator(BigDecimal.valueOf(0.2), BigDecimal.valueOf(0.1));
    System.out.println(calculator.add()); // usable to the object
    System.out.println(calculator.substract()); // usable to the object
    Calculator c2 = Calculator.of(0.2, 0.1); // static to the class

    // Comparision
    System.out
        .println(BigDecimal.valueOf(0.3).compareTo(BigDecimal.valueOf(0.1))); // 1

    BigDecimal a1 = BigDecimal.valueOf(0.1999);
    BigDecimal a2 = BigDecimal.valueOf(0.2);

    if (a1.compareTo(a2) > 0) {
      System.out.println("a1 > a2");
    } else if (a1.compareTo(a2) == 0) {
      System.out.println("a1 = a2");
    } else if (a1.compareTo(a2) < 0) {
      System.out.println("a1 < a2");
    }


    BigDecimal roundingBigDecimal = BigDecimal.valueOf(10)
        .divide(BigDecimal.valueOf(3), 4, RoundingMode.DOWN)
        .add(BigDecimal.valueOf(5)).subtract(BigDecimal.valueOf(2.1))
        .setScale(2, RoundingMode.DOWN);
    System.out.println(roundingBigDecimal); // 6.23



  }


}
