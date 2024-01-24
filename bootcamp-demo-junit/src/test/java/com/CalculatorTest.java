package com;

import static org.junit.jupiter.api.Assertions.*; // import all things here in the class
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
// static method just like the instance method in the class
// Junit 5 -> org.junit.jupiter
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import com.lomboks.Order;
import com.lomboks.Person;
import com.uitest.Calculator;

// Unit Classs
// beforeEach = beforeAll
// each time 1 new instance
@TestInstance(TestInstance.Lifecycle.PER_METHOD) // default setting// each method will create a new instance 
public class CalculatorTest {

  private int value = 10;
  private static int z = 50;

  @BeforeAll
  static void beforeAll() { //must be static
    z += 10; // execute one time only before all method
    System.out.println("z=" + z);
  }

  @BeforeEach
  void initialize() {
    this.value = 100;
    System.out.println("Before each: this.value = " + this.value);
  }


  // inside the class, no need let other class know
  @Test // mark this mvn will trigger this method during "test" phase
  void testAdd() {
    int actualResult = Calculator.add(3, 2); // call the static method
    int expectedResult = 5;
    assertEquals(expectedResult, actualResult); // static import
    assertNotEquals(6, Calculator.add(3, 2));
    assertNotEquals(4, Calculator.add(3, 2));

    String s1 = "hello";
    String s2 = "hello";
    assertSame(s1, s2); // checking if they are the same object

    String s3 = new String("hello");
    assertNotSame(s2, s3); // checking if they are not same

    // Person equals()
    Person x1 = new Person("Jason", 30);
    Person x2 = new Person("Jason", 30);
    assertNotSame(x1, x2);
    assertEquals(x1, x2);


    // assertThrow
    assertThrows(IllegalArgumentException.class,
        () -> Person.concat(null, null));

    // assertDoesNotThrow
    assertDoesNotThrow(() -> Person.concat("abc", "def"));
    assertDoesNotThrow(() -> Person.concat(null, "def"));

    Order order = new Order();
    assertAll(() -> order.order(), () -> order.payment(),
        () -> order.isInventoryLocked());

    // assertTimeout
    List<String> items = new ArrayList<>();
    for (int i = 0; i < 1_000_000; i++) {
      items.add(String.valueOf(i));
    }
    assertTimeout(Duration.ofMillis(100), () -> order.placeOrder(items));

    value++;
    System.out.println(value);
  }


  @Test // mvn test will also hit here with test notation
  // like the coordination
  void testOther() {
    assertTrue(5 > 3);
    value++;
    System.out.println(value);
  }



  public static void main(String[] args) {

    // By default, the unit testing will be performed by instance & and instance method
    CalculatorTest calculatorTest = new CalculatorTest();
    calculatorTest.testAdd();
    System.out.println(calculatorTest.value);
    CalculatorTest calculatorTest2 = new CalculatorTest();
    calculatorTest2.testOther();
    System.out.println(calculatorTest2.value);


  }
}
