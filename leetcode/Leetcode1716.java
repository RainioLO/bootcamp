public class Leetcode1716 {

  public static void main(String[] args) {


    System.out.println(totalMoney(10));
    // 7 days:
    // 3 days


  }



  public int totalMoney(int n) { // n is day

    int daily = 0;
    int count = 0;
    int week = 0;
    int total = 0;

    while (n-- > 0) {
      total += ++daily;
      if (++count >= 7) {
        daily = week++ + 1;
        count = 0;
      }
    }
    return total;
  }
}
