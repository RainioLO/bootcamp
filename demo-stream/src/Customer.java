import java.util.ArrayList;
import java.util.List;

public class Customer { // oter class cannot access inner class

  List<Address> addresses;

  public void addAddress(String addressLine1, String addressLine2) { // by addAddress to create a new Address
    addresses.add(new Address(addressLine1, addressLine2));
  }

  public List<Address> getAddress() {
    return this.addresses;
  }

  public Customer() {
    this.addresses = new ArrayList<>();
  }


  public class Address { // inner class // new Customer to new an Address

    private String line1;
    private String line2;

    private Address(String line1, String line2) { // private to new a Address object //封裝
      this.line1 = line1;
      this.line2 = line2;
    }

    public void print() { // can access the outer class
      System.out.println(addresses);
    }

    @Override
    public String toString() {
      return "Address(" + "line1= " + this.line1 + ", line2= " + this.line2 + ")";
    }

  }

  public static void main(String[] args) {

    Customer customer = new Customer();
    customer.addAddress("ABC", "HK"); // nested class use



  }



}
