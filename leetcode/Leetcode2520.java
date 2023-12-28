public class Leetcode2520 {
  public int countDigits(int num) {

    String numString = Integer.toString(num);

    int[] digits = new int[numString.length()];

    for (int i = 0; i < digits.length; i++) {
      digits[i] = numString.charAt(i) - '0';
    }

    int counter = 0;
    for (int i = 0; i < digits.length; i++) {
      if (num % digits[i] == 0) {
        counter++;
      }
    }
    return counter;
  }

}
