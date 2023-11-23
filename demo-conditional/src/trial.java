public class trial {
  public static void main(String[] args) {

    // score and score2 >=50, (score+score2)/2 -> grade
    // either score or score2 <50 -> grade F
    // both score and score2 <50 -> grade F

    int score = 60;
    char Grade = 'A';
    if (score >= 90) {
      Grade = 'A';
    } else if (score >= 80) {
      Grade = 'B';
    } else if (score >= 70) {
      Grade = 'C';
    } else if (score >= 60) {
      Grade = 'D';
    } else if (score >= 50) {
      Grade = 'E';
    } else {
      Grade = 'F';
    }
System.out.println("Trial Grade=" + Grade);

    // score and score2 >=50, (score+score2)/2 -> grade
    // either score or score2 <50 -> grade F
    // both score and score2 <50 -> grade F

    int score2 = 50;
    if (score <50 || score2<50) {
      Grade = 'F';
    } else {
    double averagescore= (score+score2)/2;
    if (averagescore >= 90) {
      Grade = 'A';
    } else if (averagescore >= 80) {
      Grade = 'B';
    } else if (averagescore >= 70) {
      Grade = 'C';
    } else if (averagescore >= 60) {
      Grade = 'D';
    } else if (averagescore >= 50) {
      Grade = 'E';
    } else {
      Grade = 'F';
    }
    }
    System.out.println("Final Grade=" + Grade);


char item= '2'; //1:N, 2:10%, 3:50%
double discount= 0.0d;
switch (item) {
  case '3':
  discount=0.5d;
  case '2':
  discount=0.1d;
  case '1':
  discount=0.0d;
}
System.out.println(discount);

// Switch int, String


  }
}
