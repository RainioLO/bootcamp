import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Leetcode26 {
  public int[] removeDuplicates(int[] nums) {
    Set<Integer> set = new HashSet<>();

    for (int i = 0; i < nums.length; i++) {
      set.add(nums[i]);
    }

    int[] array = new int[set.size()];
    int index = 0;
    for (int num : set) {
      array[index++] = num;
    }
    return array;
  }

}
