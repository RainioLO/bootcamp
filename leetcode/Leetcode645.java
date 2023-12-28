public class Leetcode645 {
  public int[] findErrorNums(int[] nums) {

    int[] arr = new int[2];
    for (int i = 0; i < nums.length - 1; i++) {

      if ((nums[i + 1] - nums[i]) != 1) {

        arr[0] = i + 1;
        arr[1] = i + 2;
        break;
      }
    }
    return arr;
  }

}
