public class Dog {

  private int age;

  public Dog(int age) {
    this.age = age;
  }

  public int getAge() {
    return this.age;
  }

  @Override
  public String toString() {
    return "Dog(" + "age=" + this.age + ")";
  }

}
