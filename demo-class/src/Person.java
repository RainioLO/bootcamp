// blueprint, to produce person object

public class Person {

    // Attributes
    private String FirstName; //
    private String LastName;
    private String FullName;
    private int age;

    // Constructor (Produce Person's object)
    public Person() {

    }

    public Person(String x,String y, int z) {
        this.FirstName = y;
        this.LastName = x;
        this.age = z;
    }

    public Person(int z) {
        this.age = z;
    }

    public Person(String x) {
      this.LastName = x;
      this.FirstName = "";
    }

    public Person(String x,String y) {
        this.FirstName = y;
        this.LastName = x;
    }


  // Instance Method (Object Method)
    public void setName(String y, String x) {
        this.FirstName = x;
        this.LastName = y;
    }

    public void setFirstName(String x) {
        this.FirstName = x;
    }

    public void setLastName(String x) {
        this.LastName = x;
    }

    public void setAge(int x) {
        this.age = x;
    }

    // Getter
    public String getFullName () {
        return this.FirstName.isEmpty()? this.LastName 
        :this.LastName.concat(" ").concat(this.FirstName);
    }

    public String getFullNameTool (boolean isCapLetter) {

      String fullName = this.FirstName.concat(" ").concat(this.LastName);
        return isCapLetter? fullName.toLowerCase() : fullName.toUpperCase();
    

}

    public String getFullNameLower () {
        this.FullName = this.LastName.concat(" ").concat(this.FirstName);
        return this.FullName.toLowerCase();
    }

    public String getFullNameUpper () {
        this.FullName = this.LastName.concat(" ").concat(this.FirstName);
        return this.FullName.toUpperCase();
    }


    public void getAlldata () {
      System.out.print("Name: " + this.LastName.concat(" ").concat(this.FirstName) + " / Age: " + this.age);
      System.out.println(" ");
    }


    public String normalName () {

      return this.LastName.substring(0,1).toUpperCase()
      .concat(this.LastName.substring(1,this.LastName.length()))
      .concat(" ")
      .concat(this.FirstName.substring(0,1).toUpperCase()
      .concat(this.FirstName.substring(1,this.FirstName.length())));

    }




  public static void main(String[] args) {
    Person p1 = new Person(); 
    p1.setName("John", "Wick");
    p1.setAge(52);

    Person p2 = new Person();
    p2.setName("Peter", "Parker");

    Person p3 = p1;
    p3.setName("Mary", "Jane");
    System.out.println(p3.getFullName()+ " " +p3.age);

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


    Person p6 = new Person ("chris", "chan"); 
    // Chris Chan
    System.out.println("Name of p6 (Normal): " + p6.normalName());

    Person p7 = new Person ("John");
    System.out.println("Name of p7: " + p7.getFullName());





  }

}
