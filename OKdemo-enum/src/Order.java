public class Order {

  private int id;
  private Status status;

  public Order(int id, Status status) {
    this.id = id;
    this.status = status;

  }


  public int getId() {
    return id;
  }

  public Status getStatus() {
    return status;
  }



  public static void main(String[] args) {

    Order o1 = new Order(1, Status.ORDERED);
    Order o2 = new Order(1, Status.SHIPPED);
    if (o1.getStatus() != o2.getStatus())
      System.out.println("different");

    if (o1.getStatus().getVal() != o2.getStatus().getVal())
      System.out.println("different status value");



  }

}
