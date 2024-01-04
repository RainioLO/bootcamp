import java.util.HashMap;
import java.util.Map;

public class Leetcode2744 {

  public int maximumNumberOfStringPairs(String[] words) {

    Map<String, Integer> map = new HashMap<>();
    int counter = 0;

    for (int i = 0; i < words.length; i++) {
      String r = new StringBuilder(words[i]).reverse().toString();

      if (map.containsKey(r)) {
        map.put(r, map.get(r) + 1); // .get by key
      } else {
        map.put(words[i], 0);
      }
    }

    for(int value: map.values()){
        counter += value;
    }
    return counter;
  }
}
