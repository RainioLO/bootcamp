
public class Cat extends Animal {

  // THe Class inherit all public attributes, methods
  // *** Cat did not inherit any constructor ***

  // by default an empty constructor


  public Cat() { // no inherit constructor
    // super(); // implicitly call Animal() constructor
  }

  public static void main(String[] args) {

    Cat cat = new Cat(); // cat is a reference point to the Cat object in heap memory
    cat.setAge(2);
    System.out.println(cat.getAge()); // get the method from Animal



  }



}
