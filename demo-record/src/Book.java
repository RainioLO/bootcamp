import java.util.ArrayList;
import java.util.List;

public class Book {

  private String name;

  public Book(String name) {
    this.name = name;
  }

  public Book() {

  }

  public String getName() {
    return this.name;
  }

  @Override
  public String toString() {
    return "Book: " + this.name;
  }


  public static void main(String[] args) {

    BookList bk1 = new BookList(
        new ArrayList<>(List.of((new Book("Chinese")), (new Book("English")))));

    System.out.println(bk1);

    System.out.println(bk1.List().size());
    bk1.List().add(new Book("Math"));

    System.out.println(bk1.List()); // it change the List<Book> content but, not the List, it still hold the List , no changes.

  }
}
