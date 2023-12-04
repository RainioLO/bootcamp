
/**
 * Case 1: [2,7,11,15] Target: 9 Ans: [0, 1] or [1, 0]
 * 
 * Case 2: [3,2,4] Target: 6 Ans: [1, 2] or [2, 1]
 *
 * Case 3: [3, 3] Target: 7 Ans: [-1, -1]
 */
public class JavaQuest12 {
  // Given an array of integers nums and an integer target, return the index of
  // the two numbers such that they add up to target.

  // You may assume that each input would have exactly one solution OR no
  // solution, and you may not use the same element twice.

  // If no solution, return [-1, -1]

  // You can return the answer in any order.

  // Do not change anything in main method
  public static void main(String[] args) {
    int[] answers = twoSum(new int[] { 2, 7, 11, 15 }, 9); // {2, 7, 11, 15} is the dataset, 9 is the target to sum
    int[] answers2 = twoSum(new int[] { 3, 2, 4 }, 6); // {3, 2, 4} is the dataset, 6 is the target to sum
    int[] answers3 = twoSum(new int[] { 3, 3 }, 7); // {3, 3} is the dataset, 7 is the target to sum
  }

  // Code a method here to return an array of two numbers that sum up to the
  // target

}
