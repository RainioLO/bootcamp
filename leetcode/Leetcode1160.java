public class Leetcode1160 {
  public static int countCharacters(String[] words, String chars) {

    int sum = 0;
    int count = 0;

    for (int i = 0; i < words.length; i++) {

      for (int j = 0; j < words[i].length(); j++) {


        for (int k = 0; k < chars.length(); k++) {

          if (words[i].charAt(j) == chars.charAt(k)) {
            count += 1;
          }else{
            count = 0;
            break;
          }
           sum += count;
           count =0;
        }
      }
    }

    return sum;
  }

  public static void main(String[] args) {


    String[] words = new String[] {"hello", "world", "leetcode"};
    String chars = "welldonehoneyr";

    System.out.println(countCharacters(words, chars));



  }



}
