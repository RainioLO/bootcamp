public class Leetcode2843 {

  public int countSymmetricIntegers(int low, int high) {
    int[] arr = new int[high - low + 1];
    int counter = 0;
    for (int i = 0; i < arr.length; i++) {
      arr[i] = low++;
    }

    String[] stringArray = new String[arr.length];
    for (int i = 0; i < arr.length; i++) {
      stringArray[i] = String.valueOf(arr[i]);
    }

    for(String str: stringArray){

      for(int i = 0; i < str.length();i++)

    }



  }
}
