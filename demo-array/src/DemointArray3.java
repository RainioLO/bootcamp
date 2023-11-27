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
    int[] arr2 = new int[] {100, -20, 4, 100};
    int targetIndex = 1;
    // for loop
    // expected result = {100, 4, 100, 500, -20}
    int temp;
    for(int i = targetIndex; i < arr2.length -1; i++){
      temp = arr2[i];
      arr2[i] = arr2[i+1];
      arr2[i+1] = temp;
    }
    System.out.println(Arrays.toString(arr2));



  }

}
