import java.util.List;

public class Leetcode1436 {

  public String destCity(List<List<String>> paths) {

    if (paths.get(paths.size() - 1).get(1).equals(paths.get(0).get(0)))
      return paths.get(0).get(1);
    return paths.get(paths.size() - 1).get(1);


  }



}
