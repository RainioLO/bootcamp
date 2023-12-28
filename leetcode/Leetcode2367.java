public class Leetcode2367 {
  
  public int arithmeticTriplets(int[] nums, int diff) {
    int counter =0;
    for(int i = 0; i < nums.length; i++){
      for(int j = i +1; j < nums.length; j++){
        for(int k = i +2; k < nums.length; k++ ){
          if(nums[j]-nums[i]== diff && nums[k]-nums[j]== diff)
          counter++;
        }
      }
    }
    return counter;
  }
}
