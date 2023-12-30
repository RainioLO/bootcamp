import java.util.ArrayList;
import java.util.List;

public class Student {
  // Builder Pattern Advantages
  // 1. If you want to control the access to setter after the object created, builder pattern is good choice
  // 2. you dont have to create too muich constructor according to the attributes

  private String name;
  private int age;
  private List<String> subjects;

  // 10 fields ... all arguments constructor -> 1 constructor
  // 9 fields constructor ? N constructor ...
  // if fields change the constructor changes...

  private Student(String name, int age, List<String> subjects) {
    this.name = name;
    this.age = age;
    this.subjects = subjects;

  }

  private Student(Builder builder) {
    this.name = builder.name;
    this.age = builder.age;
    this.subjects = builder.subjects;
  }


  public static Builder builder() {
    return new Builder();
  }



  public static class Builder { // inner class // mimic Class
    private String name;
    private int age;
    private List<String> subjects;


    public Builder name(String name) { // return a Builder // setter
      this.name = name;
      return this;
    }

    public Builder age(int age) { // return a Builder // setter
      this.age = age;
      return this;
    }

    public Builder subjects(List<String> subjects) { // return a Builder // setter
      this.subjects = subjects;
      return this;
    }

    public Student build() { // from builder class
      return new Student(this);
    }


  }


  public static void main(String[] args) {
    Student student =
        new Student("John", 13, new ArrayList<>(List.of("Maths", "English")));

    Student student2 = new Student.Builder().name("Peter").age(15)
        .subjects(new ArrayList<>(List.of("Maths", "English"))).build();

    Student student3 = Student.builder().name("Mary").age(12) // static method to create builed
        .subjects(new ArrayList<>(List.of("Maths", "English"))).build();

    Student student4 = Student.builder().build();

  }

}
