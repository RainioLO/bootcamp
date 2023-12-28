public class DemoStaticNestedClass { // Outer Class

  // Nested Class
  // cannot be private
  public static class Calculator { // as a tool // WHY put in here instead of outside ??
    // this class has no relationship with outside Calculator Class
    // attritubes
    // instance method
    // constructor
    // describe the object in the class
  }


  public static void main(String[] args) {

    DemoStaticNestedClass d = new DemoStaticNestedClass();

    DemoStaticNestedClass.Calculator c = new DemoStaticNestedClass.Calculator();

    Calculator calculator = new Calculator();


  }

}
