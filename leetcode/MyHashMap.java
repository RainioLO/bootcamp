import java.util.ArrayList;
import java.util.List;

public class MyHashMap {

  private List<List<Integer>> entries;

  public MyHashMap() {
    this.entries = new ArrayList<>();
  }

  public void put(int key, int value) {
    for (List<Integer> entry : this.entries) {
      if (entry.get(0) == key) // this.get is getting the key's key
        entry.set(1, value);
    }
    this.entries.add(new ArrayList<>(List.of(key, value)));
  }

  public int get(int key) {
    for (List<Integer> entry : this.entries) {
      if (entry.get(0) == key)
        return entry.get(1);
    }
    return -1;
  }

  public void remove(int key) {
    List<Integer> toBeRemoved = null;
    for (List<Integer> entry : this.entries) {
      if (entry.get(0) == key)
        toBeRemoved = entry;
      this.entries.remove(entry);
    }
  }



}
