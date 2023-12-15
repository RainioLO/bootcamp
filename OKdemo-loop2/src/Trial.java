import java.util.Arrays;

public class Trial {

  public static void main(String[] args) {


    // "abc,def,ghh,ijk"
    String str = "abc,def,ghh,ijk";
    String[] parts = str.split(",");

    String str2 = "abcdefghijk"; // --> get odd char to create new string
    System.out.println("Example ooo " + oddidx(str2));
    System.out.println("Example oo1 " + reverse(str2)); 
    char[] charstr2 = str2.toCharArray();


    int idx = 0;
    int charArrayLength =
        str2.length() % 2 == 0 ? str2.length() / 2 : str2.length() / 2 + 1;
    char[] newchar = new char[charArrayLength];

    for (int i = 0; i < charstr2.length; i++) {
      if (i % 2 == 0) {
        newchar[idx++] = charstr2[i]; // idx and i 分閞計
      }

    }
    System.out.println(Arrays.toString(newchar));


  }



  public static String oddidx(String str) { // str= "hybfuidsukjnhj" --> get odd string

    char[] charArray = str.toCharArray(); // () is the method of object

    int arrLength =
        str.length() % 2 == 0 ? str.length() / 2 : str.length() / 2 + 1;
    char[] newcharArray = new char[arrLength];
    int idx = 0;

    for (int i = 0; i < charArray.length; i++) {
      if (i % 2 == 0) {
        newcharArray[idx++] = charArray[i];
      }
    }
    return String.valueOf(newcharArray);
  }

  public static String reverse(String str) { //method for the Class

    char[] arr = str.toCharArray();

    for (int i = 0; i < arr.length / 2; i++) {
      char temp = arr[i];
      arr[i] = arr[arr.length - 1 - i];
      arr[arr.length - 1 - i] = temp;
    }
    return String.valueOf(arr);

  }



}
