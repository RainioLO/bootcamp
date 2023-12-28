import java.util.Comparator;

public class SortByDesc implements Comparator<String> {



  @Override
  public int compare(String str1, String str2) {
    return str1.charAt(0) > (str2.charAt(0)) ? -1 : 1; // decending if larger 放左手

  }

}
