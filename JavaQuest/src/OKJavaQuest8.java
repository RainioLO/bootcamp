/**
 * Example Output Second Max = 230
 */
public class OKJavaQuest8 {
  // Write a loop to find the second max number.
  public static void main(String[] args) {
    int[] nums = new int[] {-10, 5, 100, 240, 230, 80}; // Second Max = 230
    int[] nums2 = new int[] {-10, 5, 100, 120, 240, 200}; // Second Max = 200
    int[] nums3 = new int[] {-10, 5, 120, -100, 100, 240}; // Second Max = 120
    int[] nums4 = new int[] {-10, 5, 100, 240, 240, 80}; // Second Max = 240

    // Your program should be able to handle all the above test case.
    int secondMax;
    // code here

    System.out.println(secondMax(nums));
    System.out.println(secondMax(nums2));
    System.out.println(secondMax(nums3));
    System.out.println(secondMax(nums4));
  }

  public static int secondMax(int[] num) {
    int max = Integer.MIN_VALUE;
    int secondMax = Integer.MIN_VALUE;

    for (int i = 0; i < num.length; i++) {

      if (num[i] > max) {
        secondMax = max;
        max = num[i];
      } else if (num[i] > secondMax) {
        secondMax = num[i];
      }

    }
    return secondMax;
  }



}
