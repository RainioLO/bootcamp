package literalpool;

public class DemoString {

  public static void main(String[] args) {

    String str1 = "hello";
    String str2 = "hello"; // check if "hello" exist in String Literal Pool
    // so that JVM can reuse "hello" (String Object) by various object reference str1/2 = new ..., in heap memory

    System.out.println(str1.equals(str2)); // true
    System.out.println(str1 == str2); // true

    String str3 = "hello!"; // different String Object --> "hello!"
    System.out.println(str1.equals(str3)); // false
    System.out.println(str1 == str3); // false


    String str4 = new String("hello");
    System.out.println(str1.equals(str4)); // true
    System.out.println(str1 == str4); // false (differenct object createdd with "new")

    String str5 = String.valueOf("hello");
    System.out.println(str1.equals(str5)); // true : value
    System.out.println(str1 == str5); // true look up to the literal pool first, if have assign to the same object reference


    // Concatentation
    String str7 = "abc";
    String str8 = str7 + "def"; // there will be two string objects in literal pool
    System.out.println(str7 == str8); // false
    //
    String str9 = "aaa";
    String str10 = new String("aaabbb");
    String str11 = "aaabbb";
    // System.out.println(str10 == str11); // false

    // String str12 = "aaa";
    String str13 = new String("aaabbb").intern(); // str13 point to the literal pool
    String str14 = new String ("aaabbb");
    // System.out.println("trial: " + (str13 == str14)); // true
     System.out.println("trial: " + (str11 == str13)); 
    // System.out.println(str11 == str14); // true


    if ("hello".equals(str5)) { // find "hello" in the string literal pool first
      System.out.println("str5 is equal to hello");
    }

    // String str6 = null;
    // if (str6.equals("Hello")) { // (.method) str6(address) cannot find the object in heap memory
    // System.out.println(1); // .method is to find the method on the object.
    // }


  }
}
