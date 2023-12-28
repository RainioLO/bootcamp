package leetcode;

import java.util.Arrays;

public class Leetcode1929 {

  public int[] getConcatenation(int[] nums) {

    int[] arr = Arrays.copyOf(nums, nums.length * 2);
    int idx = 0;
    for (int i = nums.length; i < arr.length; i++) {
      arr[i] = nums[idx++];
    }

    return arr;
  }


}
