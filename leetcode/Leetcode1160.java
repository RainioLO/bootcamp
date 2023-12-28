public class Leetcode1160 {
  public static int countCharacters(String[] words, String chars) {

    int count = 0;

    for (int i = 0; i < words.length; i++) {
      for (int j = 0; j < words[i].length(); j++) {
        if (words[i].charAt(j))


  }
}

  public static void main(String[] args) {


    String[] words = new String[] {"hello", "world", "leetcode"};
    String chars = "welldonehoneyr";

    System.out.println(countCharacters(words, chars));



  }



}
}
