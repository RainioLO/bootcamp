package bank;

import java.util.Arrays;

public class Account implements Transferable { // solid instance // everyone need to create new account class !

  // private int balance;

  private AccountHolder accountHolder;
  // private String type; // Saving, Mortage, etc...

  // Create Account, must have AccountHolder
  private Transaction[] transactions = new Transaction[0];



  @Override
  public boolean transfer(Transferable to, int amount) { // Transferable is an interface

    // use boolean do something without returning other solution
    if (amount <= 0)
      return false; // throw
    if (this.balance() < amount)
      return false;
    Account target = (Account) to;
    if (!target.credit(amount)) // if credit is not successful
      return false;
    return this.addTransaction(Transaction.now(false, amount));
  }

  @Override
  public String toString() {
    return "Account(transactions=" + Arrays.toString(transactions)
        + " , accountHolder=" + this.accountHolder.toString() + ")";
  }

  public Account(AccountHolder accountHolder) {
    // this.balance = 0;
    this.accountHolder = accountHolder;
  }


  public Account(String name, int age) {
    // this.balance = 0;
    this.accountHolder = new AccountHolder(name, age); // construcctor a AccountHolder when constructing Account
    this.transactions = new Transaction[0];
  }

  private boolean addTransaction(Transaction transaction) {
    Transaction[] newTransactions =
        Arrays.copyOf(this.transactions, this.transactions.length + 1);
    newTransactions[newTransactions.length - 1] = transaction;
    this.transactions = newTransactions;
    return true;

  }


  public int balance() {
    int sum = 0;
    for (int i = 0; i < this.transactions.length; i++) {

      if (this.transactions[i].isCredit()) {
        sum += this.transactions[i].getAmount();
      } else {
        sum -= this.transactions[i].getAmount();
      }
    }
    return sum;
  }


  public boolean credit(int amount) { // add
    return this.addTransaction(Transaction.now(true, amount));
  }


  public boolean debit(int amount) { // deduct
    if (this.balance() < amount)
      return false;
    return this.addTransaction(Transaction.now(false, amount)); // Transaction.now will create a new transaction
  }



  public static void main(String[] args) {


    Account johnAccount = new Account("John", 30);
    johnAccount.credit(3000);
    johnAccount.credit(1500);
    johnAccount.debit(4000);
    System.out.println(johnAccount.balance());

    Account peterAccount = new Account("Peter", 25);
    johnAccount.transfer(peterAccount, 350);

    System.out.println(johnAccount.balance());
    System.out.println(peterAccount.balance());


    Transferable maryAccount = new Account("Mary", 10);
    System.out.println(maryAccount.transfer(peterAccount, 200)); // false

    Account maryAccount2 = (Account) maryAccount; // Account pointer maryAccount2 point to maryAccount
    maryAccount2.credit(1000);
    System.out.println(maryAccount.transfer(peterAccount, 200)); // false

    // 3 objects , 4 pointer

    Object accountObject = new Account("jenny", 25);
    System.out.println(accountObject.toString()); // this can call toString() in Account

    System.out.println(peterAccount.toString());

  }

}
