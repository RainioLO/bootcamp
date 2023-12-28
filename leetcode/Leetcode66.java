import java.util.Arrays;

public class Leetcode66 {

  public static int[] plusOne(int[] digits) {

    StringBuilder sb = new StringBuilder();
    for (int i : digits) {
      sb.append(i);
    }
    int intValue = Integer.parseInt(sb.toString());
    intValue++;

    sb = new StringBuilder(String.valueOf(intValue));

    int[] intArray = new int[sb.length()];
    for (int i = 0; i < sb.length(); i++) {
      intArray[i] = Character.getNumericValue(sb.charAt(i));
    }

    return intArray;

  }


  public static void main(String[] args) {

    int[] arr = new int[] {9, 9, 9, 9, 9, 9};

    System.out.println(Arrays.toString(plusOne(arr)));



  }
}

