public class Demo {

  public static void main(String[] args) {

    DemoStaticNestedClass d = new DemoStaticNestedClass();

    DemoStaticNestedClass.Calculator c = new DemoStaticNestedClass.Calculator(100); // in the nested class
    c.add(5);
    System.out.println(c.getX());
    

    Calculator calculator = new Calculator(); // in the class outside


  }
}
