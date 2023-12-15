import java.util.Objects;

public class Cat {

  private String name;

  private int age;

  private final Eye[] eyes = new Eye[2]; // if static , 公家 can 拎

  public Cat(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public Eye[] getEyes() {
    return this.eyes;
  }

  public int getAge() {
    return this.age;
  }

  public String getName() {
    return this.name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setName(String name) {
    this.name = name;
  }

  /////////////////////// equals and hashcode must be equal////////////////////////////
  @Override
  public boolean equals(Object obj) { // overriding Object Class 's equals method
    if (this == obj) // same objecrt same value
      return true;
    if (!(obj instanceof Cat)) // object not Class Cat
      return false;
    Cat cat = (Cat) obj; // can use Class Cat, cat object to .method
    return Objects.equals(cat.getAge(), this.age)
        && Objects.equals(cat.getName(), this.name);
    // && Objects.equals(cat.getEyes(), this.eyes);
  }


  @Override
  public int hashCode() { // hashcode -> represent object address
    return Objects.hash(this.name, this.age); // write all fields in this code
  }

  ///////////////////////////////////////////////////////////////////////////////////

  public static void main(String[] args) {

    Cat cat1 = new Cat("Meow", 3);
    Cat cat2 = new Cat("Meow", 3);

    System.out.println(cat1.equals(cat2));
    System.out.println(cat1 == cat2);


  }

}
