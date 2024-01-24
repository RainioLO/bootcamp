package com.lomboks;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@EqualsAndHashCode
@ToString(onlyExplicitlyIncluded = true) // only includet hose attributes below with . Include
public class Cat {

  @Getter
  @Setter
  @EqualsAndHashCode.Exclude // exclude this attrbutes 
  private double weight;

  @Getter
  private String name;

  @Getter
  @ToString.Include
  private int age;



  public static void main(String[] args) {


    Cat cat1 = new Cat(12.0, "ABC", 6);
    System.out.println(cat1.getWeight() + " " + cat1.getName());
    Cat cat2 = new Cat(4.3, "ABC", 6);

    System.out.println(cat1.equals(cat2)); // true
    System.out.println(cat1.toString()); // Cat(age=6)


  }
}
