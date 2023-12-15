public class Leetcode2678 {

  public static int countSeniors(String[] details) {

    int counter = 0;
    for (int i = 0; i < details.length; i++) {
      if (details[i].charAt(11) >= 6 && details[i].charAt(12) > 0)
        counter++;
    }
    return counter;
  }


  public static void main(String[] args) {
    

    String [] details = new String [] {"7868190130M7522","5303914400F9211","9273338290F4010"};

    System.out.println(countSeniors(details));

  }




}


