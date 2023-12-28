package calculator;

public class Book implements Adjustment {

  private double price;

  @Override
  public double adjust(double x) {
    return this.price * x;
  }

}
