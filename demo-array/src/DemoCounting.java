package src;

public class DemoCounting {
  public static void main(String[] args) {

    int[] numbers = new int[] {10, 2, 200, 2000, 2000, 2, 2};
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] > max) {
        max = numbers[i];
      }
      if (numbers[i] < min) {
        min = numbers[i];
      }
    }
    System.out.println(max);
    System.out.println(min);

    int[] counts = new int[max - min + 1]; // find range from min and max, then 開array
    for (int i = 0; i < numbers.length; i++) {
      counts[numbers[i] - min]++;
    }
    int maxCount = 0;
    for (int i = 0; i < counts.length; i++) {
      if (counts[i] != 0 && counts[i] > maxCount) {
        maxCount = counts[i];

      }
    }
    System.out.println("Max.count " + maxCount); // 3



    String str = "abcabcdpolxyzaa";

    int counts2[] = new int[26];
    char maxChar = ' ';
    maxCount = 0;

    for (int i = 0; i < str.length(); i++) {
      counts2[str.charAt(i) - 'a']++; // 'a' - 'a' -> 97-97 ->0
    }
    maxCount = 0;
    for (int i = 0; i < counts2.length; i++) {
      if (counts2[i] != 0 && counts2[i] > maxCount) {
        maxCount = counts2[i];
        maxChar = (char) (i + 'a'); //i -> int value

      }

    }
      System.out.println("Max count=" + maxCount + ", char=" + maxChar);
  }
}

