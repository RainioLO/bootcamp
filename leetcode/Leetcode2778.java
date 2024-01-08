public class Leetcode2778 {
  
  public int sumOfSquares(int[] nums) {
    int sum = 0;
        for (int i = 0; i< nums.length; i++){
            if (nums.length % nums[i] == 0){
                sum += Math.pow(nums[i], 2);
            }
        }
        return sum;
    }
}
