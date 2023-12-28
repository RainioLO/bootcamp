import java.util.Objects;

public class Book {

  private String name;

  public Book(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  @Override
  public String toString() {
    return "[name = " + this.name + "]";
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!(obj instanceof Book))
      return false;
    Book book = (Book) obj;
    return Objects.equals(book.getName(), this.name);
  }

  @Override
  public int hashCode() { // hashcode -> represent object address
    return Objects.hash(this.name); // write all fields in this code
  }


}
