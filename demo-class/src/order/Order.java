package order;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import building.Member;

public class Order {



  private int id;
  private LocalDate buydate;
  // private double totalAmount; // dericed by Item []
  private Item[] items;
  private static int orderNo;

  // public Order(int id, LocalDate buydate, Item[] items) {

  // this.id = id;
  // this.buydate = buydate;
  // this.items = items; // if new an object, create a Item array

  // }

  public Order(LocalDate buydate) {
    this.id = ++orderNo;
    this.buydate = buydate;
    this.items = new Item[0];
  }


  public Order(int id, LocalDate buydate, Item[] items) {

    this.id = ++orderNo;
    this.buydate = buydate;
    this.items = items;


  }


  // Class Order setters
  public void setId(int id) {
    this.id = id;
  }

  public void setLocalDate(LocalDate buydate) {
    this.buydate = buydate;
  }

  // public void settotalAmount(double amount) {
  // this.totalAmount = amount;


  // Class Order getters
  public int getId() {
    return this.id;
  }

  public LocalDate getLocalDate() {
    return this.buydate;
  }

  public double totalAmount() {

    BigDecimal total = BigDecimal.valueOf(0);
    // BigDecimal price = BigDecimal.valueOf(0);
    // BigDecimal quantity = BigDecimal.valueOf(0);

    for (int i = 0; i < items.length; i++) {
      // total = total + item.price * item.quantity
      // this,items[i] -> one item object
      // price = BigDecimal.valueOf(this.items[i].getPrice());
      // quantity = BigDecimal.valueOf(this.items[i].getQuantity());
      // System.out.println("price= " + this.items[i].getPrice());
      // System.out.println("Quantity= " + this.items[i].getQuantity());
      total = total.add(BigDecimal.valueOf(this.items[i].totalAmount()));
      // System.out.println("total= " + total);
    }
    return total.doubleValue();

  }

  public void addItem(Item item) {
    Item[] newItems = Arrays.copyOf(this.items, this.items.length + 1);
    newItems[newItems.length - 1] = item;
    this.items = newItems;

  }

  public Item getItem(String desc) {
    for (int i = 0; i < this.items.length; i++) {
      if (desc == this.items[i].getDesc()) {
        return this.items[i];
      }
    }
    return null;
  }

  @Override
  public String toString() {
    return "Item:" + Arrays.toString(this.items) + ")";
  }



  // @Override
  // public String toString() {
  // return ("order(id= " + this.id + ", buyDate= " + this.buydate
  // + " / totalAmount $ " + totalAmount());
  // }

  public static void main(String[] args) {

    Item[] items =
        new Item[] {new Item("ABC", 10, 100), new Item("BCC", 2, 10)};
    Order order = new Order(1, LocalDate.of(2023, 12, 7), items);
    order.addItem(new Item("FJJ", 4, 10.0));
    System.out.println("First add " + order.toString());
    order.addItem(new Item("RTJ", 5, 20.0));

    System.out.println("QQ" + order.toString());
    System.out.println("total amount = $ " + order.totalAmount());


    // new Item[] {new Item("ABC", 10, 99.9), new Item("BCC", 2, 10.5)};

  }
}

