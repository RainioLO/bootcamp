import java.util.ArrayList;

public class StringBuilderDemo {


  public static void main(String[] args) {

    StringBuilder sb = new StringBuilder();

    StringBuffer sbf = new StringBuffer();

    // sbf.append("hello").append("world");
    // System.out.println(sbf.toString());


    // Runnable -> append "x" 1_000_000 times -> StringBuilder
    // Runnable -> append "x" 1_000_000 times -> StringBuffer //synchronized, allow one thread to access one time, avoid interference

    // runnable
    Runnable task1 = () -> {
      for (int i = 0; i < 1_000_000; i++) {
        sb.append("x");
      }
    };

    Runnable task2 = () -> {
      for (int i = 0; i < 1_000_000; i++) {
        sbf.append("x");
      }
    };

    // Thread start

    // Test StringBuilder
    Thread worker1 = new Thread(task1);
    Thread worker2 = new Thread(task2);

    // Thread start
    sb.setLength(0);
    worker1.start();
    worker2.start();

    // // join together to see the result, as they merely do as the same time
    try {
      worker1.join();
      worker2.join();
    } catch (InterruptedException e) { // checked exception

    }
    System.out.println(sb.length());


    // Test StringBuffer
    // single thread wont use
    // multiple thread to use
    // other thread is waiting , synchronized so it slower

    worker1 = new Thread(task2);
    worker2 = new Thread(task2);

    sbf.setLength(0);
    worker1.start();
    worker2.start();
    try {
      worker1.join();
      worker2.join();
    } catch (InterruptedException e) { // checked exception

    }
    System.out.println(sbf.length()); // the thread will not interference other



    // StringBuffer time
    long start = 0;
    long end = 0;

    // sb.setLength(0);
    // // start = System.nanoTime();
    // // System.out.println("Thread start");
    // // worker1.start();
    // // System.out.println("Thread end");
    // // end = System.nanoTime();
    // // System.out.println("Time used:" + (end - start));
    // // System.out.println("sb length:" + sb.length());

    // // sbf.setLength(0);
    // // start = System.nanoTime();
    // // System.out.println("Thread start");
    // worker2.start();
    // System.out.println("Thread end");
    // end = System.nanoTime();
    // System.out.println("Time used:" + (end - start));
    // System.out.println("sbf length:" + sbf.length());

    // String add, need a pointer to point back as new object no pointer
    // StringBuffer just change on the object


  }
}
