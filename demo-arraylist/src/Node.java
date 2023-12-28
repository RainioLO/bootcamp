public class Node {

  // Linked list & ArrayList



  private int value;

  private Node node; // stores the object reference of another Node object node
  private Node prev;
  private Node next;

  // private Node(int value, Node prev, Node next) {
  // this.value = value;
  // this.prev = prev;
  // this.next = next;
  // }

  public Node(int value) {
    this.value = value;
  }


  public void setNode(Node node) {
    this.node = node;
  }

  public void setNext(Node node) {
    this.next = node;
    if (node != null)
      node.setPrev(this); // set next and prev at the same time. "this" object
      
  }

  public void setPrev(Node node) {
    this.prev = node;
  }

  public Node next() {
    return this.next;
  }

  public Node prev() {
    return this.prev;
  }

  public Node getNode() {
    return this.node;
  }

  public int getValue() {
    return this.value;
  }

  public static void main(String[] args) {
    Node head = new Node(100); // no object reference
    Node node1 = new Node(101);
    head.setNext(node1);
    node1.setNext(new Node(102));

    System.out.println(head.next().next().prev().getValue());
    System.out.println(head.next());
    // node1 cannot find the ref of head object

  }


}
