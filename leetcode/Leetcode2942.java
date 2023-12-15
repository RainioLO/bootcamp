import java.util.Arrays;
import demo-class.src.order.Item;

public class Leetcode2942 {

  public List<Integer> findWordsContaining(String[] words, char x) {

    List<Integer> l1 = new ArrayList<>();
    // int [] output = new int [0];
    int idx = 0;

    for (int i = 0; i < words.length; i++) {

      for (int j = 0; j < words[i].length(); j++) {

        if (words[i].charAt(j) == x) {
          l1.add(i);
          break;
          // public void addItem(Item item) {
          // Item[] newItems = Arrays.copyOf(this.items, this.items.length + 1);
          // newItems[newItems.length - 1] = item;
          // this.items = newItems;
        }
      }
    }
return l1;
  }



}
