
/**
 * Given an array of strings patterns and a string word, return the number of
 * strings in patterns that exist as a substring in word.
 * 
 * A substring is a contiguous sequence of characters within a string.
 * 
 */
/*
 * Constraints:
 * 
 * 1 <= patterns.length <= 100
 * 1 <= patterns[i].length <= 100
 * 1 <= word.length <= 100
 * patterns[i] and word consist of lowercase English letters.
 */
public class JavaQuest28 {
    public static void main(String[] args) {
        System.out.println(StringsNumber(new String[] { "a", "abc", "bc", "d" }, "abc")); // output : 3
        System.out.println(StringsNumber(new String[] { "a", "b", "c", "d" }, "aaaabbababba")); // output : 2
        System.out.println(StringsNumber(new String[] { "xyz", "x", "y", "z" }, "abc")); // output : 0
        System.out.println(StringsNumber(new String[] { "a", "a", "a", "" }, "ab")); // output : 3
    }

    public static int StringsNumber(String[] patterns, String word) {
        // code here ...
    }
}
