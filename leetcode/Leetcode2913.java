import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class Leetcode2913 {
  public int sumCounts(List<Integer> nums) {

    int sum = 0;

    for (int i = 0; i < nums.size(); i++) {
      sum += 1;
      HashSet<Integer> mp = new HashSet<>();
      mp.add(nums.get(i));
      for (int j = i + 1; j < nums.size(); j++) {
        mp.add(nums.get(j));
        sum += Math.pow(mp.size(), 2);
      }
    }
    return sum;
  }
}
