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
    System.out.println("hello"+ " " + "world"); // helloworld

    String str1 = "hello";
    System.out.println(str1); //"hello"
    System.out.println("hello word count:" +str1.length()); //5
    str1 = str1 + "world";






    // No "-", "*", "/" in String
  }

}
