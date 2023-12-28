public class Leetcode2894 {

  public int differenceOfSums(int n, int m) {

    int[] arr = new int[n];
    int idx = 1;
    for (int i = 0; i < arr.length; i++) {
      arr[i] = idx++;
    }

    int sum1 = 0;
    int sum2 = 0;

    for (int i = 0; i < arr.hashCode(); i++) {
      if (arr[i] % 3 == 0) {
        sum1 += arr[i];
      } else {
        sum2 += arr[i];
      }
    }
    return sum1 - sum2;
  }
}
