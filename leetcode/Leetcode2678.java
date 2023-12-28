public class Leetcode2678 {

  public static int countSeniors(String[] details) {

    int counter = 0;
    for (String s : details){
      int age = Integer.parseInt(s.substring(11, 13));
      if (age > 60)
      counter ++;
    }
    return counter;
  }



  public static void main(String[] args) {


    String[] details =
        new String[] {"7868190130M7522", "5303914400F9211", "9273338290F4010"};

    System.out.println(countSeniors(details));

  }



}


