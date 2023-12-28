import java.util.ArrayList;
import java.util.List;

public class Printer<T extends Number> { // T is part of class defintion, and it can be bounded
  // T is bounded by Number Class
  // <T extends Number> is the type of the class

  // Number is a abstract class

  // Printer Type(Class)
  // use T can apply different types of attributes
  // less Class to be created
  // run time -> define the T
  // dynamic

  // use equal() to compare

  private List<T> values; // T type: everything

  public Printer() {
    // add value into T array
    this.values = new ArrayList<>();
  }

  public Printer(T value) {
    this.values = new ArrayList<>(List.of(value));
  }

  public List<T> getValue() {
    return this.values;
  }

  public void add(T value) {
    values.add(value); // use the List method
  }



  @Override
  public String toString() {
    return "List<T> = " + this.values;
  }

  public double sum() {
    double sum = 0;
    for (T t : this.values) {
      sum += (double) t;
    }
    return sum;
  }


  public static void main(String[] args) {

    Printer<Integer> integerPrinter = new Printer<>(10);
    Printer<Double> doublePrinter = new Printer<>(10.3); // T is declared as Double
    // Printer<String> stringPrinter = new Printer<>("abc");
    Printer<Double> doublePrinter2 = new Printer<>(10.3);


    doublePrinter.add(5.5);
    doublePrinter.add(3.2);
    doublePrinter.add(10d); // error T has been declared as Double, only double can be added
    System.out.println(doublePrinter.sum());

    System.out.println(doublePrinter);



  }
}
