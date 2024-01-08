public class Calculator {

  private int x;

  // Multi -thread environment encounter atomic problem (read write issue on share resource)
  // One of the approaches to solve is "synchronized"
  // when a thread accessing a "synchronized" instance method, obtain a lock from the object (other cannot access usless the keyholder)

  // key is per object

  public synchronized void increment() { // can lock this method first, without key cant get into here
    this.x++;
  }

  public synchronized void decrement() { // can lock this method first, without key cant get into here
    this.x--;
  }

  public void increment2() {
    this.x++;
  }


  public static void main(String[] args) {
    Calculator calculator = new Calculator();

    // Example 1 increment with synchronized
    Thread vincent = new Thread(() -> {
      for (int i = 0; i < 100_000; i++) {
        calculator.increment();
      }
    });

    Thread oscar = new Thread(() -> {
      for (int i = 0; i < 100_000; i++) {
        calculator.increment();
      }
    });

    vincent.start();
    oscar.start();

    // run here fitrst by .join() --> run these two thread first to print out x
    try {
      vincent.join();;
      oscar.join();
    } catch (InterruptedException e) {

    }

    System.out.println("calculator.x=" + calculator.x); // the main just directly print it


    // Example 2 increment without synchronized
    calculator.x = 0;

    vincent = new Thread(() -> {
      for (int i = 0; i < 100_000; i++) {
        calculator.increment2();
      }
    });

    oscar = new Thread(() -> {
      for (int i = 0; i < 100_000; i++) {
        calculator.increment2();
      }
    });

    vincent.start();
    oscar.start();

    // run here fitrst by .join() --> run these two thread first to print out x
    try {
      vincent.join();;
      oscar.join();
    } catch (InterruptedException e) {

    }

    System.out.println("calculator.x=" + calculator.x); // the main just directly print it


    // Example 3

    calculator.x = 0;
    vincent = new Thread(() -> {
      for (int i = 0; i < 100_000; i++) {
        calculator.increment();
      }
    });

    oscar = new Thread(() -> {
      for (int i = 0; i < 100_000; i++) {
        calculator.decrement();;
      }
    });

    vincent.start();
    oscar.start();

    // run here fitrst by .join() --> run these two thread first to print out x
    try {
      vincent.join();;
      oscar.join();
    } catch (InterruptedException e) {

    }

    System.out.println("calculator.x=" + calculator.x); // the main just directly print it



  }
}
