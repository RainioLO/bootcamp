import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode1089 {
  public static void duplicateZeros(int[] arr) {

    List<Integer> list = new ArrayList<>();
    for (int num : arr) {
      list.add(Integer.valueOf(num));
    }

    for (int i = 0; i < list.size(); i++) {
      if (list.get(i) == 0) {
        list.add(i, 0);
      }
    }

    for (int i = 0; i < arr.length; i++) {
      arr[i] = list.get(i);
    }
  }


  public static void main(String[] args) {
    
    int [] arr = new int[]{1,2,0,4,0,5,7,0};




  }










}


