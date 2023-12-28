import java.io.IOException;

public class DemoMulitpleMethod {
  // Difference of throwing checked or unchecked exception
  // 1. For checked exception, you have to handle it by try-catch at the end.
  // 2. For unchecked exception, you can either program fix to "avoid" or agree to "accept"
  // 3. For checked/ unchecked, there is still polymorhism between parent and child exception

  public static void main(String[] args) {

    // call methodA

    // Call method chain, with checked exception
    try {
      System.out.println("Start try");
      System.out.println(methodA(5, 5));
      System.out.println("End try"); // skip this
    } catch (Exception e) {
      if (e instanceof IOException) {
        System.out.println("e is IOException"); // e is IOException
      }
    } finally { // to get the message
      System.out.println("finally here");
    }
    System.out.println("***End main***");
  }


  public static int methodA(int x, int y) throws Exception { // cannot throws IOException(child class)
    // call methodB
    return methodB(x, y);
  }

  public static int methodB(int x, int y) throws Exception {
    // call methodC
    // return methodC(x,y); // unchecked exception example
    return methodD(x, y); // checked exception example
  }

  public static int methodD(int x, int y) throws Exception { // throw Exception pointor
    if (x + y > 10)
      return x + y;
    throw new IOException(); // checked exception // through the IOException object
  }



  public static int methodC(int x, int y) throws RuntimeException {
    // what is the difference of throwing checked or unchecked exception in methodC?
    if (x + y > 10)
      return x + y;
    throw new IllegalArgumentException(); // throw unchecked exception
  }


}
