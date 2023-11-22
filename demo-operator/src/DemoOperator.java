public class DemoOperator {
    public static void main (String[] args) {
    int x=2;
    x++;
    ++x;
    x +=1;
    x = x +1; //6

    // difference between x++ and ++x
    int a = 5;
    int preIncrement = ++a; // a is increment by 1 first, and then being assigned to the variable
    // a -> 6 first, then preIncrement -> 6 
    System.out.println("preIncrement=" + preIncrement);
    System.out.println("a="+ a);

    int b = 5;
    int postIncrement = b++; //assign the value of variavble a to postIncrement 
    // postIncrement -> 5, b->6
    System.out.println("postIncrement=" + postIncrement); //5
    System.out.println("b=" + b); //6

    int d = 5;
    int postDecrement= d--;
    System.out.println("postDecrement=" + postDecrement);
    System.out.println("d=" + d);


    int c1=8;
    int csuper= c1++ + ++c1 +c1;
    System.out.println("csuper=" + csuper);
    System.out.println("c1=" + c1);


    int c =1;
    c++;

    // Conditional Operators
    // && || !
    if (c==2 && b==4) {
    System.out.println("Example 1 = yes");
    } else {
      System.out.println("Example 1 = No");
    }

        //Example 2 -Or
        if (c==2 || b==4) { // && ->Either conditions be fufilled
            // (c==2) -> true
            // (b==4) -> false
            // (true|| false) -> true
    System.out.println("Example 2 = yes");
    } else {
      System.out.println("Example 2 = No");
    }
  
    // Example 3- AND OR
        String h = "hello";
    if (c == 2 && b == 4 || "hello".equals(h)) {
      System.out.println("Example 3 = yes");
    } else {
      System.out.println("Example 3= No");
    }
        // (c==2) -> true
        // (b==4) -> false
        // "hello".equals(h) -> true
        // (true && (false || true)) -> true

        // Example 4- AND
        if (c==1 && b==6) {
          // (c==1) -> false
          // (b==6) will not be executed
          System.out.println("Example 4 = yes");
        } else {
      System.out.println("Example 4 = NoooNo");
    }
  
    int boy=10;
    ++boy; //11

    if (boy==11 && c==2) {
      System.out.println("yes");
    } else {
      System.out.println("No");
    }

    String y= "yo!";
    if (boy==11 && "yo!".equals(y) || c==1 ) {
      System.out.println("yessss");
    } else {
      System.out.println("No");
    }


    if (boy==11 && "yo".equals(y) || c==1 ) {
      System.out.println("yessss");
    } else {
      System.out.println("Noooo");
    }

        if (c == 2 ||( b == 4 && "hello".equals(h))) {
      System.out.println("yesss");
    } else {
      System.out.println("Nooo");
    }


    int Eng=35;
    int Chin=40;

    if (Eng>30 && Chin>30) {
      System.out.println("Pass");
    } else {
      System.out.println("Fail");
    }

    //Example 5 -AND OR
    if (c==1 || b == 4 && "hello".equals(h)){ // && higher priority
      // b==4 -> false
      // "hello".equals(h) -> true
      // c == 1 -> false
      // false || false && true
      // false || false
      // false

      System.out.println("Example 5 = yessss");
    } else {
      System.out.println("Example 5 = No");
    }

    // Example 6 -AND OR
    if (h.charAt(3) == 'e' || b==6) {
      // h.charAt(3) -> 'l'
      // b==6 -> true
      // false || true
      // true
      System.out.println("Example 6 = yessss");
    }

    // Comparsion operators not only exist in if statements.
    // boolean -> && ||
    boolean b1 = true && false; //meaningless
    System.out.println("b1=" + b1);

    boolean b2 = false;
    boolean b3 = true;

    boolean result = b2 || b3;
    System.out.println("Result=" +result); //true

    boolean result2 = b2 || b3 && b1;
    System.out.println("result2=" +result2); //false

    boolean result3= b2 && b3 || b2 && (b2||b3);
    System.out.println("result3=" +result3);

    //Example 7
    if (b1 == false) { //== is a question
      System.out.println("Example 7a = b1 is false"); //print
    }

    if (!b1) { // b1==false
      System.out.println("Example 7b = b1 is true"); //print
    }

    if (b1 == true) {  // b1 == true
      System.out.println("Example 8a = b1 is true"); //not print
    }

    if (b1) {  // b1 == true
      System.out.println("Example 8b = b1 is true"); //not print
    }

    int g = 0;
    if (b1 == false) {
      g=10; //
    }

    int k = b1 == false ? 10:0; 
    System.out.println("k=" +k);
    // if b1 is false, assign 10 to k, otherwise 0


    boolean x1= true;
    boolean z1= false;
    
    int toy=0;
    if (x1==true && z1==false) {toy=10;
    }
    System.out.println("toys=" +toy);

    int toy2 = z1 == false ? 10:0;
    System.out.println("toy2=" +toy2);

    int toy3 = z1 == true ? 10:0;
    System.out.println("toy3=" +toy3);

    boolean q1 = true;
    boolean q2 = true;

    String str1= "Comment: Yeah";
    String str2= "Comment: Oh" + " "+ "No!!";

    int result4= q1==true ? 50:0;

    if (q1==true && q2==true) {
      System.out.println(str1);
    }



    //int result4= q1==true ? 50:0;

    //Example
    int a1 = 10;
    int a2 = 4;

    int min = a2<a1 ? a2:a1;
    System.out.println("min=" +min);

    if (a2<a1){
    System.out.println("min=" +a2);
    } else {System.out.println("min=" +a1);
    }

    if (a2<a1) {
      min= a2;
    } else {
      min=a1;
    } System.out.println("min=" +min);



    int number = 13;
    //%
    boolean isodd;

    if (number % 2 ==0) {
      isodd = false;
    }else {
      isodd = true;
    }
    System.out.println("Odd Number:" + isodd); // Odd Number: true


    double totalAmount = 0;
    double itemTotal=2700;
    // if itemTotal > 3000, no transportation fee, otherwise +3% transportation fee

    if (itemTotal>3000) {
      System.out.println("totalAmount:" + itemTotal);
    } else {System.out.println("totalAmount:" + 1.03*itemTotal);
    }

    if (itemTotal>3000) {
      totalAmount=itemTotal;
    } else {totalAmount=1.03*itemTotal;
    System.out.println("totalAmount: $" +totalAmount);
    }

    double totalAmount1=0;
    int itemtotal1 = 2211;
    double feeRate= 0.03; //separate for convenience

    //if(itemtotal1>3000) {
      //totalAmount1 = itemtotal1;
    //} else {totalAmount1 = (1+feeRate)*itemtotal1;
    //}
    //System.out.println("totalAmount: $" +totalAmount1);

    double transportationFee = 0.0d; //0.0d
    if (itemtotal1 <= 3000) {
      transportationFee = itemtotal1*feeRate;
    }
    totalAmount1 = itemtotal1 + transportationFee;
    System.out.println("totalAmount: $" +totalAmount1); //2277.33

// Q1, Q2 @50 if 100 -> Excellent, 50 -> Average, 0-> Poor


    }
    }



  





    


