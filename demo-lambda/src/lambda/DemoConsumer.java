package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class DemoConsumer {
  public static void main(String[] args) {
    Consumer<String> sendEmailFunction = // static void method
        emailAddress -> sendEmail(emailAddress);

    // email list
    List<String> emails = new ArrayList<>(List.of(""));
    emails.forEach(sendEmailFunction);

    // common way to use forEach()
    emails.forEach(x -> {
      sendEmail(x);
    });

    List<Book> books = new ArrayList<>(List.of(new Book(10.3), new Book(3.4)));
    books.add(new Book(30.8));
    for (Book book : books) {
      System.out.println(book.getPrice());
    }

    books.forEach(e -> { // e is a book object
      System.out.println(e.getPrice());
    });

    BiConsumer<Book, Person> consumer = (book, person) -> {
      System.out.println(book.getPrice() + " ,age: " + person.getAge());
    }; //statement

    consumer.accept(new Book(), new Person(18));

    // SuperConsumer
    SuperConsumer<String, Integer, String> superConsumer = (s1, i1, s2) -> {
      System.out.println(new StringBuilder(s2).append(s1.charAt(i1)));
    }; // method statement

    superConsumer.accept("hello", 4, "prefix"); // prefixo


  }


  public static boolean sendEmail(String emailAddress) {
    System.out.println("I am sending email..." + emailAddress);
    return true;
  }



}
