package bank;

public class AccountHolder {

  private String name;
  private int age;

  public AccountHolder(String name, int age) {
    this.name = name;
    this.age = age;

  }


  @Override
  public String toString() {
    return "AccountHolder( " + "name= " + this.name + " age: " + this.age;
  }
}
