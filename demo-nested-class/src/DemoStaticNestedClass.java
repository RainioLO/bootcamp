public final class DemoStaticNestedClass { // Outer Class should always be normal class to carry the static class

  private static int score;

  // Nested Class
  // cannot be private
  // like the linkage between the two class die or live
  // only one new, one object 


  // no use to be used outside the class for internal use
  public static class Calculator { // as a tool // WHY put in here instead of outside ??
    // this class has no relationship with outside Calculator Class

    // attritubes
    private int x;

    // constructor
    public Calculator(int x) {
      this.x = x;
    }

    // instance method
    public void add(int y) {
      this.x += y;
    }

    // describe the object in the class

    public int getX() {
      return this.x;
    }
    
  }


  public static void main(String[] args) {

    DemoStaticNestedClass d = new DemoStaticNestedClass();

    // DemoStaticNestedClass.Calculator c = new DemoStaticNestedClass.Calculator();

    // Calculator calculator = new Calculator();


  }

}
