
/**
 * Expected Output:
 * 
 * I am going to add two numbers together:
 * The first one: 31
 * The second one: 42
 * The sum is 73
 * The subtraction reuslt is 11
 * The another sum result is 130
 * The variable varB is false
 * The variable varC is true
 * The variable fnumber is -130.2
 * The variable dnumber is -20.5
 * The variable reminder is 1
 * The variable result is 3
 */
// Primitive types and operators
public class JavaQuest1 {

  public static void main(String[] args) {

    System.out.println("I am going to add two numbers together:");
    int first = 31;
    // declare the second one
    int second = 42;

    System.out.println("The first one: " + first);
    System.out.println("The second one: " + second);

    // Add two numbers and print it out
    int sum = first + second;
    System.out.println("The sum is " + (sum));

    // subtraction
    int subtract = -(first - second);
    // subtract = first - second
    System.out.println("The subtraction reuslt is " + subtract);

    // another sum
    byte b1 = 60;
    byte b2 = 70;
    int anothersum = b1 + b2;
    // sum = b1 + b2;
    System.out.println("The another sum reuslt is " + anothersum);

    // declare two boolean variable with true and false value
    boolean varB = false;
    boolean varC = true;
    System.out.println("The variable varB is " + varB);
    System.out.println("The variable varC is " + varC);

    // Reading Example
    float fnumber = -130.20f; // By default, numbers are treated as double in Java.
    // Use suffix 'f' with value to make it float.
    double dnumber = -20.50;
    System.out.println("The variable fnumber is " + fnumber);
    System.out.println("The variable dnumber is " + dnumber);

    // Find reminder. Declare variable a & reminder
    int a = 7;
    int b = 3;
    // Fix it
    int reminder = a%b;
    //int reminder = a - b;
    System.out.println("The variable reminder is " + reminder);

    // declare a variable x and assign value to it.
    int e = 7;
    int o = 8;
    int y = 4;
    int x = 2;
    int result = e - o * x / y;
    System.out.println("The variable result is " + result);
  }
}
