package lambda;

import java.util.function.Function;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;

public class DemoFunction {

  public static void main(String[] args) {
    // f(x) = x + 3;
    // y = x + 3;

    // <Input, return type>
    // R apply (T t), R -> Integer
    Function<String, Integer> stringLength = (str) -> {
      return str.length(); // no need to write the interface
    };

    System.out.println(stringLength.apply("hello")); // 5
    System.out.println(stringLength.apply("abc")); // 3

    // R apply (T t)
    Function<String, String> firstChar = (str) -> {
      return String.valueOf(str.charAt(0));
    };
    System.out.println(firstChar.apply("John"));
    System.out.println(firstChar.apply("Mary"));

    Function<String, String> concatHello = s1 -> s1.concat("hello");
    concatHello.apply("abc"); // "abchello"

    // 2 in 1 out
    BiFunction<List<String>, Integer, String> getByIndex = (strings, index) -> {
      return strings.get(index);
    };

    getByIndex.apply(new ArrayList<>(List.of("abc", "def", "ijk")), 1); // def

    // Example of BiFunction
    Map<String, String> dicMap = new HashMap<>();
    dicMap.put("John", "ABC");
    dicMap.put("Mary", "IJK");

    BiFunction<String, String, String> remapFunc = (key, oldValue) -> { // like a formula
      if (oldValue == null)
        return "hello";
      return oldValue.concat("end");
    };

    dicMap.compute("Mary", (key, oldValue) -> oldValue.concat("end"));

    System.out.println(dicMap.get("Mary")); // IJKend

    dicMap.compute("Peter", remapFunc);
    System.out.println(dicMap.get("Peter")); // hello // three entries here john, mart, peter


  }



  // same as BiFunction
  public static String getByIndex(List<String> strings, Integer index) {
    return strings.get(index);
  }

}
