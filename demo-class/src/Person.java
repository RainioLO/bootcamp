// blueprint, to produce person object

public class Person {

    // Attributes
    private String name; //
    private int age; // default = 0

    // Constructor (Produce Person's object)
    public Person() {

    }

    public Person(String x, int y) {
        this.name = x;
        this.age = y;
    }

    public Person(int y) {
        this.age = y;
    }



  // Instance Method (Object Method)
    public void setName(String x) {
        this.name = x;
    }

    public void setAge(int x) {
        this.age = x;
    }

    // Getter
    public String getName () {
        return this.name;
    }



  public static void main(String[] args) {
    Person p1 = new Person(); 
    p1.setName("John");
    p1.setAge(52);

    Person p2 = new Person();
    p2.setName("Peter");

    Person p3 = p1;
    p3.setName("Mary");
    System.out.println(p3.name+ " " +p3.age);

    Person p4 = new Person("Tommy", 45);
    p4.setName("Jenny");

    System.out.println(p4.getName());
    System.out.println(p3.getName());
    System.out.println(p2.getName());
    System.out.println(p1.getName());

  }

}
