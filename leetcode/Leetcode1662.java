public class Leetcode1662 {
  public boolean arrayStringsAreEqual(String[] word1, String[] word2) { // word1 = ["ab", "c"], word2 = ["a", "bc"]

    StringBuilder sb = new StringBuilder("");
    StringBuilder sb2 = new StringBuilder("");

    for (int i = 0; i < word1.length; i++) {
      sb.append(word1[i]);
    }

    for (int i = 0; i < word2.length; i++) {
      sb2.append(word2[i]);
    }

    if (sb.toString().equals(sb2.toString()))
      return true;
    return false;

  }
}
