public class trialdemooperator {
  public static void main(String[] args) {

    // ***Trial 1a***
    // a1 = 10
    // a2 =5
    // always find min

    int a1 = 0;
    int a2 = 1;


    int min = 0;
    if (a2 < a1) {
      min = a2;
    } else {
      min = a1;
    }
    System.out.println("Trinal 1a:  " + "min = " + min);
    // ***Trial 1b***
    min = a2 < a1 ? a2 : a1;
    System.out.println("Trinal 1b:  " + "min = " + min);

// *** Trial 2 ***
int number = 2;
boolean isOdd = true;
boolean isEven = false;

if (number%2 == 1) {
  System.out.println("Trial 2: " + number+ " " + "is odd number is " +  isOdd);
} else {
  System.out.println("Trial 2: " + number + " " + "is odd numbers " + isEven);
}

// *** Trial 3 
double totalAmount = 0;
double itemTotal= 999;
// if itemTotal > 3000, no transportation fee, otherwise +3% transportation fee

if (itemTotal > 3000) {
  totalAmount = itemTotal;
} else {
  totalAmount = itemTotal * 1.03;
}
System.out.println("Trial 3: Total amount = $" +" " + totalAmount);








  }
}
