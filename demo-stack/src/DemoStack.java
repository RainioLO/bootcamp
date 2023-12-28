import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.LinkedList;

public class DemoStack {


  public static void main(String[] args) {
    // LIFO -Stack
    // more functions
    // List family

    List<String> stack = new Stack<>(); // List world
    // 1. if we use List as the reference type, objects reference has no push(), pop() scope.


    Stack<String> ss = new Stack<>(); // Stack world
    ss.push("ABC");
    ss.push("IJK");

    // .pop() get the last element
    System.out.println(ss.pop()); // IJK
    System.out.println(ss.pop()); // ABC
    // System.out.println(ss.pop());// error we cannot pop() an empty stack

    // 2. You can access the middle element
    ss.push("aaa");
    ss.push("bbb");
    ss.push("ccc");
    System.out.println(ss.get(0)); // "aaa"
    System.out.println(ss.get(1)); // "bbb"

    // 3. Slow

    // add

    // Stack
    long start = System.nanoTime();
    for (int i = 0; i < 1000000; i++) {
      ss.push("A");
    }
    long end = System.nanoTime();
    System.out.println("Stack.push() -> " + (end - start));


    // ArrayList
    start = System.nanoTime();
    ArrayList<String> as = new ArrayList<>(2000000);
    for (int i = 0; i < 1000000; i++) {
      as.add("A");
    }
    end = System.nanoTime();
    System.out.println("ArrayList.add() -> " + (end - start));


    // LinkedList
    start = System.nanoTime();
    LinkedList<String> ls = new LinkedList<>();
    for (int i = 0; i < 1000000; i++) {
      ls.add("A");
    }
    end = System.nanoTime();
    System.out.println("LinkedList.add() -> " + (end - start));


    // remove

    // ArrayList
    start = System.nanoTime();
    for (int i = 0; i < 1000000; i++) {
      as.remove(0);
    }
    end = System.nanoTime();
    System.out.println("ArrayList.remove() -> " + (end - start));


    // LinkedList
    start = System.nanoTime();
    for (int i = 0; i < 1000000; i++) {
      ls.removeFirst();
    }
    end = System.nanoTime();
    System.out.println("LinkedList.removeFirst() -> " + (end - start));



  }
}
