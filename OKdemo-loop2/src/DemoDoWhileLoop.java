public class DemoDoWhileLoop {
  public static void main(String[] args) {

    // int j = 0;
    // while (j < 0) {

    // }
    // for (int i = 0; i < 0; i++) {
    // }

    // // Do-while: always excute once, no matter the condition (係唔係都行1次)
    // do {
    //   System.out.println("hello");
    // } while (j < 0);

    // while (++j < 5) {
    //   System.out.println("j= " + j);
    // }

    int j = 0;
    do {
      System.out.println("j= " + (++j)); // ********* ++j can be any action in while loop
    } while (j < 4);



  }
}
