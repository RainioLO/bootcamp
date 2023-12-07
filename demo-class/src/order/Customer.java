package order;

import java.time.LocalDate;
import java.util.Arrays;

public class Customer {
  // 17 types (String, Wraper Classes, Primitives)

  private Order[] orders; // class 入面放class
  int age;


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

  // public boolean updateOrderAmount(int orderId, double totalAmount) {

  // for (int i = 0; i < this.orders.length; i++) {
  // if (orderId == this.orders[i].getId()) {
  // this.orders[i].settotalAmount(totalAmount);
  // return true;
  // }
  // }
  // return false;
  // }


  public void addOrder(Order order) {
    Order[] newOrders = Arrays.copyOf(this.orders, this.orders.length + 1);
    newOrders[newOrders.length - 1] = order;
    this.orders = newOrders; // ADDRESS REPLACEMENT
  }


  public void setAge(int age) {
    this.age = age;
  }


  // Getter
  public Order[] getOrders() {

    return this.orders;
  }

  public int getAge() {
    return this.age;
  }


  public Order getOrder(int orderId) {
    for (int i = 0; i < this.orders.length; i++) {
      if (orderId == this.orders[i].getId()) {
        return this.orders[i];
      }
    }
    return null;
  }

  public boolean isAdult() {
    return this.age >= 18;
  }

  public boolean isVIP() {
    return this.orders.length >= 100;
  }

  public char membership() { // 'G', 'S', 'N'

    if (this.orders.length >= 100) {
      return 'G';
    } else if (this.orders.length >= 50) {
      return 'S';
    }
    return 'N';
  }
  // public String getorderlist() {

  // String[] arr = new String[orders.length];
  // for (int i = 0; i < orders.length; i++) {

  // arr[i] = orders[i].toString();

  // }
  // return String.valueOf(arr);
  // }

  // public boolean deleteOrder(int orderId) {

  // boolean found = false;
  // int idx = 0;
  // Order[] newArr = new Order[this.orders.length - 1]; // local variable
  // for (int i = 0; i < this.orders.length; i++) {
  // if (orderId == this.orders[i].getId()) { // can get the ID in the order list by .getId created
  // found = true;
  // }
  // // newArr[idx++] = this.orders[i]; // if found put int the new array
  // // // use a idx++ to add one more variable
  // }
  // if (!found) {
  // return false;
  // }



  @Override
  public String toString() {
    return "Customer(Orders=" + Arrays.toString(this.orders) + ")";
  }

  public static void main(String[] args) {


    Item[] i1 = new Item[] {new Item("ABC", 10, 100), new Item("CCC", 9, 5)};
    Order o1 = new Order(1, LocalDate.of(2003, 12, 26), i1);
    // Order o2 = new Order(2, LocalDate.of(2003, 12, 27));
    // Order o3 = new Order(3, LocalDate.of(2003, 12, 28));

    Customer customer = new Customer(new Order[] {o1});
    // Customer customer = new Customer(new Order[] {o1, o2, o3});

    System.out.println("order1= " + o1); // print a object reference, the address
    System.out.println("" + customer);

    System.out.println("Example" + o1.totalAmount());
    // Order[] orderlist = new Order[3];
    // orderlist[0] = new Order(1857935, LocalDate.of(2003, 12, 24), 1300d);
    // orderlist[1] = new Order(1857935, LocalDate.of(2003, 12, 28), 23000d);
    // orderlist[2] = new Order(1850035, LocalDate.of(2003, 12, 23), 13000d);

    // Customer c1 = new Customer(orderlist);
    // System.out.println(c1.getOrders());


    // customer.addOrder(new Order(4, LocalDate.of(2000, 10, 1)));
    System.out.println("after adding orders: " + customer.toString());

    // System.out.println("after deleteing orders: " + customer.deleteOrder(1));

    customer.getOrder(1).totalAmount(); // find customer with order ID 1 to get the totalAmount

    if (customer.getOrders().length >= 100) {
      System.out.println("The customer is VIP");
    }


    customer.setAge(18);
    if (customer.isAdult()) {
      System.out.println("is an adult");
    }

    System.out.println(customer.membership());


  }
}
