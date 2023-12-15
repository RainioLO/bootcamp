import java.util.Arrays;

public class DemoForEachLoop {
  public static void main(String[] args) {

    Integer[] integers = new Integer[] {100, -30, 20};

    for (Integer i : integers) { // XXXXXX/XXXXX 拎什麼/邊個袋
      System.out.println("i=" + i); // 直接就是elements
    }

    for (int i = 0; i < integers.length; i++) {
      System.out.println("Example : i=" + integers[i]); // 要用i 在integers [] 拎elements ( i is the counter)
    }

    String str = "abc,def,ijk,zxy";
    String[] parts = str.split(",");
    System.out.println("parts=" + Arrays.toString(parts));

    for (String s : parts)

      System.out.println("parts=" + s);


    String str2 = "abcfedghijk";
    char[] charStr2 = str2.toCharArray();
    System.out.println(Arrays.toString(charStr2));


    int arrLength =
        str2.length() % 2 == 0 ? str2.length() / 2 : str2.length() / 2 + 1;
    char[] result = new char[arrLength];
    int idx = 0;
    for (int i = 0; i < charStr2.length; i++) {
      if (i % 2 == 0) {
        result[idx++] = charStr2[i];

      }
    }
    System.out.println("Final String= " + String.valueOf(result));

    // char array
    // finalString -> acegik

    // Example 1
    String ss = "fjwjnfimnvjdnvmjd";
    System.out.println(evenIdx(ss));
    System.out.println(evenIdx(""));
    System.out.println(evenIdx("abc"));
    System.out.println(evenIdx("abcd"));

    // Example 2:
    String given = "abcdfg";
    // finalString "gfedcba"
    // char array
    System.out.println("Reversed String= " + reverse("abcdef")); // "fedcba"
    System.out.println("Reversed String= " + reverse("")); // "fedcba"
    System.out.println("Reversed String= " + reverse("abcde")); // "edcba"

    
  }



  public static String evenIdx(String str2) {

    char[] charStr2 = str2.toCharArray();
    // System.out.println(Arrays.toString(charStr2));

    int arrLength =
        str2.length() % 2 == 0 ? str2.length() / 2 : str2.length() / 2 + 1;
    char[] result = new char[arrLength];
    int idx = 0;
    for (int i = 0; i < charStr2.length; i++) {
      if (i % 2 == 0)
        result[idx++] = charStr2[i];
    }
    return String.valueOf(result);

  }

  public static String reverse(String s) {
    char[] charStr = s.toCharArray();

    for (int i = 0; i < s.length() / 2 ; i++) {

      if (s.length() == 0) {
        break;
      }
      char temp = charStr[i];
      charStr[i] = charStr[s.length() - 1 - i];
      charStr[s.length() - 1 - i] = temp;
    }


    return String.valueOf(charStr);
  }


}


