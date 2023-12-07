package src;

public class Trial1 {

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

    int [] counts = new int [max+1];

    for (int i = 0; i < numbers.length; i++ ){

      counts[numbers[i]]++;

    }


  }



}
