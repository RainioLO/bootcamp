package com.lomboks;

import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

// @AllArgsConstructor
@RequiredArgsConstructor
@ToString
public class Dog {

  private final String firstName = "John"; // cannot be changed

  @NonNull // cannot give null value if construct
  private String lastName ;

  @NonNull
  private String color;

  public static void main(String[] args) {
    Dog dog = new Dog("Chan", "Red");
    System.out.println(dog); //Dog(firstName=John, lastName=Chan)

    Dog dog2 = new Dog(null, null);
    System.out.println(dog2); //NullPointerException






  }  
}
