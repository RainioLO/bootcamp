public class Leetcode2255 {
  
  public int countPrefixes(String[] words, String s) {
        
    int counter = 0;
    for (int i = 0; i < words.length ; i++) {

      if (s.startsWith(words[i])){
        counter++;
      }

        
    }

    return counter;

}
}
