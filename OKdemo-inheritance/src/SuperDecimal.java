import java.math.BigDecimal;

// the Class BigDecimal has no final keyword, so SuperDeciaml can inherit it.
public class SuperDecimal extends BigDecimal {


  public SuperDecimal() {
    super(BigDecimal);
  }

  public SuperDecimal(double value) {
    super(String.valueOf(value)); // call new BigDecimal(3.0)
  }


  public static SuperDecimal valueOf(double value) {
    return new SuperDecimal(value);
  }


  public SuperDecimal multiply(SuperDecimal value) { // SuperDecimal is BigDecimal child
    BigDecimal bd = this; // upcast from child to super class
    BigDecimal bdValue = value; // upcast
    return new SuperDecimal(bd.multiply(bdValue).doubleValue()); // need to call BigDecimal's methods.

  }


  public static void main(String[] args) {

    // SuperDecimal sd = new SuperDecimal(); // is calling BigDecimal Constructor

    SuperDecimal sd2 = new SuperDecimal(3.0);
    SuperDecimal sd3 = SuperDecimal.valueOf(4.0);

    SuperDecimal sd4 = sd2.multiply(sd3); // no need to write new method
    // sd2, sd3 inherit all BigDecimal public instance methods
    sd4.doubleValue();

    // SuperDecimal inherit BigDecimal 's methods and variables



  }



}
