import java.math.BigDecimal;

public class Leetcode3000 {
  public int areaOfMaxDiagonal(int[][] dimensions) {

    double max = -1;
    int area = 0;
    for (int i = 0; i < dimensions.length; i++) {
      BigDecimal diagonal = (BigDecimal.valueOf(Math.sqrt(
          (Math.pow(dimensions[i][0], 2) + Math.pow(dimensions[i][1], 2)))));
      if (diagonal.doubleValue() > max) {
        max = diagonal.doubleValue();
        area = (dimensions[i][0] * dimensions[i][1]);
      }
    }
    return area;
  }
}
