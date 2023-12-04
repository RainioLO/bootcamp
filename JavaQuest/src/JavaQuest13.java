
public class JavaQuest13 {
  // You are given a non-negative floating point number rounded to two decimal places celsius, that denotes the temperature in Celsius.
  // You should convert Celsius into Kelvin and Fahrenheit by methods

  // Note that:
  // Kelvin (蘭氏) = Celsius (攝氏) + 273.15
  // Fahrenheit (華氏) = Celsius (攝氏) * 1.80 + 32.00

  // Do not change anything in main method
  public static void main(String[] args) {
    double celsius = 23.56d;
    double[] arr =
        new double[] {convertKelvin(celsius), convertFahrenheit(celsius)};

    for (int i = 0; i < arr.length; i++) {
      if (i == 0) {
        System.out.println("Temperature in Kelvin: " + arr[i]);
      } else if (i == 1) {
        System.out.println("Temperature in Fahrenheit: " + arr[i]);
      }
    }
  }

  // Kelvin (蘭氏) = Celsius (攝氏) + 273.15
  // Code a method here to return temperature in Fahrenheit, by inputting temperature in Celsius

  // Fahrenheit (華氏) = Celsius (攝氏) * 1.80 + 32.00
  // Code a method here to return temperature in Fahrenheit, by inputting temperature in Celsius


}
