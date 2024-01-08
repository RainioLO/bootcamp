import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalDouble;

public class DemoOptional {
    public static void main(String[] args) {
        // Cat: age, name -> Cat
        // Cat.class , Cat is a name of a class only. You can name it anything, such as Box.
        // or you can simply treate it as AgeAndNameHolder.class

        // Optional provides a container object that may or may not contain a non-null value.
        // It offers methods for performing operations on the value if it is present or handling the absence of a value.

        Account account = DemoOptional.setUp(1, 0.0d);
        account.credit(10.0d);

        Account account2 = DemoOptional.setUp(0, 0.0d); // accountNo 0 is not allowed -> return null
        // account2.credit(200.d); //NullPointerException

        // as a caller, we can generally handle the null value in this way
        DemoOptional.setUp2(2, 0.0d).ifPresent(acct -> { // Optional can hold everything,
            acct.credit(1000.d);
        });


        // Approach 2 to handle Optional return value
        Optional<Account> oa = DemoOptional.setUp2(-1, 0.0d);
        if (oa.isPresent()) { // test if present first
            oa.get().credit(0); // cannot get if nothing inside
        } else { // oa is null -> do nothing
            System.out.println(
                    "I decided to do nothing when Account Object is null.");
        }

        List<Account> accounts = new ArrayList<>(
                List.of((new Account(1, 0.0d)), (new Account(-1, 50.0d))));

        Optional<Account> optaccount = accounts.stream() // is one Account object
                .filter(e -> e.getBalance() > 30.0d).findFirst();

        Optional<Account> optaccount2 = accounts.stream() // is one Account object
                .filter(e -> e.getBalance() > 30.0d).findAny();


        optaccount.ifPresent(e -> {
            // Perform an action on the account object
            System.out.println("111 Account balance: " + e.getBalance());
        });

        Account acct = optaccount2.orElse(new Account(99, 0.1d)); // if cannot find -> creat a new Account

        Account acct2 = optaccount2.orElseGet(() -> new Account(99, 0.1d));

        Account acct3 =
                optaccount2.orElseThrow(() -> new NoSuchElementException());

        OptionalDouble maxBalance =
                accounts.stream().mapToDouble(e -> e.getBalance()).max();


        double max = 0.0d;
        if (maxBalance.isPresent()) {
            max = maxBalance.getAsDouble(); // if the max balance is present --> get the double value
        }
        max = maxBalance.orElse(-1.0d); // if no not present -> give -1.0d

        System.out.println(max); // 120.0d as it can be no


    }

    public static Account setUp(int accountNo, double balance) {
        // Objects.requireNonNull(accountNo); // throw exception if Null
        // Objects.requireNonNull(balance); // must not be null

        if (accountNo <= 0 || balance < 0)
            return null;
        return new Account(accountNo, balance);
    }

    public static Optional<Account> setUp2(int accountNo, double balance) {
        // Objects.requireNonNull(accountNo); // throw exception if Null
        // Objects.requireNonNull(balance); // must not be null

        if (accountNo <= 0 || balance < 0)
            return Optional.empty(); // this is not a null -> it is the address of the null, empty
        return Optional.of(new Account(accountNo, balance)); // Optional.of() means it cannot be null must have Account even has null in attributes
    }

    // Optional.ofNullable() , can be null or not


    // dont return null in Optional, return Optional.empty();
    // public static Optional<Account> setup3(Optional<Integer> accountNo,
    // Optional<Double> balance) {
    // if (accountNo == null) // null check
    // return Optional.empty();
    // if (accountNo.isPresent()){ // nullpointor
    // }
    // }

    // Important Note: We never use Optional<T> as input parameter's type ...
    // Inside the method, we still need to perform the null check on Optional<T> ...
    // So we cant see any benefit in using Optional<T> in input parameter



}
