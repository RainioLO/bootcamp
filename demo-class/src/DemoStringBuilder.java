public class DemoStringBuilder {
  public static void main(String[] args) {
    // String +=, cpncat()
    String x = "abc";
    x += "def";
    x = x.concat("def"); // 要放入x先 (pass by value)
    System.out.println(x); // abcdefdef

    // StringBuilder
    StringBuilder y = new StringBuilder("abc");
    y.append("def").append("def"); // y is adress, append in object, append in object / create new String result
    System.out.println(y);
    System.out.println(y.toString());

    // while loop -> counter
    // 123 456 789 101112 ...
    int counter = 4; // 123 456 789 101112

    StringBuilder sb = new StringBuilder("");
    int num = 0;
    while (counter-- > 0) {
      // sb.append(++num).append(++num).append(++num);
      for (int i = 0; i < 3; i++) {
        sb.append(++num);
      }
      if (counter > 0)
        sb.append(" ");
    }
    System.out.println(sb.toString());

    StringBuilder sbb = new StringBuilder("");

    StringBuilder sb2 = new StringBuilder("");


    int num2 = 0;
    int counter2 = 0;
    while (counter2++ < 4) {
      for (int i = 0; i < 3; i++) {
        sb2.append(++num2);
      }
      if (counter2 < 4)
        sb2.append(" ");
    }
    System.out.println("sb2: " + sb2);


    // aaa bbb ccc

    counter = 4;
    int z = 97;
    StringBuilder sb3 = new StringBuilder(""); // from string to char[], good to use loop

    while (counter-- > 0) {
      for (int i = 0; i < 3; i++) {
        sb3.append((char) z);
      }
      if (counter > 0) {
        sb3.append(" ");
      }
      z++;

    }
    System.out.println(sb3.toString());
    System.out.println(sb3.reverse().toString());

    System.out.println(sb3.insert(4, "bootcamp").toString()); // ddd bootcampccc bbb aaa
    System.out.println(sb3.delete(0, 6)); // otcampccc bbb aaa

    sb3.setCharAt(2, 'J');
    System.out.println(sb3.toString());
    System.out.println(sb3.charAt(2));
    System.out.println(sb3.toString()); // otcampccc bbb aaa

    sb3.replace(2, 6, "abc");
    System.out.println(sb2.toString()); // otabcccc bbb aaa

    sb3.isEmpty();
    sb3.length();

    StringBuilder s1 = new StringBuilder("abc");
    StringBuilder s2 = new StringBuilder("abc");

    System.out.println(s1.toString().equals(s2.toString())); // talking about the string value
    System.out.println("HEYHEY " +s1.equals(s2)); // talking about the object reference
    System.out.println("HEYHEY11 " + (s1 == s2));


    StringBuilder sb33 = new StringBuilder("");
    int z1 = 97;
    counter = 0;
    while (counter++ < 4) {
      for (int i = 0; i < 3; i++) {
        sb33.append((char) z1);
      }
      z1++;

      if (counter < 4) {
        sb33.append(" ");
      }
    }
    System.out.println(sb33.toString());

    System.out.println(stringBuilderAppend());
    System.out.println(stringConcat());

  }

    public static long stringConcat() {
      long start = System.currentTimeMillis();
      String sbb = "";
      for (int i = 0; i <100000; i++) {
        sbb = sbb.concat("a");
      }
      long end = System.currentTimeMillis();
      return end-start;
    }


    public static long stringBuilderAppend() {
      long start = System.currentTimeMillis();
      StringBuilder sbb = new StringBuilder ("");
      for (int i = 0; i <100000; i++) {
        sbb.append("a");
      }
      long end = System.currentTimeMillis();
      return end-start;
    }




}

