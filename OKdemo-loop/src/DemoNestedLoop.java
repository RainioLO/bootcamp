public class DemoNestedLoop {
  public static void main(String[] args) {

    for (int i = 0; i < 5; i++) {// 0,1,2,3,4
      System.out.print("*"); // System.out.println : ln =new line
    }



    // when i=0, j -> 0,1,2,3
    // when i=1, j -> 0,1,2,3
    // when i=2, j -> 0,1,2,3
    // when i=3, j -> 0,1,2,3
    // when i=4, j -> 0,1,2,3

    for (int i = 0; i < 4; i++) {
      System.out.println("Hello !!!!!, i=" + i); // outerloop
      for (int j = 0; j < 3; j++) { // inner loop // i=0, j -> 0,1,2,3 當i 是0, j 行 0-3
        // System.out.println("World!!!!, j=" + j); // j 行3次就冇左, 直到loo重覆
        if (i > 1 && j > 1) {
          break;
        }
        System.out.println("World!!!!, j=" + j);
      }
    }



    // i < 5
    // j < 4
    // System.out.println (); print and newline
    // System.out.print (): print
    // Nested Loop

    // for (int i = 0; i < 5; i++) {
    // for (int j = 0; j < 4; j++) {
    // System.out.print("*");
    // }
    // System.out.println(" ");
    // }

    // ****
    // ***
    // **
    // *
    //


    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 4 - i; j++) { // column should be variable length

        System.out.print("*");
      }


      System.out.println(" ");
    }

    System.out.println("Example 3");
    String str = "abcdefghijk";
    // variable length
    // nested loop, 4 character in a row
    // abcd
    // efgh
    // ijk
    int count = 0;
    for (int i = 0; i < str.length(); i++) {
      System.out.print(str.charAt(i));
      if (++count % 4 == 0 || i == str.length() - 1)
        System.out.println(" ");
    }

    // for (int i = 0; i < str.length(); i++) {

    // for (int j = 0; j < 4; j++) {
    // System.out.print(str.charAt(i));
    // }
    // System.out.println("");
    // }

    // *** *** *** *** *** ***
    System.out.println("Example 4a:");
    int noOfGroup = 6;
    for (int i = 0; i < noOfGroup; i++) {

      for (int j = 0; j < 3; j++) {
        System.out.print("*");
      }
      if (!i == noOfGroup-1){

        System.out.print(" 0 ");
      }
    }

    // for (int i = 0; i < 6; i++) {
    //   System.out.print("*");
    // }


  }
}
