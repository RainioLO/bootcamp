public enum Status {

  // How enum being initialized
  // Step 1: normal class
  // Step 2: Someone "new" this class object and place it into memory

  ORDERED('O'), // O associate with ORDERED
  SHIPPED('S'), COMPLETED('C'),;

  private char val;

  private Status(char val) { // Status('O') -> Status.ORDERED('O')
    this.val = val; // is private because cannot be "new"
  }

  public char getVal() {
    return this.val;
  }

}
