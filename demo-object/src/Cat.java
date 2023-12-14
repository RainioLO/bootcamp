public class Cat {

  private String name;

  private int age;

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

  public void setAge(int age) {
    this.age = age;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) // same objecrt same value
      return true;
    if (!(obj instanceof Cat)) // object not Class Cat
      return false;
    Cat cat = (Cat) obj; // can use Class Cat, cat object to .method
    return cat.getAge() == this.age && cat.getName().equals(this.name);

  }


  public static void main(String[] args) {

    Cat cat1 = new Cat("Meow", 3);
    Cat cat2 = new Cat("Meow", 3);

    System.out.println(cat1.equals(cat2));
    System.out.println(cat1 == cat2);


  }

}
