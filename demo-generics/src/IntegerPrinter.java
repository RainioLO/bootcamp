public class IntegerPrinter {

  private Integer x;

  public IntegerPrinter(Integer x) {
    this.x = x;
  }

  public Integer getX() {
    return this.x;
  }

  // public Object getX2() { // cant do it
  // return this.x;
  // }


  public static void main(String[] args) {
    IntegerPrinter p = new IntegerPrinter(10);
    System.out.println(p.getX()); // strong type get to Integer

    // Object o = p.getX2();
    // System.out.println(o); // Object type reference o is pointer to the object

  }
}
