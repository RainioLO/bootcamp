public class DemoDemo {

  private int x;

  public DemoDemo() {

  }


  public static void main(String[] args) {

    int x = 10;
    System.out.println(x);
    doSomething(x);

    



  }



  public static void doSomething(int x) {
    x = 99;
  }


}
