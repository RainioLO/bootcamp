

/*
 * Expected Output : Example 1. 33% , The percentage of characters in s that equal the letter 'o' is 2 / 6 * 100% = 33% when rounded down, so we return 33. Example 2. 0% , The percentage of characters
 * in s that equal the letter 'k' is 0%, so we return 0.
 */
public class OKJavaQuest15 {
  // Question :
  // Given a string s and a character letter, return the percentage of characters
  // in s that equal letter rounded down to the nearest whole percent.

  // Constraints:
  // 1<=s.length<=100
  // s consists of lowercase English letters.
  // letter is a lowercase English letter.

  public static void main(String[] args) {
    // Example 1
    String s1 = "foobar";
    char letter1 = 'o';
    System.out.println("Example 1 : " + percentageLetter(s1, letter1));

    // Example 2
    String s2 = "jjjj";
    char letter2 = 'j';
    System.out.println("Example 2 : " + percentageLetter(s2, letter2));
  }

  public static int percentageLetter(String s, char letter) {
    // code here
    int count = 0;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == letter) {
        count++;
      }
    }
    return (count * 100/ s.length() );
  }
}
