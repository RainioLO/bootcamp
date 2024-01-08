import java.util.Optional;
import java.util.Random;

/**
 * Exercise: Practice Optional.of()/ ofNullable()/ orElseGet()/ ifPresentOrElse()
 */
/**
 * Expected Output:
 * Optional: Optional[9455]
 * op1's value is present: 9455
 * Optional op2: Optional.empty
 * Convert Optional<Integer> to Integer: 3
 */
class Exercise37Ans {

    public static void main(String[] args) {
        Integer a = 1;
        Integer.toBinaryString(100); // 101

        // New an array
        int[] arr = new int[3];
        int[] arr2 = { 1, 3 };
        int[] arr3 = new int[] { 1, 4 };

        // create a Optional by Optional.of
        Optional<Integer> op = Optional.of(9455);

        // print value op
        System.out.println("Optional: " + op);

        // Use ifPresentOrElse method to print different statements
        // If it presents, print "op1's value is present: "
        // Otherwise, print "op1's value is empty"
        // Code here ...

        // Declare another Optional<Integer> variable with null value assigned
        // Code here ...

        // print value op2
        System.out.println("Optional op2: " + op2);

        // Convert Optional<Integer> to Integer
        // By using orElseGet() method to handle null scenario, by assigning random
        // number 0 - 10 if op2 is null
        // Tips: You can use Random()
        // Code here ...

        // print value op2
        System.out.println("Convert Optional<Integer> to Integer: " + integer);
    }
}
