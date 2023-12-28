import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Book {

  // fields
  private String name;

  // constructor
  public Book(String name) {
    this.name = name;
  }


  public String getName() {
    return this.name;
  }


  @Override // *** Important ***
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!(obj instanceof Book))
      return false;
    Book book = (Book) obj;
    return Objects.equals(book.getName(), this.name);
  }

  @Override // override the tomost Class Object
  public int hashCode() { // always write with equals()
    return Objects.hash(this.name);
  }

  @Override
  public String toString() {
    return "Book(" + "name= " + this.name + ")";
  }


  public static void main(String[] args) {

    List<Book> books = new ArrayList<>();
    Book book = new Book("ABC");
    books.add(book); // this add the object reference containing address
    books.add(new Book("IJK")); // directly add a new object
    books.add(new Book("XYZ")); // when add , kill the old object and point to the new AtrrayList<>() object;

    System.out.println(books.contains(new Book("ABC")));
    System.out.println(books.contains(book)); // is checking the object address


    boolean found = false;
    for (Book b : books) {
      if ("ABC".equals((b.getName())))
        found = true;
    }

    // remove (Object obj)
    books.remove(new Book("IJK"));
    System.out.println(books);



  }
}
