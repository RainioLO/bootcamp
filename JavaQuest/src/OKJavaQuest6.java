import java.util.Arrays;

public class OKJavaQuest6 {
  /**
   * Expected output: 1 1 2 3 5 8 13 21 ...
   * 
   */
  // Count the target of character in a String.
  public static void main(String[] args) {
    // for loop to print first 15 numbers in Fibonacci Sequence

    int[] arr = new int[15];
    arr[0] = 1;
    arr[1] = 1;
    for (int i = 2; i < arr.length; i++) {
      arr[i] = arr[i - 1] + arr[i - 2];
    }

    System.out.println(Arrays.toString(arr));


  }
}
