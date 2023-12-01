public class trial {
  public static void main(String[] arga) {

    // continue
    // sum up all odd number (100)

    int sum = 0;
    for (int i = 0; i < 101; i++) {
      if (i % 2 == 0) {
        continue;
      }
      sum += i;
    }
    System.out.println("sum=" + sum);

    // 0-100
    // i) 0-50, odd -> sum
    // ii) 51-100, even -> another sum2
    // iii) total -> sum1 * sum2
    int sum1 = 0;
    int sum2 = 0;

    for (int i = 0; i < 101; i++) {

      if (i < 51) {
        if (i % 2 == 1) {
          sum1 += i;
        }
      } else {
        if (i % 2 == 0) {
          sum2 += i;
        }
      }
    }
    System.out.println("total:" + sum1 * sum2);


    // abc pol ijk def xyz
    // find 'f' at whcih nth character

    String str = "abc pol ijk def xyz";

    char target = 'b';
    int n = 0;
    boolean found = true;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == target) {
        n = i + 1;
      }
    }
    if (found) {
      System.out.println("found " + target + " at " + n + " th character");
    } else {
      System.out.println("Not found");

    }



  }
}
