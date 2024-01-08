// Kind of class
// No empty constructor
// All argument constructor

public record Student(String name, int age) { // all final instance variable

  public static int test = 1;

  public void read() {
    System.out.println("I am reading");
  }

  // still have method here.


  // public Student(){

  // }


  // all attributes in "record" have been "final"
  // public void setName(String name){
  // this.name = name;
  // }

  // Cannot be changed anymore


}
