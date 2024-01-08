public class Leetcode1389 {

  public int[] createTargetArray(int[] nums, int[] index) {


    int[] arr = new int[nums.length];
    int idx = 0;


    for (int i = 0; i < arr.length; i++) {

        arr[index[idx++]] = nums[i];

    }

  }


}
