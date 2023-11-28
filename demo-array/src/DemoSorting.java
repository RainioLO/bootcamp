package src;

import java.util.Arrays;

public class DemoSorting {
  public static void main(String[] args) {

    int[] arr = new int[] {100, 4, 1050, 500, -20};
    // 1. Bubble Sort
    int temp = 0;
    for (int i = 0; i < arr.length - 1; i++) { // reset counter
      for (int j = 0; j < arr.length - 1 - i; j++) {
        if (arr[j] > arr[j + 1]) {
          temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
        System.out.println("Example:" + Arrays.toString(arr));
      }
    }
    System.out.println("Final Example:" + Arrays.toString(arr));


    // 2. Insertion Sort

    // int[] arr2 = new int[] {4, 3, 2, 10, 12, 1, 5, 6};

    // for (int j = 0; j < arr2.length - 1; j++)
    // for (int i = 0; i < arr2.length - 1; i++) {
    // if (arr2[i + 1] < arr2[i]) {
    // temp = arr2[i];
    // arr2[i] = arr2[i + 1];
    // arr2[i + 1] = temp;
    // }

    // System.out.println("Example:" + Arrays.toString(arr2));
    // }

    // 2. Insertion Sort
    int j;
    int key;
    int[] arr2 = new int[] {100, -30, 40, 22, 44, -40};
    for (int i = 1; i < arr2.length; i++) { // start from the 2nd element
      j = i - 1;
      key = arr2[i];
      while (j > 0 && arr2[j - 1] > key) {
        arr2[j] = arr2[j - 1];
        j--;
      }
      arr2[j] = key;
      System.out.println("Example:" + Arrays.toString(arr2));
    }
    System.out.println("ff Example:" + Arrays.toString(arr2));






    

  }
}
