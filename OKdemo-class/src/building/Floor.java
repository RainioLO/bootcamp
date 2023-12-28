package building;

public class Floor {

  // instance variable
  private int level;
  private char room;
  private double price;
  private Family[] familys = new Family[0];

  // Constructor
  public Floor() { // empty constructor

  }

  public Floor(int level, char room, double price, Family[] familys) {

    this.level = level;
    this.room = room;
    this.price = price;
    this.familys = familys;
  }

  // Getter & Setter

  public void setLevel(int level) {
    this.level = level;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public void setRoom(char room) {
    this.room = room;
  }

  public void setFamilys(Family[] familys) {
    this.familys = familys;
  }

  public int getLevel() {
    return level;
  }

  public double getPrice() {
    return price;
  }

  public char getRoom() {
    return room;
  }

  public Family[] getFamilys() {
    return familys;
  }



}
