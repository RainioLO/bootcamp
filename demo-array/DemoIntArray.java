public class DemoIntArray {
  public static void main(String[] args) {
    int age1 = 20;
    int age2 = 25;
    int age3 = 30;
    int age4 = 30;

    // define an array to stor a list of int number
    // This array can only store int number
    int[] arr = new int[9]; // within [length of array], by index 0-8 // *****底層結構*****
    // assignment
    arr[0] = 20;
    System.out.println("arr[0]=" + arr[0]);
    arr[1] = 25;
    System.out.println("arr[1]=" + arr[1]);
    arr[2] = 30;
    System.out.println("arr[2]=" + arr[2]);
    arr[3] = 30;
    arr[3] = 29;
    System.out.println("arr[3]=" + arr[3]);

    // arr[8] = 30;
    System.out.println("arr[8]=" + arr[8]);

    int a; // local variable, should be assigned before use
    a = 1; // explicitly assignment
    System.out.println(a); // you have to explicitly assign value before using it.

    // int [] arr1 = new int [10];
    // arr1 [0] =


    int[] arr2 = new int[5]; // fixed length --> 預留5格 --> 可以快找回
    int[] arr3 = new int[] {100, 5, 30, 9, -40};

    double[] arr4 = new double[] {1.2, 4, 5.6, 4, 23.0};

    System.out.println(arr2.length);

    arr2 = new int[10]; //己是全新的array, 原本沒有了 // arr2 是一個路標
    System.out.println(arr2.length);

    // array supports for loop

// 8 primitivs + String
// char []
// boolean []
// String []

String [] arrString = new String [] {"Hello", "World", "year", "Now", "then"};

System.out.println(arrString [0]);
System.out.println(arrString [4]);


boolean [] Q1Result = new boolean [] {true, false, false, true, false};

System.out.println (Q1Result [2]);


  }
}
