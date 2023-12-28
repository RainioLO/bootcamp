import java.util.Arrays;

public class Leetcode2160 {

  public int minimumSum(int num) {

    int[] digits = new int[4];
    int idx = 0;
    while (num > 0) {
      digits[idx++] = num % 10;
      num /= 10;
    }

    Arrays.sort(digits);

    int sum1 = 0;
    int sum2 = 0;
    sum1 = digits[0] * 10 + digits[2];
    sum2 = digits[1] * 10 + digits[3];

    return sum1 + sum2;

  }
}
