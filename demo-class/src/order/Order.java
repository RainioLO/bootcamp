package order;

import java.time.LocalDate;

public class Order {


  private int id;
  private LocalDate buydate;
  private double totalAmount;

  public Order() {

  }

  public Order(int id, LocalDate buydate, double totalAmount) {

    this.id = id;
    this.buydate = buydate;
    this.totalAmount = totalAmount;


  }

  // Class Order setters
  public void setId(int id) {
    this.id = id;
  }

  public void setLocalDate(LocalDate buydate) {
    this.buydate = buydate;
  }

  public void settotalAmount(double amount) {
    this.totalAmount = amount;
  }

  // Class Order getters
  public int getId() {
    return this.id;
  }

  public LocalDate getLocalDate() {
    return this.buydate;
  }

  public double gettotalAmount() {
    return this.totalAmount;
  }

  @Override
  public String toString() {
    return ("order(id= " + this.id + ", buyDate= " + this.buydate
        + " / totalAmount $ " + this.totalAmount + ")\n");
  }


}
