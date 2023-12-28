public class DemoCheckException {

  public static void main(String[] args) {
    // Checked exception - Compiler requires the exception to be handled during the compile time
    // 1. if you throw an unchecked exception, you have to handle it by two ways. // handle in method
    // 1a) Sign the unchecked exception in the method signature (throw)
    // isEmailValid("dhfdcnnkhnk@gmail.com"); The method caller still need to handle the unchecked exception even the methods throws already

    // 1b) try-catch to handle
    try {
      isEmailValid("dhfdcnnkhnk@gmail.com");
    } catch (BusinessException e) { // catch an object and get the message
      // You can do anything after you catched it, or do nothing
      // relogin
      System.out.println(e.getMessage());
    }
  }

  public static boolean isEmailValid(String emailaddr) // true false also have results
      throws BusinessException { // throw to the method caller to handle // must have handling !!!
    if (emailaddr == null || emailaddr.length() > 10) // or go through the left and stop
      // return false;
      // can throw throwable or below like new BusinessException
      throw new BusinessException( // Class Exception is to check exception
          SysCode.EMAIL_TOO_LONG);
    return true;
  }


  public static boolean isEmailValid2(String emailaddr) // true false also have results
      throws BusinessException { // throw to the method caller to handle
    if (emailaddr != null || emailaddr.length() == 8) // or go through the left and stop
      return true;
    // can throw throwable or below like new BusinessException
    if (emailaddr == null || emailaddr.length() < 8)
      return false;
    throw new BusinessException(SysCode.EMAIL_TOO_LONG); // this is exception that cannot be handled
    // can define all situation and throw at the bottom
  }



}
