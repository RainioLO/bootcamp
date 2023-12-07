public class Leetcode2000 {



  public static void main(String[] args) {

    String str = "sjhbdfjhsdfnmv";

  }



  public String reversePrefix(String word, char ch) { // dbifk

    StringBuilder sb = new StringBuilder(word);

    for (int i = 0; i < sb.length(); i++) {
      if (sb.charAt(i) == ch) {
        for (int j = 0; j < i / 2 +1; j++) {
          if (sb.length() == 0) {
            break;
          }
          char temp = sb.charAt(i - j);
          sb.setCharAt(i - j, sb.charAt(j)); // = charStr[i - 1 - j];
          sb.setCharAt(j, temp);
        }
        break;
      }
    }

    return String.valueOf(sb);


  }



}
