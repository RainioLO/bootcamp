import java.util.Arrays;

public class Leetcode1365 {
  public int[] smallerNumbersThanCurrent(int[] nums) {

    int counter = 0;
    int[] output = new int[nums.length];

    for (int i = 0; i < nums.length; i++) {
      counter = 0;
      for (int j = 0; j < nums.length; j++) {

        if (nums[i] > nums[j])
          counter++;
      }

      output[i] = counter;

    }
    return output;
  }


}

