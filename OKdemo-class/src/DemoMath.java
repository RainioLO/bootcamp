import java.util.Random;

public class DemoMath {
  public static void main(String[] args) {

    System.out.println(Math.pow(2.0d, 10)); // 2^10
    System.out.println(Math.pow(2.0d, -1)); // 1
    System.out.println(Math.pow(2.0d, -2)); // 1
    System.out.println(Math.pow(-2.0d, 3)); // 1


    // abs(), absolute value;
    System.out.println(Math.abs(3.2));
    System.out.println(Math.abs(-3.2));

    // ceil(), floor()
    System.out.println(Math.ceil(3.1));
    System.out.println(Math.floor(3.9));

    System.out.println(Math.round(14.3));
    System.out.println(Math.round(14.6));
    System.out.println(Math.round(14.45));

    int[] arr = new int[] {-2, 20, 100, -40};

    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;

    for (int i = 0; i < arr.length; i++) {

      max = Math.max(arr[i], max);

      if (arr[i] > max) {
        max = arr[i];
      }
    }

    for (int i = 0; i < arr.length; i++) {
      max = Math.max(arr[i], max);
    }


    System.out.println(Math.min(7.5, 6.8));
    System.out.println(Math.sqrt(81));
    System.out.println(Math.sqrt(-81));

    double d1 = Math.sqrt(-81);
    System.out.println(d1);

    if (Double.isNaN(d1))
      ;
    System.out.println("d1 is NaN");

    int random1 = new Random().nextInt(3);
    System.out.println(Math.random()); // 0.0 -1.0 inclusively

    //random 1-10
    int random2 = (int) (Math.random() * 10);
    System.out.println("Random 2: " + random2);
    

    int y = 7;
    y += 3.5; // implicitly downcast
    y = (int) (y+3.5);



  }



}
