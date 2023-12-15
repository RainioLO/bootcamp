package src;

public class DemoStringLiteral {
  public static void main(String[] args) {

    String s1 = "John";
    String s2 = "John";

    System.out.println(s1.equals(s2)); // true (same value)
    // ==, check if they are same object
    System.out.println(s1 == s2); // check if s1 and s2 are the same object

    String s3 = new String("John"); // 強行開 new string
    System.out.println(s1.equals(s3)); // true same value
    System.out.println(s1 == s3); // false (different objects) //check object's address

    String s4 = String.valueOf("John"); //
    System.out.println(s1.equals(s4)); // true same value
    System.out.println(s1 == s4); // true s4 string object is in literal pool
    System.out.println(s2 == s4); // true s4 string object is in literal pool
    System.out.println(s3 == s4); // false


    s1 = "John2";
    System.out.println(s1 == s4); // false
    System.out.println(s2 == s4); // true


    s2 = s2 + "3"; //"John3"
    System.out.println(s2 == s4); //false

    s2 = "John";
    s2 =s2 +"2"; //"John2"
    System.out.println(s1.equals(s2));
    System.out.println(s1 == s2);

  }



}
