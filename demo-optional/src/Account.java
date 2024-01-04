import java.util.Optional;

public class Account {


  private double balance;
  private int accountNo;

  // Important Note:
  // Optional<T> is not suitable for Class attribute.
  // Optional<T> does not support serialization/ deserialization natually
  // private Optional<String> currency; ??? // Optional means it may be null -> nullpointorexception , error

  // nned to do null check when put wrong places

  public Account(int accountNo, double balance) {
    this.accountNo = accountNo;
    this.balance = balance;

  }

  public int getAccountNo() {
    return this.accountNo;
  }

  public double getBalance() {
    return this.balance;
  }

  public void credit(double amount) {
    this.balance += amount;
  }

  public boolean debit(double amount) {
    if (balance < amount)
      return false;
    this.balance -= amount; // must use BigDecimal to fix the error
    return true;

  }
}
