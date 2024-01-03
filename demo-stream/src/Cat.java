import java.util.Objects;

public class Cat {

  private String name;

  private int age;

  public Cat() {

  }

  public Cat(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public int getAge() {
    return this.age;
  }

  public String getName() {
    return this.name;
  }

  @Override // *** Important ***
  public boolean equals(Object obj) {
    if (this == obj) // if this object equal to obj -> true
      return true;
    if (!(obj instanceof Cat)) // if this obj is not the same class as Cat -> false
      return false;
    Cat cat = (Cat) obj;
    return Objects.equals(cat.getName(), this.name)
        && Objects.equals(cat.getAge(), this.age);
  }

  @Override // override the tomost Class Object
  public int hashCode() { // always write with equals()
    return Objects.hash(this.name, this.age);
  }


  @Override
  public String toString() {
    return "Cat(" + "name=" + this.name + " age=" + this.age + ")";
  }


}
