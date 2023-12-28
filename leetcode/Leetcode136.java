public class Leetcode136 {

  public int singleNumber(int[] nums) {

    int count = 0;
    int[] counter = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
      counter[nums[i]]++;
    }
    for (int i = 0; i < counter.length; i++) {
      if (counter[i] == 1)
        count = i;
    }
    return count;
  }
}
