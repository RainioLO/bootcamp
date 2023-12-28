package bank;

import java.time.LocalDateTime;

public class Transaction {

  // description

  private boolean isCredit;

  private int amount;

  private LocalDateTime dayTime;


  private Transaction(LocalDateTime dayTime, boolean isCredit, int amount) {
    this.dayTime = LocalDateTime.now();
    this.isCredit = isCredit;
    this.amount = amount;

  }

  public Transaction(boolean isCredit, int amount) {
    this(LocalDateTime.now(), isCredit, amount);

  }

  public Transaction() {

  }

  public static Transaction now(boolean isCredit, int amount) {
    return new Transaction(isCredit, amount);
  }

  public boolean isCredit() {
    return this.isCredit;
  }


  public int getAmount() {
    return amount;
  }

  public LocalDateTime getDayTime() {
    return dayTime;
  }


  @Override
  public String toString() {
    return " Transaction(: " + "datetime=" + this.dayTime + " balance $ "
        + this.amount + " isCredit " + isCredit;
  }


}
