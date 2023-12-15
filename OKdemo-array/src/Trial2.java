package src;

public class Trial2 {


  public static void main(String[] args) {


    System.out.println(counting("hfjbsdffddhfjivddid"));

  }



  public static String counting(String str) {

    int[] count = new int[26];
    char maxChar = ' ';

    for (int i = 0; i < str.length(); i++) {

      count[str.charAt(i) - 'a']++;

    }

    int maxCount = 0;

    for (int i = 0; i < count.length; i++) {

      if (count[i] != 0 && count[i] > maxCount) {
        maxCount = count[i];
        maxChar = (char) (i + 'a');
      }
    }

    return "Find " + String.valueOf(maxChar).concat(" Quantity: ")
        .concat(String.valueOf(maxCount));
  }

}
