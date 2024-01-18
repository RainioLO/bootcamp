import java.util.HashSet;
import java.util.Set;

public class Leetcode389 {
  public char findTheDifference(String s, String t) {

    Set <Character> charSet = new HashSet<>();
    
    char ans = ' ';
    for (int i = 0 ; i < s.length(); i++){
      charSet.add(s.charAt(i));
    }

    if (t.charAt(1) == t.charAt(0) && t.length() == 2){
        return t.charAt(1);
    }

    for (int i = 0; i < t.length(); i++){
      if (!charSet.contains(t.charAt(i))){
        ans = t.charAt(i);
      }
    }
    return ans;
}
}
