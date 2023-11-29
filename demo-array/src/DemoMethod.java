package src;

public class DemoMethod { // copy this Demo file to compile somewhere to change to .class

  // main -> method name //main is for testing
  // public -> or priate
  // static method -> tool
  // void -> return type (is no return type)
  public static void main(String[] args) { // main 由上到下run // String[] is string array
    // javac -> compile command converting .java file -> .class
    // java -> run .class file
    int x = 2;
    int y = 10;
    x *= 2; // 4
    x += y; // 14
    System.out.println("x=" + x); // 14

    y = 100;
    x = 2;
    x *= 2; // 4
    x += y; // 14
    System.out.println("x=" + x); // 104

    // Trigger Method
    int result10 = sum(10, 3);
    System.out.println(result10);
    System.out.println(sum(2, 4)); // 6
    System.out.println(sum(-10, -30)); // -40

    // find if any method with 3 int put parameters
    int result13 = sum(10, 3, 20); // know how to call the method sum with 3 paramter
    System.out.println(result13);
    int result14 = sum(10, 3, 'c');
    System.out.println("result14 =" + result14);

    double result15 = sum(2.3, 2.5);
    System.out.println("result15= " + result15);


    double price = times(100, 0.3);
    System.out.println("Price= $ " + price);

    double salary = fake9(30000, 13);
    System.out.println("Price= $ " + salary);

    String str = "dhfvbdjfhbv";
    System.out.println(str.length());

    int wallet = minus(1000, 300);
    System.out.println(wallet);

    double result11 = divide(10, 3);
    System.out.println(result11);
    System.out.println(divide(7, 2)); // 3

    double v = (double) 7 / 2; // 3.5 要強行將int 7 做 double
    System.out.println(v);

  }



  // **********Method Creation***********
  // Method name; sum
  // return type: int
  // parameters: Can be no parameter or one or more than one parameters
  // f(x1, x2) = x1 + x2
  // y = x1 + x2
  public static int sum(int x1, int x2) {
    int sum = x1 + x2;
    return sum;

  }

  public static double sum(double x1, double x2) {
    double sum = x1 + x2;
    return sum;

  }

  // Method Signature sum(int a, int b, int c)
  public static int sum(int a, int b, int c) { // method name -> parameters number/ or types
    // int sum = x1 + x2 + x3;
    int total = a + b + c;
    return total; // return type no influence to the method signature

  }


  // Method Signature sum(int a, int b, char c)
  public static int sum(int a, int b, char c) {
    // int sum = x1 + x2 + x3;
    int total = a + b * c;
    return total;

  }

  public static double times(double d1, double d2) {
    double sellingPrice = d1 * d2;
    return sellingPrice;

  }

  public static double fake9(double d1, double d2) {

    double fakesalary = d1 * d2;
    return 0;

  }

  public static int minus(int i1, int i2) {

    int 減 = i1 - i2;
    return 減;

  }

  public static double divide(int i1, int i2) {

    double v = (double) i1 / i2; // double 的 i1
    return v;


  }




  
}
