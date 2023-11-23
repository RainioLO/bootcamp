public class trial {
  public static void main (String[] arga) {

        // continue
        // sum up all odd number (100)

int sum = 0;
for (int i = 0; i <101; i++) {
  if (i%2==0) {
    continue;
  }
  sum +=i;
}
System.out.println("sum=" +sum);


  }
}
