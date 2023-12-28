package vehicle;
public class Bus implements Vehicle {

  private int speed;

  @Override
  public boolean test() {
    return false;
  }

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

  public boolean isOn() {
    return this.speed > 0;
  }

  public boolean isStopped() {
    return this.speed <= 0;
  }

  public boolean isOverMaxSpeed() {
    return this.speed > Taxi.MAX_SPEED;
  }



}
