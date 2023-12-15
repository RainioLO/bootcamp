import java.util.Arrays;

public class Leetcode1480 {


  public int[] runningSum(int[] nums) {

    int[] arr = new int[nums.length];
    int addition = nums[0];
    arr[0] = nums[0];

    for (int i = 1; i < nums.length; i++) {

      arr[i] = nums[i] + addition;
      addition = arr[i];

      // arr[0] = nums[0];
      // arr[1] = nums[0] + nums[1];
      // arr[2] = nums[0] + nums[1] + nums[2];

    }
    return arr;

  }


}
