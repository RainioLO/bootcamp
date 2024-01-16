import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorDemo {

  public static void main(String[] args) throws InterruptedException { // throw this to solve the exception problem no handling

    // Can be same type of pointer as they implement the same contractg List
    List<String> vector = new Vector<>();

    List<String> arrayList = new ArrayList<>();

    Runnable vectorAdd = () -> {
      for (int i = 0; i < 1_000_000; i++) {
        vector.add("x");
      }
    };

    Runnable arrayListAdd = () -> {
      for (int i = 0; i < 1_000_000; i++) {
        arrayList.add("x");
      }
    };

    Thread worker1 = new Thread(vectorAdd); // synchronized the List for thread safe
    Thread worker2 = new Thread(vectorAdd); // array copy will have thread safe problem, different thread will go onto the arraylist to copy lie the ++ situation

    worker1.start();
    worker2.start();
    worker1.join();
    worker2.join();
    System.out.println(vector.size()); // 200000

    worker1 = new Thread(arrayListAdd); // synchronized the List for thread safe
    worker2 = new Thread(arrayListAdd); // array copy will have thread safe problem, different thread will go onto the arraylist to copy lie the ++ situation
    worker1.start();
    worker2.start();
    worker1.join();
    worker2.join();
    System.out.println(arrayList.size()); // not stable

    // Stack inherit Thread
    // LIFO , very slow, for the thread safe, thread will need to wait outside the synchronized method

  }

}
