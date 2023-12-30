public class DemoInnerClass { // outer class

  private Calculator calculator;

  public void setCalculator(Calculator calculator) {
    this.calculator = calculator;
  }

  public class Calculator { // inner class

    // public Calculator(){
    // this.calculator ......... // cannot fin the oter class attributes
    // }

  }


  public static void main(String[] args) {

    DemoInnerClass d = new DemoInnerClass();
    DemoInnerClass.Calculator c = d.new Calculator(); // need to new an object by an object

    DemoInnerClass.Calculator c2 = new DemoInnerClass().new Calculator(); // DemoInnerClass(). this object dont know where

    // c = c2;



  }
}
