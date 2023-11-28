package src;

public class trial1 {
  public static void main(String[] args) {

    int max = Integer.MIN_VALUE;
    int maxIndex = 0;
    int[] arr = new int[] {100, 4, 1050, 500, -20};
    // {4, 100, 1050, 500, -20}
    // {4, 100, 1050, 500, -20}
    // {4, 100, 500 ,1050, -20}
    // {4, 100 ,500 ,-20, 1050}
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
        maxIndex = i;
      }
    }



  }
}
