public class Leetcode1408 {
  public String[] stringMatching(String[] words) {

    String[] arr = new String[0];
    int idx = 0;

    for (int i = 0; i < words.length; i++) {
      for (int j = i + 1; j < words.length; j++) {

        if (words[i].contains(words[j])) {

          String[] newArr = new String[arr.length + 1];
          newArr[idx++] = words[j];
        }
      }


    }


  }
}
