public class Demotrial {
  public static void main(String[] args) {

    // if
    // >=90 -> A, >=80 and <90 -> B, 70 -79 -> C, 60-69 -> D
    // 50-59 -> E, <50 -> F

    // score and score2 >=50, (score+score2)/2 -> grade
    // either score or score2 <50 -> grade F
    // both score and score2 <50 -> grade F

    char grade = 'A';
    int score1 = 50;
    int score2 = 90;


    if (score1 < 50 || score2 < 50) {
      grade = 'F';
    } else {
      int averageScore = (score1 + score2) / 2;
      if (averageScore >= 90) {
        grade = 'A';
      } else if (averageScore >= 80) {
        grade = 'B';
      } else if (averageScore >= 70) {
        grade = 'C';
      } else if (averageScore >= 60) {
        grade = 'D';
      } else if (averageScore >= 50) {
        grade = 'E';
      }
    }
    System.out.println("Example 1: Final Grade: " + grade);



    // Expected Output:

    // Input a month number: 2 Input a year: 2016 February 2016 has 29 days

    // Input a month number: 12 Input a year: 2014 December 2014 has 31 days

    int numOfmonth = 2;
    System.out.print("Example: Input a month number: " + numOfmonth);
    int year = 2200;
    System.out.println(" Input a year: " + year);

    String month = "January";
    int day = 0;
    switch (numOfmonth) {
      case 1:
        month = "January";
        day = 31;
        break;

      case 2:
        month = " February";
        if (year % 4 == 0 && (year % 100 == 0 && year % 400 == 0)) {
          day = 29;
        } else {
          day = 28;
        }
        break;

      case 3:
        month = "March";
        day = 31;
        break;

      case 4:
        month = "April";
        day = 30;
        break;

      case 5:
        month = "May";
        day = 31;
        break;

      case 6:
        month = "June";
        day = 30;
        break;

      case 7:
        month = "July";
        day = 31;
        break;

      case 8:
        month = "August";
        day = 31;
        break;

      case 9:
        month = "September";
        day = 30;
        break;


      case 10:
        month = "October";
        day = 31;
        break;

      case 11:
        month = "November";
        day = 30;
        break;

      case 12:
        month = "December";
        day = 31;
        break;
    }

    System.out.println(month + " " + year + " has " + day + " days.");


  System.out.print("Example 2: Input a month number: " + numOfmonth);
    System.out.println(" Input a year: " + year);

    if (numOfmonth == 1) {
      month = "January";
      day = 31;
    } else if (numOfmonth == 2) {
      month = " February";
      if (year % 4 == 0 && (year % 100 == 0 && year % 400 == 0)) {
        day = 29;
      } else {
        day = 28;
      }
    } else if (numOfmonth == 3) {
      month = "March";
      day = 31;
    } else if (numOfmonth == 4) {
      month = "April";
      day = 30;
    } else if (numOfmonth == 5) {
      month = "May";
      day = 31;
    } else if (numOfmonth == 6) {
      month = "June";
      day = 30;
    } else if (numOfmonth == 7) {
      month = "July";
      day = 31;
    } else if (numOfmonth == 8) {
      month = "August";
      day = 31;
    } else if (numOfmonth == 9) {
      month = "September";
      day = 30;
    } else if (numOfmonth == 10) {
      month = "October";
      day = 31;
    } else if (numOfmonth == 11) {
      month = "November";
      day = 30;
    } else if (numOfmonth == 12) {
      month = "December";
      day = 31;
    }

    System.out.println(month + " " + year + " has " + day + " days.");


  }
}
