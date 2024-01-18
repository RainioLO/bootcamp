public class Leetcode367 {
  public boolean isPerfectSquare(int num) {

    int sqrt = (int) Math.sqrt(num);
    if (sqrt * sqrt == num){
      return true;
    }
    return false;
  }
}
