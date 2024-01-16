import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {

  public static void main(String[] args) {
    // HashTable (thread safe) vs HashMap (non-thread safe)
    // put()

    Map<Integer, Integer> hashMap = new HashMap<>();

    Runnable hashMapPut = () -> {
      for (int i = 0; i < 1_000_000; i++) {
        hashMap.put(i, i * 100);
      }
    };

    Thread worker1 = new Thread(hashMapPut);
    Thread worker2 = new Thread(hashMapPut);

    worker1.start();
    worker2.start();

    try {
      worker1.join();
      worker2.join();
    } catch (InterruptedException e) {

    }
    System.out.println(hashMap.size());

    // Threads interference // may read or write at the same time
    Map<Integer, Integer> hashTable = new Hashtable<>();

    Runnable hashTablePut = () -> {
      for (int i = 0; i < 1_000_000; i++) {
        hashTable.put(i, i * 10);
      }
    };

    worker1 = new Thread(hashTablePut);
    worker2 = new Thread(hashTablePut);

    worker1.start();
    worker2.start();

    try {
      worker1.join();
      worker2.join();
    } catch (InterruptedException e) {

    }
    System.out.println(hashTable.size());



  }

}
