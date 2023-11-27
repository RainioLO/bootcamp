package src;

public class DemoIntArray2 {
  public static void main(String[] args) {

    int[] arr = new int[] {10, 16, 8, 11, 4, 3}; // only the same type for array
    // for loop -> sum

    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }
    System.out.println("sum=" + sum);

    // Find the max value
    int max = Integer.MIN_VALUE; // take the minimum value
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    System.out.println("max: " + max);


    int min = Integer.MAX_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < min) {
        min = arr[i];
      }
    }
    System.out.println("min: " + min);

    // second max value
    max = Integer.MIN_VALUE;
    int secondMax = Integer.MIN_VALUE;

    // 10, 16, 8
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        secondMax = max; // second max will be kicked out
        max = arr[i];
      } else if (arr [i]>secondMax) {
        secondMax = arr [i];

      }
    }
    System.out.println("second max: " + secondMax);







    

  }
}
