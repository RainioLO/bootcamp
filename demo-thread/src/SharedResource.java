public class SharedResource {

  private boolean hasData = false; // S

  // wait(), notify()

  // Step 0: both 2 thread starts at the same time
  // Producer thread -> "synchronized produce" -> acquire the lock
  // Consumer thread is waiting outside the door of "synchronized consume"
  // Producer thread -> producing the data -> notify (awake other threads)
  // Producer thread -> call wait() -> release the lock
  // Consumer thread -> get the lock -> get into synchronized consume() instance method"

  // consumer () while loop (fulfill -> wait ())
  // produce () while loop (not fulfill) -> produce data -> notify
  // after producer calling the notify(), consumer thread will resume

  // the waiting thread has to be notified by someone to activate
  // synchronized instance method can only be accessed when the thread has the key
  // the first one get in have the key


  // 2 thread to the same object need synchronized keyword
  public synchronized void produce() throws InterruptedException { // need try catch
    while (hasData) { // true
      System.out.println("Producer-> self wait ..."); // this only print out once
      wait(); // see if have data // like the key, current thread change to wait()
    }
    System.out.println(
        "Thread ID: " + Thread.currentThread().getId() + "Producing data...");
    Thread.sleep(2000);
    hasData = true;
    System.out.println("Produced data");
    notify(); // notify consumer thread to proceed (line 22 to wake up) -> start 24
  } // notify those who sleep...

  // synchronized lock all the method and the attributes in the method

  public synchronized void consume() throws InterruptedException { // need try catch
    while (!hasData) { // if not synchronized and it has no key -> the hasData has problem
      System.out.println("consumer -> self wait ...");
      wait(); // Object.wait() notify() // consume wait here
    } // wait at the same time as line 6
    System.out.println(
        "Thread ID: " + Thread.currentThread().getId() + "Consuming data ...");
    Thread.sleep(2000);
    hasData = false;
    System.out.println("consumed data.");
    notify(); // notify other thread to revoke // only notify, no give the key to other synchronized
  } // notify to get the key, the key is by object


  public static void main(String[] args) {
    SharedResource sharedResource = new SharedResource();

    Runnable produceData = () -> {
      // while (true) {
      try { // must have try as it throws in the method
        sharedResource.produce();
      } catch (InterruptedException e) {

      }
      // }
    };

    Runnable consumeData = () -> {
      // while (true) {
      try { // must have try as it throws in the method
        sharedResource.consume();
      } catch (InterruptedException e) {

      }
      // }
    };

    Thread producer = new Thread(produceData);
    Thread consumer = new Thread(consumeData);

    producer.start();
    consumer.start();



  }
}
