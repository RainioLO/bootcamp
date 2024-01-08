public class Demo {

  public static void main(String[] args) {

    Student student = new Student("John", 20);
    System.out.println(student.name()); // getter
    // no settre in Record

    // toString()
    System.out.println(student);

    // equals()
    Student student2 = new Student("John", 20);
    System.out.println(student.equals(student2)); // true

    // hashCode()
    System.out.println(student.hashCode()); // same
    System.out.println(student2.hashCode()); // same //overwrite

  }
}
