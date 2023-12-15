public class Leetcode1464 {

  public int maxProduct(int[] nums) {

    int max = Integer.MIN_VALUE;
    int secondMax = Integer.MIN_VALUE;
    int product = 0;

    for (int i = 0; i < nums.length; i++) {

      if (nums[i] > max) {
        secondMax = max;
        max = nums[i];
      } else if (nums[i] > secondMax) {
        secondMax = nums[i];
      }
      product = (max - 1) * (secondMax - 1);
    }

    return product;
  }



}


