/**
 * Exercise:
 * 1. Implement try catch block to catch CustomException
 * 2. Write the logic to throw exception
 */
/**
 * Expected Output:
 * ACCNO   CUSTOMER        BALANCE
 * 1001    Nish    10000.0
 * 1002    Shubh   12000.0
 * 1003    Sush    5600.0
 * 1004    Abhi    999.0
 * CustomException: Abhi's balance is less than 1000.
 *         at Exercise32.main(Exercise32.java:XX)
 * Checking End. Please contact the account holder if any of them balance < 10000
 * End of the main program.
 */
class CustomException extends Exception {

    // default constructor
    CustomException() {
    }

    // parameterized constructor
    CustomException(String str) {
        super(str);
        System.out.println("Some More Actions can be done here for Custom Exception");
    }
}

class Exercise32 {
    // store accounts
    private static int accNo[] = { 1001, 1002, 1003, 1004 };
    // store account holders
    private static String holder[] = { "Nish", "Shubh", "Sush", "Abhi", "Akash" };
    // store account balances
    private static double balance[] = { 10000.00, 12000.00, 5600.0, 999.00, 1100.55 };

    public static void main(String[] args) {

        try {
            // display the heading for the table
            System.out.println("ACCNO" + "\t" + "CUSTOMER" + "\t" + "BALANCE");

            for (int i = 0; i < 5; i++) {
                // display the actual account data for all account holders

                // display own exception if balance < 1000
            }
            System.out.println("This is the end of the program, but it would not come here.");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            
        }
    }
}