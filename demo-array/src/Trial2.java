package src;

public class Trial2 {
  public static void main(String[] args) {

    // Topic 1a Find max, min in the array

    int[] arr = new int[] {2, 5, 9, 28, 4, 87, 56, 38, 9, 55, 67, 23, 69};

    int max = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    System.out.println("Topic 1a: max = " + max);

    // Topic 1b Find the second max
    max = Integer.MIN_VALUE;
    int secondmax = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      } else if (arr[i] > secondmax) {
        secondmax = arr[i];
      }
    }
    System.out.println("Topic 1b: secondmax= " + secondmax);

    // Topic 2 ASCII // int a char to behind the ascii table

    char secret = 'a';
    int secretbehind = secret;
    System.out.println("Topic 2: " + secretbehind);









    
  }
}
