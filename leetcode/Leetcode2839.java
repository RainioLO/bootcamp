public class Leetcode2839 {

  public boolean canBeEqual(String s1, String s2) {


    char temp;
    StringBuilder sb1 = new StringBuilder(s1);
    StringBuilder sb2 = new StringBuilder(s2);

    for (int i = 0; i < 2; i++) {
        temp = sb1.charAt(i);
        sb1.setCharAt(i, sb2.charAt(i + 2));
        sb2.setCharAt(i + 2, temp);
    }

    return sb1.toString().equals(sb2.toString());
}
}

