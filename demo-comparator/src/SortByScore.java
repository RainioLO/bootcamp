import java.util.Comparator;

public class SortByScore implements Comparator<Student> {

  
  @Override
  public int compare(Student s1, Student s2) {
    return s2.getScore() > s1.getScore() ? -1 : 1;
  }

}
