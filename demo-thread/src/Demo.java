public class Demo {

  public synchronized void methodA() {
    methodB();
  }

  public synchronized void methodB() {
    System.out.println("hello");
  }

  public static void main(String[] args) {
    Thread worker1 = new Thread(() -> new Demo().methodA());
    Thread worker2 = new Thread(() -> new Demo().methodB());
    worker1.start();
    worker2.start();
    
  }
}
