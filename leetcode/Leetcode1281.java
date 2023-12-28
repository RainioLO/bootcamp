public class Leetcode1281 {

  public int subtractProductAndSum(int n) {


    int length = String.valueOf(n).length();
    int[] digits = new int[length];

    for (int i = length - 1; i >= 0; i--) {
      digits[i] = n % 10;
      n /= 10;
    }

    int products = 1;
    int sum = 0;

    for (int i = 0; i < digits.length; i++) {
      products *= digits[i];
    }

    for (int i = 0; i < digits.length; i++) {
      sum += digits[i];
    }
    return products - sum;
  }

}

