import java.util.Arrays;

public class Leetcode557 {


  public static String reverseWords(String s) {

    String[] str = s.split(" ");
    StringBuilder reversed = new StringBuilder("");

    for (String word : str) {
      StringBuilder reversedWord = new StringBuilder(word);
      reversedWord.reverse();
      reversed.append(reversedWord).append(" ");

    }
    return reversed.toString().trim();
  }

  public static void main(String[] args) {

    System.out.println(reverseWords("jdf jdhf djogf odf "));
    




  }



}
