public class BusinessException extends Exception {

  private int code;

  public BusinessException(SysCode sysCode) {
    this(sysCode.getCode(), sysCode.getMessage());
  }


  private BusinessException(int code, String message) { // "Server is unavailable."
    super(message); // extends the Exception class
    this.code = code;
    // still on the parent object
  }
  

  public static void main(String[] args) {

    try {
      throw new BusinessException(SysCode.SERVER_TIMEOUT); // can use by enum
    } catch (BusinessException e) {

    }

  }
}


