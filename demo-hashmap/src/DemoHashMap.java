import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Data Stgructure HashMap

public class DemoHashMap {



  public static void main(String[] args) {

    List<String> strings = new ArrayList<>();

    // Map: key value pair --> <key, value type>
    // put() method
    Map<String, Integer> ageBook = new HashMap<>(); // List is add, Map is put ketword
    ageBook.put("John", 20);
    ageBook.put("John", 13); // Update 20 - 13, because "John" is the key which exists in the map
    ageBook.put("Mary", 3); // add a new entry

    System.out.println(ageBook.size()); // 2

    for (Map.Entry<String, Integer> entry : ageBook.entrySet()) { // Map Entry go into the map with the 目錄
      System.out.println(entry.getKey() + " " + entry.getValue());
    }

    // get()
    System.out.println(ageBook.get("Mary")); // 3 // use key to get the value
    System.out.println(ageBook.get("John"));
    System.out.println(ageBook.get("John"));
    System.out.println(ageBook.get(""));


    // Map<Integer, String>

    Map<Integer, String> winnerBook = new HashMap<>();
    winnerBook.put(1, "Tommy");
    winnerBook.put(2, "Peter");
    winnerBook.put(3, "Sally");
    winnerBook.put(4, "Jenny");
    winnerBook.put(null, "AAA");
    winnerBook.put(null, "BBB");

    for (Map.Entry<Integer, String> entry : winnerBook.entrySet()) { // key and 入口
      System.out.println(entry.getKey() + " " + entry.getValue());
    }

    System.out.println(winnerBook.get(null)); // BBB
    System.out.println(winnerBook.get(3)); // Sally

    // Map <String, Book>

    // put Book
    // get book name

    Book b1 = new Book("Chinese");
    Book b2 = new Book("English");
    Book b3 = new Book("LOK");


    Map<String, Book> bookList = new HashMap<>(); // create a map file to put info inside
    bookList.put("Mary", b1);
    bookList.put("John", new Book("ABC"));
    bookList.put("John", b3);
    bookList.put("Peter", b2);

    System.out.println(bookList.get("Mary").getName());
    System.out.println(bookList.get("John").getName());
    System.out.println(bookList.get("Peter").getName()); // English


    // Map<Author, Book>
    Author a1 = new Author("John");
    Map<Author, Book> bookMap = new HashMap<>();
    bookMap.put(a1, new Book("John1"));
    bookMap.put(new Author("John"), new Book("ABC"));
    bookMap.put(new Author("John"), new Book("CCC"));
    // if key no equals() & hashcode() -> new entry
    // if key have equals() & hashcode() -> update // for custom class only
    // to find if the same object
    System.out.println(bookMap.get(new Author("John"))); // return the latest new Author "John"

    Author john = new Author("John");
    bookMap.put(john, new Book("ABC"));
    bookMap.put(john, new Book("DCB"));
    bookMap.put(john, new Book("CCCz"));
    System.out.println(bookMap.get(john));
    System.out.println(bookMap.get(new Author("John"))); // john is the new Author("John")

    System.out.println(bookMap.containsKey(new Author("John"))); // true
    System.out.println(bookMap.containsValue(new Book("CCCz"))); // true // if no equals and no hashcode --> new a new object for the custom class....

    // check if Absent and add
    System.out.println(bookMap.putIfAbsent(new Author("Ann"), new Book("IJK"))); // null, original value
    System.out.println(bookMap.putIfAbsent(new Author("Ann"), new Book("CCC"))); // IJK, original value // not absent so, still IJK

    // System.out.println(bookMap.get(new Author("Ann"))); // not absent so, still IJK
    System.out.println("get=" + bookMap.get(new Author("Ann")));

  }
}
