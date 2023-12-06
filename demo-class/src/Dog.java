public class Dog {

  public static int sum(Integer... integers) {
    int sum = 0;
    for (Integer i : integers) {
      sum += i;
    }
    return sum;
  }

  public static int sum2(int[] integers) {
    int sum2 = 0;
    for (Integer i : integers)
      sum2 += i;
    return sum2;
  }



  public static void main(String[] args) {
    System.out.println(sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

    int[] arr = new int[] {1, 2, 3, 4, 5};
    System.out.println(sum2(arr));


  }
}
