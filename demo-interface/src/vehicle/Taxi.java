package vehicle;
public class Taxi implements Vehicle { // Class Signature

  // enhance readability, to better understand the object by interface

  private int speed;
  private int capacity;

  public static final int MAX_SPEED = 100;
  public static final int MAX_CAPACITY = 5;


  public Taxi() {

  }

  private Taxi(int speed) {
    this.speed = speed;
  }

  private Taxi(int speed, int capacity) {
    this.speed = speed;
    this.capacity = capacity;
  }

  public static Taxi small() { // Taxi.small()
    return new Taxi(0, 4);
  }

  public static Taxi big() { // Taxi.big()
    return new Taxi(0, 5);
  }

  public boolean isOn() {
    return this.speed > 0;
  }

  public boolean isStopped() {
    return this.speed <= 0;
  }

  public boolean isOverMaxSpeed() {
    return this.speed > Taxi.MAX_SPEED;
  }

  public boolean isOverCapacity() {
    return this.capacity > Taxi.MAX_CAPACITY;
  }

  public int getCapacity() {
    return capacity;
  }

  public static int getMaxSpeed() {
    return MAX_SPEED;
  }

  public int getSpeed() {
    return speed;
  }

  // public void setCapacity(int capacity) {
  // this.capacity = capacity;
  // }

  // public void setSpeed(int speed) {
  // this.speed = speed;
  // }


  @Override // need to override, Interface Vehicle do not mention the methods formation.
  public boolean start() {
    if (isOn())
      return false;
    this.speed = 10;

    return true;
  }

  @Override // Override is to let the compiler to validate the relationship of inheritance
  public boolean stop() {
    if (this.isStopped())
      return false;
    this.speed = 0;

    return true;
  }

  @Override
  public boolean accelerate() {
    if (this.isStopped()) // early return
      return false;

    this.speed += 10;
    if (this.isOverMaxSpeed())
      this.speed = Taxi.MAX_SPEED;

    return true;
  }

  @Override
  public boolean brake() {
    if (isStopped())
      return false;
    this.speed -= 10;

    return true;
  }



  public static void main(String[] args) {

    Taxi t1 = Taxi.small(); // create an object by private static constructor
    t1.start();
    t1.accelerate();
    t1.brake();
    t1.stop();

    System.out.println(Vehicle.x);


  }



}
