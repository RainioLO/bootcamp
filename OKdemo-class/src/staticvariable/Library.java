package staticvariable;

import java.util.Arrays;
import order.Item;

public class Library {

  private static int bookCounter = 0; // static commonly used
  private static Librarian librarian;

  private Book[] books;


  public Library() {
    this.books = new Book[0];
  }

  public Library(Librarian librarian) {
    this.books = new Book[0];
    Library.librarian = librarian;
  }



  public int bookCount() {
    return bookCounter; // no this.bookcounter 公家
  }

  public void addBook(Book book) {

    bookCounter++;
    Book[] newBooks = Arrays.copyOf(this.books, this.books.length + 1);
    newBooks[newBooks.length - 1] = book;

  }

  public String librarianName() {
    return librarian.getName();
  }



  public static void main(String[] args) {

    Library library = new Library();
    library.addBook(new Book());
    System.out.println(library.bookCount());
    library.addBook(new Book());
    library.addBook(new Book());
    System.out.println(library.bookCount());

    Librarian librarian2 = new Librarian("Tommy");
    Library library2 = new Library(librarian2);


    System.out.println(librarian2.getName());



  }



}
