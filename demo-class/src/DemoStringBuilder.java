public class DemoStringBuilder {
  public static void main(String[] args) {
    // String +=, cpncat()
    String x = "abc";
    x += "def";
    x = x.concat("def"); // 要放入x先 (pass by value)
    System.out.println(x); //abcdefdef

    // StringBuilder
    StringBuffer y = new StringBuffer("abc");
    y.append("def").append("def");  // y is adress, append in object, append in object / create new String result
    System.out.println(y); 
    System.out.println(y.toString()); 






  }



}
