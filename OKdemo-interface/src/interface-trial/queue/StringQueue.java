package queue;
import java.util.Arrays;

public class StringQueue implements Addable, Pollable {

  private String[] queue;

  public StringQueue() {
    this.queue = new String[0];
  }



  @Override
  public void add(String s) {
    addTail(s);
  }

  @Override
  public String poll() {
    return pollHead();
  }


  public boolean isEmpty() {
    return this.queue.length == 0;

  }

  public void clear() {
    this.queue = new String[0];

  }


  public String peak() { // read the head only
    return this.queue[0];
  }



  public String pollHead() {
    if (this.queue.length == 0)
      return null;
    String head = this.queue[0];
    int idx = 0;
    String[] newQueue = new String[queue.length - 1];

    for (int i = 1; i < this.queue.length; i++) {
      newQueue[idx++] = this.queue[i];
    }
    this.queue = newQueue;
    return head;
  }

  public void addTail(String s) {
    String[] newQueue = new String[this.queue.length + 1];
    int idx = 0;
    for (String str : this.queue) {
      newQueue[idx++] = str;
    }
    newQueue[newQueue.length - 1] = s;
    this.queue = newQueue;



  }



  public static void main(String[] args) {
    StringQueue sq = new StringQueue();
    sq.add("hello"); // use .add to add String object into StringQueue type array.
    sq.add("ABC");
    sq.add("Mary");

    System.out.println(sq.peak());
    System.out.println(sq.poll()); // hello
    System.out.println(sq.poll());
    System.out.println(sq.peak());
    System.out.println(sq.isEmpty());

  }


}
