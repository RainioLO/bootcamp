public class Cow extends Animal {

  public String eat(String food) {
    return "[Cow] i am eating " + food + " ...";
  }


  // Polymorphism + Overloading (Not Overriding)
  public static void main(String[] args) {
    Animal cow = new Cow(); // cow is declared by Animal
    // Compile time : cow obj is declared by Animal,
    // so it can call eat(ect can access which methods
    System.out.println(cow.eat()); // the object has 2 methods: eat(), eat (Stirng food), 
    // "cow" object reference) only but not eat(String food)

    // Run time: Find the object pointing to.
    // The object is created by "Cow" Class. call

    Animal cow2 = new Animal(); //cant call too


  }



}
