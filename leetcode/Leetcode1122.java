import java.util.HashMap;
import java.util.Map;

public class Leetcode1122 {
  public int[] relativeSortArray(int[] arr1, int[] arr2) {

    //create a HashMap to store the arr2 // key, value
    Map<Integer, Integer> map = new HashMap<>();

    for(int i = 0; i < arr2.length; i++){
      map.put(arr2[i], i);
    }

    //

  }
}
