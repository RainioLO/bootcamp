public class Leetcode2810 {

  public String finalString(String s) {
    StringBuilder sb = new StringBuilder(s);
    StringBuilder sb2 = new StringBuilder();

    for (int j = 0; j < sb.length(); j++) {
      if (sb.charAt(j) != 'i') {
        sb2.append(sb.charAt(j));
      } else {
        sb2.reverse();
      }
    }
    return sb2.toString();
  }
}
