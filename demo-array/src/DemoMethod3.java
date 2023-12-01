package src;

import java.util.Arrays;

public class DemoMethod3 {

  public static void main(String[] args) {

    int[] beforeArr = new int[] {3, 5, 10}; // 3,5,10 is array object. arr is the object address
    System.out.println("Example 1: " + sum(beforeArr)); // find arr address to get the object

    System.out.println("before add () = " + Arrays.toString(beforeArr));
    int [] afterArr = addOne(beforeArr);
    System.out.println("afterArr AddOne():" + Arrays.toString(beforeArr));
    System.out.println("afterArr AddOne():" + Arrays.toString(afterArr));


    String before = "abc";
    System.out.println("before= " + before); //abc

    String after = concatHello2(before); 

    System.out.println("before= " + before); //abc
    System.out.println("after= " + after); //abchello



  }




  public static int sum(int[] arr) {

    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }

    return sum;

  }

  // public static int[] addOne(int[] arr) {


  //   int[] arr2 = new int[arr.length];
  //   for (int i = 0; i < arr.length; i++) {
  //     arr2[i] = arr[i] + 1;
  //   }

  //   return arr2;

  // }



  // Wrong Method
  public static int [] addOne(int[] arr) {

    for (int i = 0; i < arr.length; i++) {
      arr[i]++;
    }

    return arr;

  }

// Correct approach
  public static void addOne2(int[] arr) { // Pass by Reference

    for (int i = 0; i < arr.length; i++) {
      arr[i]++;
    }

    // return; (return nothing can no write)
  }


// Wrong Approach
  public static void concatHello (String s) { // s is local variable, can not take effective outside
  s = s.concat("hello");

}

// Correct Approach
  public static String concatHello2 (String s) { // s is local variable, can not take effective outside
  s = s.concat("hello");
  return s;

}

// Primitives + wrapper Classes + String (17 types) -> Pass by value (將結果比人地, 要return)
// array and classes -> pass by reference (因為不用下下copy array and classes, 比地址)


}



