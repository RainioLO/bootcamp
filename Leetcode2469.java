import java.math.BigDecimal;
import java.util.Arrays;

public class Leetcode2469 {



  public static void main(String[] args) {

    System.out.println(Arrays.toString(convertTemperature(32)));

    // from array to array string by using Arrays.toString();

  }


  public static double[] convertTemperature(double celsius) {

    double[] conversion = new double[2];

    conversion[0] = BigDecimal.valueOf(celsius).add(BigDecimal.valueOf(273.15))
        .doubleValue();

    conversion[1] =
        BigDecimal.valueOf(celsius).multiply(BigDecimal.valueOf(1.8))
            .add(BigDecimal.valueOf(32)).doubleValue();

    return conversion;

  }


}
