package com;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import com.uitest.Calculator;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
// the whole class seem to be the same
// like only 1 instance

public class Calculator2Test {

  private int value;

  // @BeforeAll
  // before all test cases
  // void beforeAll(){

  // }

  // @BeforeAll
  // void beforeAll() {
  //   this.value = 10000;
  //   System.out.println("PerClass beforeAll:" + this.value);
  // }

  // @BeforeEach
  // void initialize() {
  // this.value = 100;
  // }

  @AfterEach
  void afterEach() {
    this.value -= 10;
  }

  @Test
  @Order(1)
  void testAdd() {
    this.value = Calculator.add(2, 3);
    assertEquals(5, this.value);// 5
  }

  @Test
  @Order(2)
  void testSubstract() {
    this.value = Calculator.substract(this.value, 10);
    assertEquals(-15, this.value);
  }


  public static void main(String[] args) {
    Calculator2Test calculator2 = new Calculator2Test();
    calculator2.testAdd();
    calculator2.testSubstract();

  }



}
