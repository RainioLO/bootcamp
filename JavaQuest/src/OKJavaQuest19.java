
import java.util.HashMap;
import java.util.Map;

/**
 * Expected Output: Car Year=2020, Car Model=ModelY
 */
public class OKJavaQuest19 {
  // Declare instance variables carYear and carModel
  private int carYear;
  private String carModel;
  // Constructor with variables carYear and carModel

  public OKJavaQuest19(int carYear, String carModel) {
    this.carYear = carYear;
    this.carModel = carModel;
  }

  @Override
  public String toString() { // this method is inherited from topmost Object class that have the address of object only;
    return "car Year: " + String.valueOf(this.carYear) + " , carModel: "
        + this.carModel;

  }

  public static void main(String[] args) {
    OKJavaQuest19 myCar = new OKJavaQuest19(2020, "ModelY");
    // Create an instance of class Exercise12, with carYear 2020, and carModel
    // "ModelY"
    // print the expected output
    System.out.println(myCar);

  }
}
