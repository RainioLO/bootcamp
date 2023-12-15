package src;

import java.util.Arrays;

public class DemointArray3 {
  public static void main(String[] args) {

    int[] arr = new int[] {100, -100, 34};

    // for loop
    // {-100, 100, 34}

    for (int i = 0; i < arr.length; i++) {

      int temp = 0;
      if (i == 0) {
        temp = arr[i]; // 抄出來, arr[i] 已抄在temp
        arr[i] = arr[i + 1];
        arr[i + 1] = temp;
      }
    }

    System.out.println(Arrays.toString(arr));

    // move -20 to the tail of the array
    int[] arr2 = new int[] {100, -20, 4, 100, 500};
    int targetIndex = 1;
    // for loop
    // expected result = {100, 4, 100, 500, -20}
    int temp;
    for (int i = targetIndex; i < arr2.length - 1; i++) {
      temp = arr2[i];
      arr2[i] = arr2[i + 1];
      arr2[i + 1] = temp;
    }
    System.out.println(Arrays.toString(arr2));


    // Find Max value, and move to the tail
    int[] arr3 = new int[] {100, 4, 1050, 5000, 500, -20};
    int max = Integer.MIN_VALUE;
    int maxIndex = -1;

    for (int i = 0; i < arr3.length; i++) {
      if (arr3[i] > max) {
        max = arr3[i];
        maxIndex = i; //
      }
    }
    temp = arr3[maxIndex];
    arr3[maxIndex] = arr3[arr3.length - 1];
    arr3[arr3.length - 1] = temp;
    System.out.println(Arrays.toString(arr3));

    // ANS
    // for (int i = 0; i < arr3.length; i++) {

    // if (arr3[i] > max) {
    // max = arr3[i];
    // }
    // for (int i2 = 0; i2 < arr3.length; i2++) {
    // temp = arr3[i2];
    // if (max == arr3[i2]) {
    // arr3[i2] = arr3[arr3.length - 1];
    // arr3[arr3.length - 1] = temp;
    // }
    // }
    // }

    // Approach 2:
    int[] arr4 = new int[] {100, 4, 1050, 500, -20};
    // {4, 100, 1050, 500, -20}
    // {4, 100, 1050, 500, -20}
    // {4, 100, 500 ,1050, -20}
    // {4, 100 ,500 ,-20, 1050}
    max = Integer.MIN_VALUE;

    for (int j = 0; j < arr4.length; j++) {

      for (int i = 0; i < arr4.length - j - 1; i++) {
        if (arr4[i] > arr4[i + 1]) {
          temp = arr4[i];
          arr4[i] = arr4[i + 1];
          arr4[i + 1] = temp;
        }
      }
    }
    System.out.println("Example: " + Arrays.toString(arr4));

    String s = "abcabcabcabcabc";
    char[] arr5 = new char[s.length()];

    for (int i = 0; i < s.length(); i++) {
      arr5[i] = s.charAt(i); // 將String倒入去
    }
    System.out.println("arr5 = " + Arrays.toString(arr5));


    // Approach 2
    char[] arr6 = s.toCharArray(); //

    // replace a -> c (string)
    // "abcabcabcabcabc"
    // "cbccbccbccbccbc"
    char[] arr7 = new char[s.length()];
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == 'a') {
        arr7[i] = 'c';
        continue;

      }
      arr7[i] = s.charAt(i);
    }
    System.out.println("arr7 = " + Arrays.toString(arr7));
    System.out.println(String.valueOf(arr7));

    String str = "hello";  //直接比value
    str = new String ("hello"); // for 8 class
    str = String.valueOf("hello"); // for 8 class for initialization

    System.out.println(String.valueOf(1));
    System.out.println(String.valueOf(1.0d));
    System.out.println(String.valueOf(new char [] {'a', 'b'})); //ab // the valueOf willl become the String .....
    // System.out.println(String.valueOf (new int [] {1,2,3})); //not ok


    // Replace String Method
    String str4 = "abcabcabcabcabc"; //String 底層都是char
    String result4 = str4.replace('a', 'c'); // replace 'a' by 'c'
    System.out.println("str4= " + str4); // str4 不受影響
    System.out.println("result4= " + result4);

    //replace a pattern "ab" by "ij" / 'a' by 'b'
    System.out.println(str4.replace("ab", "ij"));
    




  }
}
