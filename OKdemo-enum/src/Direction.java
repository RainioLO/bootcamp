public enum Direction {

  NORTH(1), EAST(2), WEST(-2), SOUTH(-1),; // should all be capital

  private int value;



  public int getValue() {
    return this.value;
  }

  // Private Constructor
  private Direction(int value) { // this constructor has been called 4 times in this Direction
    this.value = value;
  }


  // // static method
  public static Direction opposite(Direction direction) {

    return fromlocationValue(direction.getValue() * -1);

  }


  private static Direction fromlocationValue(int value) {

    for (Direction direction : Direction.values()) {
      if (direction.getValue() == value) { // no need to get value, is within the class
        return direction;
      }
    }
    return null;
  }



  // instance method
  public Direction opposite() {
    return Direction.fromlocationValue(this.value * -1);
  }

  public boolean isOpposite(Direction direction) {
    return this == Direction.fromlocationValue(direction.getValue() * -1);
  } // this can be == is the object address



  public static void main(String[] args) {

    String result = Direction.WEST.opposite().name(); // this from enum to String
    String result2 = Direction.WEST.opposite().toString();
    System.out.println(Direction.WEST.opposite()); // instance method
    System.out.println(Direction.opposite(Direction.WEST)); // static method
    // sysout will call toString()



  }



}
