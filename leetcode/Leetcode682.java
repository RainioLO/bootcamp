import java.util.ArrayList;
import java.util.List;

public class Leetcode682 {

  public static calPoints(String[] operations){

    List<Integer> list = new ArrayList<>();
    int sum = 0;

    for (int i = 0; i < operations.length; i++) {
      if (!operations[i].equals("C") || !operations[i].equals("D")
          || !operations[i].equals("+")) {
        list.add(Integer.valueOf(operations[i]));
      } else if (operations[i].equals("C")) {
        list.remove(i - 1);
      } else if (operations[i].equals("D")) {
        list.add((Integer.valueOf(operations[i - 1]) * 2));
      } else if (operations[i].equals("+")) {
        list.add(list.get(list.size()) + list.get(list.size() - 1));
      }
    }
    for (int num : list) {
      sum += num;
    }
    return sum;
  }



  public static void main(String[] args) {
    String[] ops = new String[] {"5", "2", "C", "D", "+"};
    System.out.println(calPoints(ops));
  }
}
