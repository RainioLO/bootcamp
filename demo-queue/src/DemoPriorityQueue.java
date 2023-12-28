import java.util.PriorityQueue;
import java.util.Queue;

public class DemoPriorityQueue {

  public static void main(String[] args) {

    Queue<String> qs = new PriorityQueue<>(new SortByDesc()); // can override by adding a custom class APPLIED COMPARATOR

    qs.add("hello");
    qs.add("a");
    qs.add("x");
    System.out.println(qs);



  }

}
