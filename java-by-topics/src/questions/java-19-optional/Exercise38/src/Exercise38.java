import java.util.*;
import java.util.function.*;

/**
 * Exercise: Try orElseThrow() to handle exception. Declare a custom Expection class with a String
 * Message Constructor. Implement try/catch block to catch the custom expcetion and print the
 * message you passed in.
 */
/**
 * Expected Output: 
 * Optional: Optional.empty 
 * it's throwing my Custom Expection
 */

// Implement a custom exception class with a String Message Constructor.

public class Exercise38 {
    public static void main(String[] args) {

        // create a Optional
        Optional<Integer> op = Optional.empty();
        // You can try assign an integer after you implemented orElseThrow()
        // Optional<Integer> op = Optional.of(100);

        // print supplier
        System.out.println("Optional: " + op);

        // Implement try/catch block to catch custom exception
        // If op is presented, print "op is Present: "
        // Use op.orElseThrow() to throw exception if op is not presented.
        
        // orElseThrow - Provide supplier
        System.out.println("op is Present: " + op.orElseThrow()); // revise it

    }
}
