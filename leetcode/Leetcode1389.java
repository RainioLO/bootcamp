public class Leetcode1389 {

  public int[] createTargetArray(int[] nums, int[] index) {


    int[] arr = new int[nums.length];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = -1;
    }


    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == -1) {
        arr[index[i]] = nums[i];
      }
    }

  }


}
