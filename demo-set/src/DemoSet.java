import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DemoSet {


  public static void main(String[] args) {
    Set<String> ss = new HashSet<>(); // Set is an interface, HashSet is a class
    List<String> ls = new ArrayList<>();

    // HashSet<>() to implement the contract Set<>

    ls.add("ABC");
    ls.add("ABC");
    ls.add("ABC");
    System.out.println(ls);

    ss.add("HKF");
    ss.add("HKF");
    System.out.println(ss);

    for (String s : ls) {
      System.out.println(ss.add(s)); // True, false, false
    }

    System.out.println(ss.size()); // 1 // reject to add duplicate

    System.out.println(ss.contains("ABC"));
    System.out.println(ss.remove("ABC"));
    System.out.println(ss.size());

  }
}
