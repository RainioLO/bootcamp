import java.util.Objects;

public class Author {

  private String name;

  public Author(String name) {
    this.name = name;

  }

  public String getName() {
    return this.name;
  }

  @Override
  public String toString() {
    return this.name;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!(obj instanceof Author))
      return false;
    Author author = (Author) obj;
    return Objects.equals(author.getName(), this.name);
  }

  @Override
  public int hashCode() { // hashcode -> represent object address
    return Objects.hash(this.name); // write all fields in this code
  }

}
