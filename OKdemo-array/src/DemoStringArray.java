package src;

import java.util.Arrays;

public class DemoStringArray {
  public static void main(String[] args) {

    String[] strings = new String[] {"abc", "ijk", "xyz"};
    String[] strings2 = new String[3];
    strings2[0] = "abc";
    strings2[1] = "ijk";
    strings2[2] = "xyz";

    System.out.println(strings[2]);

    // for loop
    // strings[0] -> "abcijk"
    // strings[1] -> "ijkxyz"
    // strings[2] -> "xyz!"

    for (int i = 0; i < strings2.length; i++) { // 0,1,2
      // code here..
      if (i < strings2.length - 1) {
        strings2[i] = strings2[i].concat(strings2[i + 1]);
      } else {
        strings2[i] = strings2[i].concat("!");
      }

      // System.out.println("Example:" + strings2[i]);
    }
    System.out.println("Example: " + Arrays.toString(strings));


    for (int i = 0; i < strings2.length; i++) {
      // continue
      if (i < strings2.length - 1) {
        strings2[i] = strings2[i].concat(strings2[i + 1]);
        System.out.println(strings2[i]);
        continue;
      }
      strings2[i] = strings2[i].concat("!");
      // System.out.println(strings2 [i]);
    }

    System.out.println(Arrays.toString(strings2));


  }
}
