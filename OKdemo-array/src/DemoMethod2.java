package src;

public class DemoMethod2 {

  public static void main(String[] args) {

    // Method 1
    String str = append("abc", "def");
    System.out.println("Method 1: " + append("abc", "def"));

    // Method 2
    String str2 = "fgjnfhbdffcdf";
    System.out.println("Method 2: " + getLastChar(str2));

    // Method 3
    String str3 = "helloworld";
    System.out.println("Method 3: " + isStartedWith(str3, "hello"));

    // Method 4
    String str4 = "abcbcdabc";
    System.out.println("Method 4: " + remove(str4, "bcd"));

    sound2("Dog");
    sound("Dog");
    // System.out.println(sound2("ABCdd"));


    System.out.println(notifyCustomer3());


  }


  public static void sound(String animal) { // method type is somehow related to the parameters

    // Early return
    if ("ABC".equals(animal)) {
      return; // leave the programme earlier
    }

    if ("Dog".equals(animal)) {
      System.out.println("wo wo");
      return;
    } else if ("Cat".equals(animal)) {
      System.out.println("meow");
      return;
    }
    System.out.println("Default sound ...");

  }

  public static String sound2(String animal) {

    if ("ABC".equals(animal)) {
      return ""; // leave the programme earlier
    }

    if ("Dog".equals(animal)) {
      // System.out.println("wo wo");
      return "wo wo";
    } else if ("Cat".equals(animal)) {
      // System.out.println("meow");
      return "meow";
    }
    // System.out.println("Default sound ...");
    return "Default sound...";

  }

  public static void notifyCustomer() {
    if (sendEmail()) {
      return;
    }
    sendSMS();
  }


  public static boolean notifyCustomer2() {

    if (sendEmail()) {
      return true;
    } else if (sendSMS())
      return false;
  }

  public static boolean notifyCustomer3() {

    return sendEmail() || sendSMS(); // return (return false || return false)
  }



  public static boolean sendEmail() {
    return false;
  }

  public static boolean sendSMS() {
    return false;
  }



  // s1 -> "abc"
  // s2 -> "def"
  // return -> "abcdef"
  public static String append(String s1, String s2) {

    String str = s1.concat(s2);
    return str; // return should be same type as method type

  }


  // Get the last character of the String s
  // if s length < 1, return ' ' (space character)
  public static char getLastChar(String s) {

    if (s.length() < 1) {
      return ' ';
    } else {
      char lastChar = s.charAt(s.length() - 1);
      return lastChar; // return a char
    }


  }


  // s -> "helloworld"
  // prefix -> "hello
  // return true"
  public static boolean isStartedWith(String s, String prefix) {

    // if (s.startsWith(prefix)) {

    // return true;
    // } else {
    // return false;
    // }

    boolean result = s.indexOf(prefix) == 0;
    return result;

  }


  // s -> "abcabcdabc"
  // toBemoved -> "bcd"
  // return "abcabc"
  public static String remove(String s, String toBeRemoved) {

    String newstr = s.replace(toBeRemoved, "");
    return newstr;


  }

}


