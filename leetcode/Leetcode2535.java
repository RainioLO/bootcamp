import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode2535 {

   public int differenceOfSum(int[] nums) {
        
        int elementSum = 0;
        int digitSum = 0;

        for(int i = 0; i< nums.length; i++){
            elementSum += nums[i];
        }

        List<Integer> convertedList = new ArrayList<>();
        for (int number : nums) {
            if (number > 9) {
                String numberString = String.valueOf(number);
                for (int i = 0; i < numberString.length(); i++) {
                    int digit = Integer.parseInt(String.valueOf(numberString.charAt(i)));
                    convertedList.add(digit);
                }
            } else {
                convertedList.add(number);
            }
        }

        int[] convertedArray = convertedList.stream().mapToInt(Integer::intValue).toArray();

        for (int i = 0; i < convertedArray.length; i++){
            digitSum += convertedArray[i];
        }
        return Math.abs(elementSum-digitSum);
    }
  
}
