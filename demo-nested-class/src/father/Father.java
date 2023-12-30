package father;

public class Father implements Driver {

  @Override
  public void drive() {
    System.out.println("Father is driving");
  }

  public static void main(String[] args) {

    Driver driver = new Father();
    driver.drive();

    Driver driver2 = new Driver() { // custom in driver2
      @Override
      public void drive() {
        System.out.println("Annoymous Inner Class ... driving...");
      };
    };

    driver2.drive();


    
  }
}
