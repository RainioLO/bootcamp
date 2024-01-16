import java.util.concurrent.atomic.AtomicInteger;

public class DemoAtomicInteger {

  AtomicInteger atmInt; // an AtomicInteger class object
  // similar to synchronized


  public DemoAtomicInteger() {
    atmInt = new AtomicInteger(0); // default also 0
  }


  public static void main(String[] args) {
    DemoAtomicInteger demoAtomicInteger = new DemoAtomicInteger();
    int result = demoAtomicInteger.atmInt.incrementAndGet();
    System.out.println(result); // 1

    Runnable AtomicIncrement = () -> {
      for (int i = 0; i < 1_000_000; i++) {
        demoAtomicInteger.atmInt.incrementAndGet();
      }
    };

    Thread worker1 = new Thread(AtomicIncrement);
    Thread worker2 = new Thread(AtomicIncrement);

    worker1.start();
    worker2.start();

    try {
      worker1.join();
      worker2.join();
    } catch (InterruptedException e) { // catch and do nothing
    }
    System.out.println(demoAtomicInteger.atmInt.get()); // get the value from the object atmint of the object demoAtomicInteger
  }


}
