package lambda;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class DemoOperator {

  public static void main(String[] args) {

    BinaryOperator<String> concatStrings = (s1, s2) -> s1.concat(s2); // Binart<T, T, T>
    BiFunction<String, String, String> concatStrings2 =
        (s1, s2) -> s1.concat(s2);

    // in String out String
    // functional interface, only 1 method interface
    UnaryOperator<String> lowerCase = s1 -> s1.toLowerCase();

    System.out.println(lowerCase.apply("DKIRdfk"));

  }
}
