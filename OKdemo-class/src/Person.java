// blueprint, to produce person object

public class Person {

  // Attributes // have to be private
  private String firstName; //
  private String lastName;
  private String fullName;
  private int age;

  // Constructor (Produce Person's object)
  public Person() { // empty constructor

  }

  public Person(String x, String y, int z) {
    // this.firstName = y;
    // this.lastName = x;
    this(x, y);
    this.age = z;
  }

  public Person(int z) {
    this.age = z;
  }

  public Person(String x) {
    this.lastName = x;
    this.firstName = "";
  }

  public Person(String x, String y) {
    this.firstName = y;
    this.lastName = x;
  }


  // Instance Method //object has to be produced.
  // 1. Belongs to the object (Person p1 = new Person(); p1.swim();
  // 2. able to control the instance variable by "this."


  // Static Method
  // 1. Belongs to the class (ClassName.stticMethod() -> Person.swim(int hours = 3))
  // 2. Not able to read/write instacne variable
  // 3. THe output completely derived by the input parameters



  // Instance Method (Object Method)
  public void setName(String y, String x) {
    this.firstName = x;
    this.lastName = y;
  }

  public void setFirstName(String x) {
    this.firstName = x;
  }

  public void setLastName(String x) {
    this.lastName = x;
  }

  public void setAge(int x) {
    this.age = x;
  }

  // Getter
  public String getFullName() {
    return this.firstName.isEmpty() ? this.lastName
        : this.lastName.concat(" ").concat(this.firstName);
  }

  public String getFullNameTool(boolean isCapLetter) {

    String fullName = this.firstName.concat(" ").concat(this.lastName);
    return isCapLetter ? fullName.toLowerCase() : fullName.toUpperCase();


  }

  public String getFullNameLower() {
    this.fullName = this.lastName.concat(" ").concat(this.firstName);
    return this.fullName.toLowerCase();
  }

  public String getFullNameUpper() {
    this.fullName = this.lastName.concat(" ").concat(this.firstName);
    return this.fullName.toUpperCase();
  }


  public void getAlldata() {
    System.out.print("Name: " + this.lastName.concat(" ").concat(this.firstName)
        + " / Age: " + this.age);
    System.out.println(" ");
  }


  public String normalName() {

    return this.lastName.substring(0, 1).toUpperCase()
        .concat(this.lastName.substring(1, this.lastName.length())).concat(" ")
        .concat(this.firstName.substring(0, 1).toUpperCase()
            .concat(this.firstName.substring(1, this.firstName.length())));

  }

  public static void swimming() { // if same name , easily misunderstand

    System.out.println("I'm swimming");

  }


  public void swim() { // void method can be with "return" or withour "return"
    int a = 1;
    if (a > 2)
      return;
    System.out.println(this.lastName + " is swimming");

  }


  public int eat() { // int method has to be with "return" keyword
    int b = 10;
    if (b < 12)
      return 100;
    return -1;


  }



  public static void main(String[] args) {
    Person p1 = new Person();
    p1.setName("John", "Wick");
    p1.setAge(52);

    Person p2 = new Person();
    p2.setName("Peter", "Parker");

    Person p3 = p1;
    p3.setName("Mary", "Jane");
    System.out.println(p3.getFullName() + " " + p3.age);

    Person p4 = new Person("Tommy", "Wong", 45);
    p4.setName("Jenny", "Lok");

    System.out.println(p4.getFullName());
    System.out.println(p3.getFullName());
    System.out.println(p2.getFullName());
    System.out.println(p1.getFullName());


    Person p5 = new Person("Ken", "Wong", 16);
    System.out.println("Name of p5: " + p5.getFullName());
    p5.getAlldata();
    System.out.println("Name of p5 (Lower): " + p5.getFullNameLower());
    System.out.println("Name of p5 (Upper): " + p5.getFullNameUpper());
    System.out.println("Name of p5 (Lower): " + p5.getFullNameTool(true));


    Person p6 = new Person("chris", "chan");
    // Chris Chan
    System.out.println("Name of p6 (Normal): " + p6.normalName());

    Person p7 = new Person("John");
    System.out.println("Name of p7: " + p7.getFullName());

    // Static vs Instance Method

    // Call Instance Method
    Person p8 = new Person("Jenny"); // p8 is reference to point to object Person " Jenny"
    p8.swim(); // hello // different

    // Call Static Method
    Person.swimming(); // I 'm swimming // is not belong to object !!!



  }

}
