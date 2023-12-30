
/*Given a positive integer num, return true if num is a perfect square or false otherwise.

A perfect square is an integer that is the square of an integer. In other words, it is the product of some integer with itself.

You must not use any built-in library function, such as sqrt.

*/
/*Example 1:

Input: num = 36
Output: true
Explanation: We return true because 6 * 6 = 36 and 6 is an integer.

Example 2:

Input: num = 14
Output: false
Explanation: We return false because 3.742 * 3.742 = 14 and 3.742 is not an integer. */
/*Constraints: 1 <= num <= 231 - 1*/
public class JavaQuest27 {
  public static void main(String[] args) {
    System.out.println(isSquare(16)); // true
    System.out.println(isSquare(25));// true
    System.out.println(isSquare(121));// true
    System.out.println(isSquare(99));// false

  }

  public static boolean isSquare(int num) {
    // code here ...
  }

}