import java.util.ArrayList;
import java.util.List;

public class Leetcode1431 {
  public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

    List<Boolean> list = new ArrayList<>();
    Boolean isLargest = true;
    int counter = 0;

    for (int i = 0; i < candies.length; i++) {
      for (int j = 0; j < candies.length; j++) {
        if (i == j)
          continue;
        if (candies[i] + extraCandies >= candies[j]) {
          counter++;
        }
      }
      if (counter == candies.length - 1) {
        list.add(isLargest);
        counter = 0;
      } else {
        list.add(!isLargest);
        counter = 0;
      }
    }
    return list;
  }
}




// // public List<Boolean> kidsWithCandies(int[] candies, int extraCandies){
//   int maxCandies = 0;
//   for (int candy: candies){
//     maxCandies = MAth.max(candy, maxCandies);
//   }

//   List<Boolean> result = new ArrayList<>();
//   for (int candy : candies){
//     result.add(candy + extraCandies >= maxCandies);
//   }
//   return result;
// }
