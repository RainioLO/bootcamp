package order;

import java.math.BigDecimal;

public class Item { // Attributes

  private double price;
  private String desc;
  private int quantity;


  public Item(String desc, int quantity, double price) { // constructor
    this.desc = desc;
    this.quantity = quantity;
    this.price = price;
  }

  // Setter

  public void setDesc(String desc) {
    this.desc = desc;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  // Getter

  public String getDesc() {
    return this.desc;
  }

  public int getQuantity() {
    return this.quantity;
  }

  public double getPrice() {
    return this.price;
  }

  public double totalAmount() {
    return BigDecimal.valueOf(this.price)
        .multiply(BigDecimal.valueOf(this.quantity)).doubleValue();
  }

}
