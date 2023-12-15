public class Leetcode2114 {
  public int mostWordsFound(String[] sentences) {

    int counter = 1;
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < sentences.length; i++) {

      for (int j = 0; j < sentences[i].length(); j++) {

        if (sentences[i].charAt(j) == ' ')
          counter++;
      }
      if (counter > max)
        max = counter;
      counter = 0;
    }
    return max;
  }
}
