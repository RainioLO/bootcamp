package src;

public class DemoASCII {
  public static void main(String[] args) {
    char value = 'C';
    int ascii = value;
    System.out.println(ascii);

    System.out.println(value == 'C'); // true (check char = check the int behind)
    System.out.println(value == 67); // true 'C' = 67
    System.out.println(value > 64); // true
    System.out.println(value < 64); // false

    char c2 = '好';
    int ascii2 = c2;
    System.out.println(ascii2); // ASCII is int -- Conversion to the char

    String s1 = "abcdef";
    String s2 = "banana";
    String s3 = "ABCDEF";
    String s4 = "acbdef";
    String s5 = "abcd";
    String s6 = "abcA";

    // String 不會用 operator (++, +=, --, -=, .....)
    System.out.println(s2.compareTo(s1)); // 1 ('b' - 'a')
    System.out.println(s1.compareTo(s2)); // -1 ('a' - 'b')
    System.out.println(s3.compareTo(s1)); // -32 ('A' - 'a')
    System.out.println(s4.compareTo(s1)); // 1, same 'a', then compare second character 'c' - 'b'
    System.out.println(s5.compareTo(s1)); // -2, same character, will compare the length of string
    System.out.println(s6.compareTo(s1)); // 'A' - 'd' = -35

    System.out.println(s6.compareTo(s1) == s6.compareTo(s5));

    // value = 'z';
    // ascii = value;
    // System.out.println(ascii);

    // value = '{';
    // ascii = value;
    // System.out.println(ascii);

    // value = '_';
    // ascii = value;
    // System.out.println(ascii);



  }
}
