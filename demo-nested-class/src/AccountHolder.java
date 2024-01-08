public class AccountHolder { // outer class

  private Account account;
  private String name;

  public AccountHolder(String name) {
    this.name = name;

  }

  public AccountHolder(Account account) {
    this.account = account;
  }

  public void setAccount(Account account) {
    this.account = account;
  }

  public Account createAccount(String accountNo) {
    return new Account(accountNo);
  }

  // ___________________________________________________

  public class Account { // inner class
    private String accountNo;

    public Account(String accountNo) {
      this.accountNo = accountNo;
    }

    public void printHolderName() {
      System.out.println(name); // public static cannot access outer class
    }

    public Account(){

    }


  }



  public static void main(String[] args) { // JVM call this
    AccountHolder john = new AccountHolder("John");
    // Account joinAccount = john.new Account("1234");
    Account joinAccount = john.createAccount("1234");
    joinAccount.printHolderName();

    //Account abc = new Account("12344");

  AccountHolder.Account abds = new Account(); // cannot create new object by normal class through outer class

  }

}
