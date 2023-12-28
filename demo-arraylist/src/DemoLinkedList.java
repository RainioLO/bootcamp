import java.util.LinkedList;
import java.util.List;

public class DemoLinkedList { // Linkedlist implemets List<?> ls contract

  // List<> is the interface
  public static void main(String[] args) {
    // Java's LinkedList
    List<String> ls = new LinkedList<>();
    ls.add("ABC");
    ls.add("XYZ");
    ls.add("IJK");
    System.out.println(ls);


    ls.remove(2); // remove by index
    System.out.println(ls);
    // ls.removeLast();
    // System.out.println(ls);
    ls.remove("XYZ"); // related to equals() when it come to object
    System.out.println(ls);



  }



}
