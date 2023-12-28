import java.util.ArrayList;
import java.util.List;

public class DemoArraylist {

  public static void main(String[] args) {


    // After 1.7
    ArrayList<String> strings = new ArrayList<>();
    strings.add("ABC"); // the array length plus one, copy of array, add new String
    strings.add("DEF");
    strings.add("IJK");
    System.out.println(strings.size());

    // for-each
    for (String str : strings) {
      System.out.println(str);
    }

    strings.remove(2);
    System.out.println(strings); // [ABC, DEF] // ArrayList Class has toString() method
    strings.remove(new String("ABC")); // remove by value // we care the Value only
    // 同一個object by equals()
    System.out.println(strings);


    ArrayList<String> anotherList =
        new ArrayList<>(List.of("1234", "2345", "0000")); // List.of is the constructor
    strings.addAll(anotherList);
    System.out.println(strings);

    ArrayList<String> newList = new ArrayList<>(List.of("1234", "4315"));
    // List<String> newList = new ArrayList<>(List.of("1234", "4315"));
    strings.removeAll(newList);
    System.out.println(strings);

    strings.add(1, "CCC"); // like insert // add will be slower, because we always copy array
    System.out.println(strings);

    strings.set(1, "DDD"); // update element by index
    System.out.println(strings);

    System.out.println(strings.subList(1, 2)); // endIndex (exclusive) // List of string is the return type

    System.out.println(strings.indexOf("0000"));


    // List <> is an Interface implemented by ArrayList.class
    List<String> strings2 = new ArrayList<>();
    strings2.add("ABC");
    strings2.remove(0);
    System.out.println(strings2);

    if (strings.contains("DDD")) { // this is looping
      System.out.println("contains DDD");
    }

    if (!strings.isEmpty()) { // useful
      strings.add("AAA");
    }

    // Difference polymorphism for List<String> and ArrayList<String>
    List<String> arrlist1 = new ArrayList<>(List.of("John", "Mary", "Peter"));
    List<String> arrlist2 = List.of("John", "Mary", "Peter");

    // arrlist1.add("Sally"); // OK aeelist1 point to an object ArrayList<> which contains .add method ...
    // arrlist1.set(1, "Jenny");

    // List of is not the array at base... cant .set
    // arrlist2.set(1, "Jenny"); java.lang.UnsupportedOperationException
    // arrlist2.add("Sally"); // false java.lang.UnsupportedOperationException


    List<String> ls = new ArrayList<>(100); // capacity (array length)
    System.out.println(ls.size()); // size = 0 (how many elements)



  }
}
