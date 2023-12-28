import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class DemoArrayDeque {

  public static void main(String[] args) {
    Queue<String> qs = new ArrayDeque<>(); // queue and deque also ok

    qs.add("JJJ");
    qs.add("KKK");
    qs.poll();
    System.out.println(qs.peek());

    Deque<String> ds = new ArrayDeque<>();
    ds.addFirst("ABC");
    ds.addFirst("CBA");
    ds.addFirst("XXX");
    ds.removeLast(); // ABC
    System.out.println(ds.pollLast()); // CBA

  }
}
