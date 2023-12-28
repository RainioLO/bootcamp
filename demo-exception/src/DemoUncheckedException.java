public class DemoUncheckedException {

  private double balance;

  public static void main(String[] args) {
    // Unchecked Exception (Run-time exception)
    // 1. You are not required to handle and unchecked exception thrown in the method

    double result;


    // Example 1: int/int
    try {
      System.out.println("Before");
      // result = divide(10, 0.0d);
      result = 10 / 0;
      System.out.println("After");
    } catch (ArithmeticException e) {
      System.out.println("ArithmeticException"); // reach here
      result = 0.0d;
    }
    System.out.println("result= " + result);
    // _________________________________________________________________________

    // Example 2: double/double --> 10.0/0.0 -> NaN (not an error)
    try {
      System.out.println("Before");
      result = divide(10.3, 0.0d); // differ from 0 // have result in infinity the 0.0d is apprach to 0
      if (Double.isInfinite(result)) {
        System.out.println("result is infinite");
      }
      System.out.println("After");
    } catch (ArithmeticException e) {
      System.out.println("ArithmeticException"); // not reach
      result = 0.0d;
    }
    System.out.println("result= " + result);

  }

  public static double divide(int x, int y) throws ArithmeticException { // handling
    return x / y; // protential runtime exception- ArithmeticException // handle or fix
  }


  public static double divide(double x, double y) {
    return x / y; // /0.0 -> infinity
  }

  public boolean deposit(double amount) {
    if (amount <= 0.0d)
      throw new IllegalArgumentException(); // refuse to recover and throw runtime
    this.balance += amount; // deposit's responsibility
    return true;
  }


}
