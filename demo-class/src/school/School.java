package school;

public class School {

  private String name;
  private int noOfStudents;
  private int teachers;

  public School() { // empty constructor

  }

  public School(String name, int noOfStrudents, int teachers) {

    this.name = name;
    this.noOfStudents = noOfStrudents;
    this.teachers = teachers;

  }


  public void setName(String name) {
    this.name = name;
  }

  public void setNoOfStudents(int noOfStudents) {
    this.noOfStudents = noOfStudents;
  }

  public void setTeachers(int teachers) {
    this.teachers = teachers;
  }


  public String getName() {
    return this.name;
  }

  public int getNoOfStudents() {
    return this.noOfStudents;
  }

  public int getTeachers() {
    return this.teachers;
  }


  public void totalStudents(int x, int y) {
    int noOfStudents = x * y;
    this.noOfStudents = noOfStudents;
  }



  public static void main(String[] args) {


    School school = new School();

    System.out.println(school.totalStudents(12, 30));



  }


}
