package lambda;

import java.util.Random;
import java.util.function.Supplier;

public class DemoSupplier {

  public static void main(String[] args) {

    Supplier<Integer> randomInteger = () -> new Random().nextInt(100) + 1;
    System.out.println(randomInteger.get());

    Supplier<Book> emptyBook = () -> new Book(); // <Book> must return a book
    Book book = emptyBook.get(); // .get() method from supplier

    


  }
}
