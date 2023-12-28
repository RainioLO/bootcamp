public class Leetcode2011 {
  public int finalValueAfterOperations(String[] operations) {

    int x = 0;
    for (int i = 0; i < operations.length; i++) {
      if (operations[i].charAt(1) == '+')
        x++;
      if (operations[i].charAt(1) == '-')
        x--;
    }
    return x;
  }
}
