import java.util.Arrays;

/**
 * The sum is 55
 */
public class OKJavaQuest7 {
  // Sum values of an array
  public static void main(String[] args) {
    // Declare a int array, with value 1 to 10
    // code here
    int[] arr = new int[10];
    for (int i = 0; i < 10; i++) {
      arr[i] = i + 1;
    }
    System.out.println(Arrays.toString(arr));


    int sum = 0;

    // Write a loop to sum up all value in the int array
    // code here
    for (int i = 0; i < arr.length; i++) {

      sum += arr[i];
    }


    System.out.println("The sum is " + sum);
  }
}
