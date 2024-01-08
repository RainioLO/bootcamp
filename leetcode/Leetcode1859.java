import java.util.Arrays;
import java.util.Comparator;

public class Leetcode1859 {

  public String sortSentence(String s) {

    String[] strings = s.split(" ");
    Arrays.sort(strings, Comparator.comparing(e -> e.charAt(e.length() - 1)));

    StringBuilder sb = new StringBuilder("");

    for (String word : strings) {
      sb.append(word.substring(0, word.length() - 1)).append(" ");
    }
    return sb.toString().trim();
  }



}
