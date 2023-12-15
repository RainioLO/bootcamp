public class Leetcode2956 {

  // public int[] findIntersectionValues(int[] nums1, int[] nums2) {
  //   int counter1 = 0;
  //   int counter2 = 0;
  //   int[] arr = new int[2];


  //   for (int i = 0; i < nums1.length; i++) {
  //     for (int j = 0; j < nums2.length; j++) {
  //       if (nums1[i] == nums2[j]) {
  //         counter1++;
  //         break;
  //       }
  //     }
  //   }

  //   for (int i = 0; i < nums2.length; i++) {
  //     for (int j = 0; j < nums1.length; j++) {
  //       if (nums2[i] == nums1[j]) {
  //         counter2++;
  //         break;
  //       }
  //     }
  //   }

  //   arr[0] = counter1;
  //   arr[1] = counter2;

  //   return arr;
  // }


public int[] findIntersectionValues(int[] nums1, int[] nums2) {

  boolean[] counts1 = new boolean [100];
  boolean[] counts2 = new boolean [100];

  int [] results = new int [2];
  for (int i =0; i < nums1.length; i++) {
    counts1[nums1[i]] = true;
  }
  for (int i = 0; i< nums2.length; i++) {
    count2[nums2]
  }


}














}
