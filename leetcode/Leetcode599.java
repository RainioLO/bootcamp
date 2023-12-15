public class Leetcode599 {

  public String[] findRestaurant(String[] list1, String[] list2) {


    String[] newArr = new String[2];

    for (int i = 0; i < list1.length; i++) {
      for (int j = 0; j < list2.length; j++) {

        if (list1[i] == list2[j]) {
          newArr[0] = list1[i];
          break;
        }

        for (int k = i + 1; k < list1.length; k++) {
          for (int l = j + 1; l < list2.length; l++) {

            if (list1[k] == list2[l]) {
              newArr[1] = list1[k];
              break;
            }
          }
        }


      }

    }
    return newArr;
  }
}
