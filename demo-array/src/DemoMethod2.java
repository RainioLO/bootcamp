package src;

public class DemoMethod2 {

  public static void main(String[] args) {

    // Method 1
    String str = append("abc", "def");
    System.out.println("Method 1: " + str);

    // Method 2
    String str2 = "fgjnfhbdffcdf";
    System.out.println("Method 2: " + getLastChar(str2));

    // Method 3
    String str3 = "helloworld";
    System.out.println("Method 3: " + isStartedWith(str3, "hello"));

    // Method 4
    String str4 = "abcbcdabc";
    System.out.println("Method 4: " + remove(str4, "bcd"));

  }



  // s1 -> "abc"
  // s2 -> "def"
  // return -> "abcdef"
  public static String append(String s1, String s2) {

    String str = s1.concat(s2);
    return str;

  }


  // Get the last character of the String s
  // if s length < 1, return ' ' (space character)
  public static char getLastChar(String s) {

    if (s.length() < 1) {
      return ' ';
    } else {
      char lastChar = s.charAt(s.length() - 1);
      return lastChar;
    }


  }


  // s -> "helloworld"
  // prefix -> "hello
  // return true"
  public static boolean isStartedWith(String s, String prefix) {

    if (s.startsWith(prefix)) {

      return true;
    } else {
      return false;
    }


  }


  // s -> "abcabcdabc"
  // toBemoved -> "bcd"
  // return "abcabc"
  public static String remove(String s, String toBeRemoved) {

    String newstr = s.replace(toBeRemoved, "");
    return newstr;


  }

}


