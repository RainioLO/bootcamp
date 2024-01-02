public class Demo {

  public static void main(String[] args) {

    Walkable person = new Walkable() { // polymorphism interface
      @Override
      public void walk() {
        System.out.println("walking....");
      }
    };

    person.walk();; // walking...

    // Lambda Expression
    // 1. We dont need to write down method signature for the walk() method. Why?
    // because the interface has only 1 method, so the compiler knows the code block must refer to what method.
    // 2. "()" is the input parametersof the walk method
    // 3. As walk method is void return type, we dont have to return anything inside the coded block.
    // 4. Limitation: It can only be used when there is ONLY ONE method in interface
    // 5. if there is only one statement inside the code block {}, dont need to add {} and return
    // 6. no need to specify the inut parameter type as it is the only

    // () no attributes for Walkable
    Walkable person2 = () -> { // no @Override
      System.out.println("hello");
      System.out.println("hello world");
    };
    person2.walk();

    // (a, b) refer to the compute(int x, int y) int the interface Calculable


    // no need to create method in interface and override each method in the implementing Class
    // create method here
    // no need class here

    // Approach 1
    Calculable addition = (salary, bonus) -> salary + bonus;
    System.out.println(addition.compute(10, 3)); // 13

    // Approach 2 to handle one code statement
    Calculable multiply = (price, quantity) -> {
      return price * quantity;
    };
    System.out.println(multiply.compute(1000, 3)); // 3000

  }
}
