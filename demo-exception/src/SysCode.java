public enum SysCode {

  // final String , ...elements...
  // 1- 1000 (reserved for error)
  // 1001 - (reserved for warning)

  SERVER_TIMEOUT(1, "Server Connection Time Out"),

  DB_TIMEOUT(1,"Database Connection Time out."),

  EMAIL_TOO_LONG(1,"Email is too long."),;

  private int code;
  private String message;

  private SysCode(int code, String message) {
    this.message = message;
  }

  public String getMessage() {
    return this.message;
  }

  public int getCode() {
    return this.code;
  }

  // No Setter for enum

}
