import java.util.List;
import java.util.Queue;
import java.util.Deque;
import java.util.LinkedList;

public class DemoQueue {

  public static void main(String[] args) {

    // List vs Queue
    // 1. We cannot access the middle elements in the queue. Just get the object from the queue head
    // 2. First in First Out (Queue is FIFO)

    List<String> ls = new LinkedList<>(); // ls only have List method, but linkedlist have all

    // method is by signature to recognize
    ls.add("ABC");
    ls.add("IJK");
    String result = ls.get(0); // ABC
    ls.remove(0);

    // is LinkedList<>() class but hidden by Queue<> interface
    // Why not just use LinkedList ???? ----> Readability

    Queue<String> qs = new LinkedList<>();// qs only have Queue method, but linkedlist have all
    qs.add("ABC"); // add() last
    qs.add("IJK");
    String result2 = qs.poll(); // ABC // get the head directly
    System.out.println(qs.poll()); // IJK
    System.out.println(qs.size()); // 0


    Deque<String> ds = new LinkedList<>();
    ds.addFirst("1");
    ds.add("2"); // add(), addLast() same
    ds.add("3");
    ds.add("4");
    ds.add("5");
    ds.add("6");
    ds.add("7");
    ds.add("8");

    System.out.println(ds);
    System.out.println(ds.poll()); // poll ed
    System.out.println(ds);
    System.out.println(ds.pollFirst());
    System.out.println(ds.pollLast());
    System.out.println(ds.pollLast());
    System.out.println(ds.pollLast());
    System.out.println(ds.pollLast());
    System.out.println(ds.pollLast());
    System.out.println(ds.pollLast());

    // Difference pollLast() and removeLast() ?
    System.out.println(ds.pollLast());
    // System.out.println(ds.removeLast()); error!



  }

}
