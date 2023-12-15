package src;
import java.util.Arrays;

public class Demo2 {
  public static void main(String[] args) {
    
    // move -20 to the tail of the array
    int[] arr2 = new int[] {100, -20, 4, 100, 500};
    int targetIndex = 1;
    // for loop
    // expected result = {100, 4, 100, 500, -20}
    int temp1 = 0;
    for (int i = 0; i < arr2.length; i++) {
        temp1 = arr2[i];
        arr2[i] = arr2[i + 1];
        arr2[i + 1] = temp1;
      }
    }
    System.out.println(Arrays.toString(arr2));



  }
}
