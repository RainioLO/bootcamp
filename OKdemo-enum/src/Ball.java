public class Ball {
  // private String color // not use String
  private Color color; // relatively finite numbers

  public Ball(Color color) {
    this.color = color;
  }

  public Color getColor() {
    return this.color;
  }


  public static void main(String[] args) {
    // Before the main method start --> class load --> new Color ("RED"), new Color ("Yellow") .....
    // Color.RED (something public static final) ,, public no need getter
    // Color.RED is an object
    // Cannot new the Color object by yourself

    Ball b1 = new Ball(Color.RED); // input Color object with enum,,
    Ball b2 = new Ball(Color.BLACK); // can new many times, is finite object
    Ball b3 = new Ball(Color.BLACK);
    Ball b4 = new Ball(Color.SILVER);

    if (b3.getColor() == b2.getColor()) // enum is the only thoughtout
      System.out.println("Same color");

    if (b1.getColor() != b2.getColor())
      System.out.println("Different");


  }

}
