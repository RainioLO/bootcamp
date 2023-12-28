public class LinkedList {

  private Node head; // to describe the line of Node

  public LinkedList() {

  }

  public void add(int value) {
    if (this.head == null) {
      this.head = new Node(value);
      return;
    }
    Node current = this.head; // didnt change the head pointor
    // while loop until tail, then setNext()
    while (current.next() != null) {
      current = current.next(); // not null and shift
    }
    current.setNext(new Node(value));
  }

  public void remove(int value) {
    // early return
    if (this.head == null)
      return;
    if (this.head.getValue() == value) {
      this.head = this.head.next();
    }
    Node curNode = this.head;
    while (curNode != null) {
      if (curNode.getValue() == value) {
        if (curNode.next() == null) {
          curNode.prev().setNext(null); // set the previous as next full
        } else {
          curNode.prev().setNext(curNode.next());
        }
      }
      curNode = curNode.next();
    }
  }



  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("linkedList[");
    Node curNode = this.head;
    while (curNode != null) {
      sb.append(curNode.getValue()).append(",");
      curNode = curNode.next();
    }
    return sb.append("]").toString();
  }


  public static void main(String[] args) {

    LinkedList l1 = new LinkedList();
    System.out.println(l1);
    l1.add(103);
    System.out.println(l1);
    l1.add(104);
    System.out.println(l1);
    l1.add(105);
    System.out.println(l1);
    l1.remove(103);
    System.out.println(l1);
    l1.remove(104);
    l1.remove(105);
    System.out.println(l1);


    
  }

}
