import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        // Instance Method
        List<String> strings = new ArrayList<>(List.of("abcde", "ijk", "defg"));

        // length()
        List<Integer> strLengths = strings.stream().map(e -> e.length())
                .collect(Collectors.toList());
        System.out.println(strLengths);

        strLengths = strings.stream().map(String::length) // String.length for each
                .collect(Collectors.toList());



        strings.stream().forEach(e -> System.out.println(e)); // consume the e to printout

        // method reference: alternative as a lambda expression
        strings.stream().forEach(System.out::println);
        // When there is a single input, and there is only one input parameter of the method


        List<String> sortedStrings =
                strings.stream().sorted((s1, s2) -> s1.compareTo(s2)) // comparator input
                        .collect(Collectors.toList());
        System.out.println(sortedStrings);

        
        sortedStrings = strings.stream().sorted(String::compareTo)
                .collect(Collectors.toList());
        System.out.println(sortedStrings);



        // Static Method


    }
}
