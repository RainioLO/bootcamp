package building;

public class Block {


  // Static variable
  private static int counter = 0;

  // Instance Variable
  private int noOfBlock;
  private String name;
  private double size;
  private Floor[] floors = new Floor[0];


  // Constructor

  public Block() {
    this.noOfBlock = ++counter;
  }

  public Block(String name, double size, Floor[] floors) {
    this.noOfBlock = ++counter;
    this.name = name;
    this.size = size;
    this.floors = floors;
  }


  // Getter & Setter

  public static void setCounter(int counter) {
    Block.counter = counter;
  }

  public void setFloors(Floor[] floors) {
    this.floors = floors;
  }

  public void setSize(double size) {
    this.size = size;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setNoOfBlock(int noOfBlock) {
    this.noOfBlock = noOfBlock;
  }

  public static int getCounter() {
    return counter;
  }

  public Floor[] getFloors() {
    return this.floors;
  }

  public double getSize() {
    return this.size;
  }

  public String getName() {
    return this.name;
  }

  public int getNoOfBlock() {
    return this.noOfBlock;
  }



  public static void main(String[] args) {

  }

}
