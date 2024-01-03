public class Leetcode344 {
  public void reverseString(char[] s) {

    String[] arr = new String[s.length];

    for (int i = 0; i < arr.length; i++) {
      arr[i] = String.valueOf(s[s.length - 1 - i]);
    }
  }
}
