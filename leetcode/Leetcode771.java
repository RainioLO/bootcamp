public class Leetcode771 {

  public int numJewelsInStones(String jewels, String stones) {
    int counter = 0;

    for (int i = 0; i < stones.length(); i++) {
      if (jewels.contains(String.valueOf(stones.charAt(i))))
        counter++;
    }
    return counter;
  }



}
