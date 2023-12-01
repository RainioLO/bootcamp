public class DemoStr {
  public static void main(String[] args) {
    String emailAdress = "rainlo0427@gmail.com"; // 放變量(see left side first)
    //String s = 3; // s is declared by String, so cannot assign int value
    // int i = "hello"; // i is declared by int, you cannot assign String Value

    System.out.println(emailAdress); // rainlo0427@gmail.com print put emailadress is rainlo0427@gmail.com


    // ** Operations, append (concat) String 可以相加
    String str = "hello"+ " " + "world"; //(" ") Can be regardsed as space
    System.out. println(str);
    //always look at the code inside the bracket first
    // Step 1: "hello" +" "+ "world" -> "hello world"
    //Step 2: System.out. println() -> print out
    System.out.println("hello"+ " " + "world"+ "!!!"); // helloworld
    System.out.println("word count:" + str.length());
    System.out.println(str);

    String str1 = "hello";
    System.out.println(str1); //"hello"
    System.out.println("hello word count:" +str1.length()); //5
    str1 = str1 + "world";
    System.out.println(str1); //"hello"
    System.out.println("helloworld word count:" +str1.length()); //10 //string is functional

    // if, =, ==(primitive use)
    int x = 0; // one = means assignment
    int x2 = 3; // one = means assignment
    if (x == x2) { // == is asking if they are equal x is x2 or not
      // this statement return false, so the flow will not fall into this block of code
    System.out.println("x is equals to x2");
    } else {
      System.out.println("x is not equals to x2");
      // sysout is shout cut to System.out.println()
    }

    // String is not a primitive, so you cannot use == to compare their value
    String s1 = "hello";
    String s2 = "hello";
    if (s1.equals(s2)) { //String is non-primitive, dont use ==, use equals only
      System.out.println("Cong! s1 is equals to s2"); // simply wording to be shown
    }
    if ("hello".equals(s1)) { // comparing string value to a string variable
      // if (s1.equals("hello")) // don't code in this way (string value 放前面)
      System.out.println("s1 is hello");
    }
    if ("hello".equals("hello")) { // always true
      System.out.println("ABC");
    }

    //if (s1>13) { //cant compare "hello" with 13

    // charAt() (是一個工具) //for searching
    // 4 is an index of String.
    // Example: "hello", h -> index=0
    // e -> index=1
    // l -> index=2
    // l -> index=3
    // o -> index=4
    //char c = s1.charAt("4"); //o , can't be "4" should be an int
    //s1.charAt(4) return 'o'
    char c = s1.charAt(4);
    System.out.println(c);

    s1 = "Vincent";
    // what if we always get the last character of the String

    //Approach 1
    int lastCharIndex= s1.length()-1;
    char lastchar = s1.charAt(lastCharIndex);
    System.out.println(lastchar);

    //Approach 2
    //lastChar = s1.charAt(s1.length()-1);
    //System.out.println(lastChar);


    }


    // No "-", "*", "/" in String
  }

