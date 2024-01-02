package lambda;

import java.util.ArrayList;
import java.util.List;

public class forEachTrial {
  public static void main(String[] args) {

    List<Subject> subjects =
        new ArrayList<>(List.of(Subject.CHINESE, Subject.ENGLISH));
    subjects.add(Subject.MATH);
    subjects.add(Subject.PHYSICS);

    subjects.forEach(subject -> {
      System.out.println(subject.getDesc());
    });


  }
}
