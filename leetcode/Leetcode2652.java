public class Leetcode2652 {
  public int sumOfMultiples(int n) {

    int[] arr = new int[n];
    int count = 1;
    for (int i = 0; i < arr.length; i++) {
      arr[0] = count++;
    }

    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] % 3 == 0 || arr[i] % 5 == 0 || arr[i] % 7 == 0) {
        sum += i;
      }
    }
    return sum;
  }
}
