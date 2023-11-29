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


      
  }
}


