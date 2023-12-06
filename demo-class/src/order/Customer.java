package order;

import java.time.LocalDate;
import java.util.Arrays;

public class Customer {
  // 17 types (String, Wraper Classes, Primitives)

  private Order[] orders; // class 入面放class


  public Customer() {
    this.orders = new Order[0];
  }

  public Customer(Order order) { // with only one order
    this.orders = new Order[] {order};
  }

  public Customer(Order[] orders) {
    this.orders = orders;
  }



  // Setter

  public boolean updateOrderAmount(int orderId, double totalAmount) {

    for (int i = 0; i < this.orders.length; i++) {
      if (orderId == this.orders[i].getId()) {
        this.orders[i].settotalAmount(totalAmount);
        return true;
      }
    }
    return false;

  }


  public void addOrder(Order order) {
    Order[] newOrders = Arrays.copyOf(this.orders, this.orders.length + 1);
    newOrders[newOrders.length - 1] = order;
    this.orders = newOrders; // ADDRESS REPLACEMENT
  }



  // Getter
  public Order[] getOrders() {

    return this.orders;
  }

  // public String getorderlist() {

  // String[] arr = new String[orders.length];
  // for (int i = 0; i < orders.length; i++) {

  // arr[i] = orders[i].toString();

  // }
  // return String.valueOf(arr);
  // }

  @Override
  public String toString() {
    return "Customer(Orders=" + Arrays.toString(this.orders) + ")";
  }

  public static void main(String[] args) {

    Order o1 = new Order(5357935, LocalDate.of(2003, 12, 26), 13060d);
    Order o2 = new Order(4187935, LocalDate.of(2003, 12, 27), 3400d);
    Order o3 = new Order(7857935, LocalDate.of(2003, 12, 28), 7500d);

    Customer customer = new Customer(new Order[] {o1, o2, o3});
    o2.settotalAmount(50000d);

    System.out.println("order1= " + o1); // print a object reference, the address
    System.out.println("" + customer);

    // Order[] orderlist = new Order[3];
    // orderlist[0] = new Order(1857935, LocalDate.of(2003, 12, 24), 1300d);
    // orderlist[1] = new Order(1857935, LocalDate.of(2003, 12, 28), 23000d);
    // orderlist[2] = new Order(1850035, LocalDate.of(2003, 12, 23), 13000d);

    // Customer c1 = new Customer(orderlist);
    // System.out.println(c1.getOrders());


    customer.addOrder(new Order(3, LocalDate.of(2000, 10, 1), 1000.d));
    System.out.println("after adding orders: " + customer.toString());


  }
}
