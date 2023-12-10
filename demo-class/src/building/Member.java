package building;

public class Member {

  private String name;
  private int age;
  private char gender;
  private double salary;

  public Member() {

  }

  public Member(String name, int age, char gender, double salary) {

    this.name = name;
    this.age = age;
    this.gender = gender;
    this.salary = salary;

  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setGender(char gender) {
    this.gender = gender;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  public int getAge() {
    return age;
  }

  public char getGender() {
    return gender;
  }

  public String getName() {
    return name;
  }

  public double getSalary() {
    return salary;
  }

  @Override
  public String toString() {
    return "Name: " + this.name + ", Age " + this.age + ", Gender: "
        + this.gender + ", Salary " + this.salary;
  }



}
