public class DemoChar {
  public static void main (String[] args) {
    char c1 = 'a';
    char c2 = 'b';
    char c3 = 'c';
    char c4 = '#';
    char c5 = '1';
    // char c6 = "10"; //syntax error, string -> char
    // char c7 = '10'; // syntax error, char value should be single character
    // char c8 = ' '; // syntax error, char has to be at least one character
    char c9 = '好';
    char c10 = 1; // char -> int (int 升級)
    System.out.println(c9);
    String s = "10人";

    String isPassed = "P"; // or "F"
    char isPassed2 = 'P'; // or 'F'
    boolean isPassed3 = true; //the best approach to describe pass or fail
    System.out.println(s);
    System.out.println(isPassed2);
    System.out.println(isPassed);

    boolean man;
    man=false;
    System.out.println(man);

  }
  
}
