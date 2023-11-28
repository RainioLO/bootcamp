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

      for (int i = 0; i < arr4.length-j-1; i++) {
        if (arr4[i] > arr4[i + 1]) {
          temp = arr4[i];
          arr4[i] = arr4[i + 1];
          arr4[i + 1] = temp;
        }
      }
    }
    System.out.println("Example: " + Arrays.toString(arr4));


  }
}
