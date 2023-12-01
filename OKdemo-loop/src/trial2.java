public class trial2 {

  public static void main(String[] args) {

    // 0+1+2+3+4+5...+10

    int sum = 0;
    for (int i = 0; i < 11; i++) {
      sum += i;
    }
    System.out.println("Example 1 sum= " + sum);

    // 0+2+4+6+8
    int sum2 = 0;
    for (int i = 0; i < 11; i++) {
      if (i % 2 == 0) {
        sum2 += i;
      }
    }
    System.out.println("Example 2 sum= " + sum2);

    // 0-100
    // i) 0-50, odd -> sum
    // ii) 51-100, even -> another sum2
    // iii) total -> sum1 * sum2

    sum = 0;
    sum2 = 0;

    for (int i = 0; i < 101; i++) {
      if (i < 51) {
        if (i % 2 == 1) {
          sum += i;
        }
      } else {
        if (i % 2 == 0) {
          sum2 += i;
        }
      }
    }
    System.out.println("Example 3: Ans= " + (sum * sum2));

    // add up all odd number from 0-100

    sum = 0;
    for (int i = 0; i < 101; i++) {
      if (i % 2 == 0) {
        continue;
      } else {
        sum += i;
      }
    }
    System.out.println("Example 4: Ans= " + (sum));








    
  }
}
