import java.util.HashSet;

public class Leetcode136 {

  public int singleNumber(int[] nums) {

      HashSet<Integer> uniqueNumbers = new HashSet<>();
      HashSet<Integer> duplicateNUmbers = new HashSet<>();

      for(int number : nums){
          if (!uniqueNumbers.add(number)){
              duplicateNUmbers.add(number);
          }
      }
      uniqueNumbers.removeAll(duplicateNUmbers);
      return uniqueNumbers[0];

  }
}
