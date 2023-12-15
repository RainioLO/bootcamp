package src;

public class DemoStringMethod {
  public static void main(String[] args) {

    String str = "  hello world !   ";

    // is empty ()
    if (str.isEmpty()) {
      System.out.println("String = " + str);
    }
    // length ()
    System.out.println("str length=" + str.length());

    // charAt () //抽String 的字, can be used with for loop
    // even number index of the character in string
    for (int i = 0; i < str.length(); i++) {
      if (i % 2 == 0) {
        System.out.print(str.charAt(i));
      }
    }
    System.out.println("");


    // substring()startIndex, end Index -1)
    // substring (startIndex)
    String s = "hello"; // 在declare 左的string 抽範圍內的字
    String newStr = s.substring(2, 4); // index start from 0 print 2 and (4-1) index
    System.out.println("newStr=" + newStr); // print index from 2 - 3
    System.out.println(newStr.substring(0)); // put in start index 沒有end index 就可以頭到尾

    // trim(), remove all spaces in the head and tail of the string
    // str = " hello world ! "
    System.out.println(str.trim()); // "hello world!"
    System.out.println(newStr.trim()); // ll

    String s2 = "HELLo, woRld!!";
    System.out.println(s2.toUpperCase()); // Hello WORLD!!
    System.out.println(s2.toLowerCase()); // hello world!!

    // equals()
    // equalsIgnoreCase()
    System.out.println("HELLo, woRld!!".equals("hello, world!!")); // false
    System.out.println("HELLo, woRld!!".equalsIgnoreCase("hello, world!!")); // true
    System.out.println("HELLo, woRld!!".equalsIgnoreCase("hello")); // false

    // startsWith("")
    // endsWith("")
    System.out.println(s2.startsWith("HELLo")); // true
    System.out.println(s2.startsWith("Hello")); // false
    System.out.println(s2.startsWith("H")); // true
    System.out.println(s2.startsWith(" ")); // false
    System.out.println(s2.startsWith("")); // true

    // endsWith
    System.out.println(s2.endsWith("woRld!!"));
    System.out.println(s2.endsWith("WoRld!!"));
    System.out.println(s2.endsWith("!"));
    System.out.println(s2.endsWith(" "));


    String s3 = "1234567890";
    // you try 2 String methods , and use && operator to check true/false
    // return true

    if (s3.startsWith("1") && s3.endsWith("0")) {
      System.out.println("true");
    }

    System.out.println("Example :" + (s3.length() == 10 && s3.startsWith("1")));
    System.out.println("Example 2 :" + ("56".equals(s3.substring(4, 6))
        && s3.charAt(s3.length() - 1) == '0'));

    // indexOf ()
    System.out.println(s3.indexOf('7')); // 6 (int)
    System.out.println(s3.indexOf('m')); // -1 (int) 不存在的character 出-1
    // searching '7' starting from index 8
    System.out.println(s3.indexOf('7', 8)); // 6 (int)

    System.out.println("Method 1: " + s3.length());
    System.out.println("Method 2: " + s3.charAt(s3.length() - 1));
    System.out.println("Method 3: " + "A5".equals(s3.substring(4, 6)));

    // lastIndexOf()
    String s4 = "1234512345";
    System.out.println(s4.indexOf('5')); // 4
    System.out.println(s4.lastIndexOf('5')); // 9

    System.out.println(s4.indexOf("345")); // 2 find the pattern at which index start with
    System.out.println(s4.indexOf("3 45")); // -1

    System.out.println(s4.lastIndexOf("345")); // 7
    System.out.println(s4.lastIndexOf("3 45")); // -1

    System.out.println(s4.lastIndexOf('4', 7)); // 3 index 7 前找 char '4'
    System.out.println(s4.lastIndexOf('4', 2)); // -1

    String s5 = "ABabcXabcdef";
    System.out.println(s5.lastIndexOf("abc") == 6 && s5.endsWith("def")
        && s5.indexOf("abc") == 2 && s5.startsWith("ABa") && s5.length() > 10);

    String s6 = "abc";
    String s7 = "def";
    System.out.println(s6 + s7);
    System.out.println(s6.concat(s7)); // concat = s6 + s7

    System.out.println(s5.contains("abcdef")); // true
    System.out.println(s5.indexOf("abcdef") != -1); // true

    System.out.println(s5.contains("XXX")); // false

    String result = s5.toUpperCase();
    System.out.println(result); // ABABCXABCDEF
    String result2 = result.substring(3, 7); // BC
    System.out.println(result2);

    String result3 = s5.toUpperCase().substring(3, 5);
    System.out.println(result3);

    String result4 = s5.toLowerCase().substring(3, 8).concat(" Hello world").substring(2, 7).toUpperCase();
    System.out.println(result4.contains("AB"));

    String result5 = s5.toUpperCase().substring(1,2).concat("ijk");
    System.out.println(result5); //Bijk



    



  }
}

