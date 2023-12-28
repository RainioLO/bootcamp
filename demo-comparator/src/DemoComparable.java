import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DemoComparable {

  public static void main(String[] args) {

    List<Student> students = new ArrayList<>();
    students.add(new Student(40, "Peter"));
    students.add(new Student(10, "John"));
    students.add(new Student(98, "Ann"));
    students.add(new Student(29, "John"));
    System.out.println(students);

    // Comparable
    Collections.sort(students); // the object has been damaged --> change in the object
    // nned to certificate to execute
    System.out.println(students);

    // Comparator
    Collections.sort(students, new SortByScore()); // new a sorted with SortByScore Class
    System.out.println(students);

    Collections.sort(students, new SortByName());
    System.out.println(students);


  }
}
