package staticvariable;

import java.util.Arrays;
import javax.xml.crypto.Data;
import order.Order;

public class Database {

  private static String[] strings = new String[0]; // nothing in the beginning. (Stiring[] Class Data)

  // final vs static final
  // 1. "final" is still instance variable, the object can call it ny "this."
  // 2. "static final" is constant

  // No static and No final (Instance variable)
  // static
  // final (Instance variable)
  // static final

  private final int hoursPerDay = 24; // Constant instance variable , //final
  // final vs static final //

  private static final int MINUTES_PER_HOUR = 60; // constant (Class Data)

  // final cannot be corrected, with static/instance



  public static void add(String str) {
    // String[] newStrings = Arrays.copyOf(strings, strings.length + 1);
    // newStrings[newStrings.length - 1] = str;
    // strings = newStrings; // ADDRESS REPLACEMENT

    String[] newArr = new String[strings.length + 1];
    for (int i = 0; i < strings.length; i++) {
      newArr[i] = strings[i];
    }
    newArr[newArr.length - 1] = str;
    strings = newArr;

  }

  public static String get(int index) {
    if (!isIndexValid(index)) {
      return null;
    }
    return strings[index]; // strings is a string array. strings[i] gives string
  }

  public String read(int index) { // method on instance object to view the information on static.
    return strings[index];
  }



  public static boolean isIndexValid(int index) {
    return index >= 0 && index < strings.length;
  }



  public static boolean remove(int index) {

    if (index > strings.length - 1 || index < 0) { // isIndexValid()
      return false;
    }
    String[] newArr = new String[strings.length - 1];
    int idx = 0;
    for (int i = 0; i < strings.length; i++) {
      if (i == index) {
        continue;
      }
      newArr[idx++] = strings[i];
    }
    strings = newArr; // need to renew the strings (String Array object)
    return true;
  }


  public static void main(String[] args) {

    // do not need to create Database object to operate static variables.

    add("Lib1");
    add("Lib2");
    add("Lib3");
    System.out.println("Example 1:" + Database.get(0));
    System.out.println("Example 2:" + Database.get(1));
    System.out.println("Example 3:" + Database.get(2));

    Database d1 = new Database(); // new a Database object
    Database d2 = new Database();

    System.out.println(d1.read(0)); // (instance method to read the static method information)
    System.out.println(d2.read(0)); // same lib1 because is static method
    Database.add("Lib4"); // Lib1-4
    System.out.println("Example 4:" + Database.get(3));
    Database.remove(0); // Lib2-4
    System.out.println("Example 5:" + Database.get(0)); //
    System.out.println("Example 6 ".concat(Database.get(2))); // Lib4


    System.out.println(Database.MINUTES_PER_HOUR);

  }



}
