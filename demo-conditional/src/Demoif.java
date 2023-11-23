public class Demoif {
    public static void main(String[] args) {
        // double salary = 15000.0; // by default 15000.0 is double
        double salary = 15000.0d;

        if (salary > 14000) {
            System.out.println("salary > 14000");
        }

        if (salary >= 15000) { // double vs int
            System.out.println("salary > 15000");
        }

        if (salary < 17000) {
            System.out.println("salary < 17000");
        }

        if (salary <= 17000) {
            System.out.println("salary < 17000");
        }

        char grade = 'A';
        if (grade == 'A') {
            System.out.println("Example: Grade=A");
        } else if (grade == 'B') {
            System.out.println("Grade=B");
        } else if (grade == 'C') {
            System.out.println("Grade=C");
        } else if (grade == 'D') {
            System.out.println("Grade=D");
        } else if (grade == 'E') {
            System.out.println("Grade=E");
        } else { // grade == 'F' (else is final)
            System.out.println("Fail");
        }

        boolean isRaining = true;
        isRaining = false;
        if (isRaining) {
            System.out.println("Bring an umbrella");
        } else {
            System.out.println("Sunny Day !");
        }



        int score = 75;
        // if
        // >=90 -> A, >=80 and <90 -> B, 70 -79 -> C, 60-69 -> D
        // 50-59 -> E, <50 -> F

        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else if (score >= 50) {
            grade = 'E';
        } else {
            grade = 'F';
        }
            System.out.println("Example 1a: Grade=" + grade);


        if (score >=90 && score <=100){
            grade = 'A';
        } else if (score <90 && score >=80) {
            grade = 'B';
        } else if (score <80 && score >=70) {
            grade = 'C';
        } else if (score <70 && score >=60) {
            grade = 'D';
        } else if (score <60 && score >=50) {
            grade = 'E';
        } else {
            grade = 'F';
        }
            System.out.println("Example 1b: Grade=" + grade);
        //System.out.println("Grade=" + grade);


        // score and score2 >=50, (score+score2)/2 -> grade
        // either score or score2 <50 -> grade F
        // both score and score2 <50 -> grade F


        int score2=40;

        if (score <50 || score2 <50) {
            grade = 'F';
        } else {  //else can be a whole set afterward
            double scoreaverage = (score+score2)/2;
          if (scoreaverage >=90){
            grade = 'A';
        } else if (scoreaverage >=80) {
            grade = 'B';
        } else if (scoreaverage >=70) {
            grade = 'C';
        } else if (scoreaverage >=60) {
            grade = 'D';
        } else if (scoreaverage >=50) {
            grade = 'E';
        } 
    }
    System.out.println("Grade=" +grade);









    
        } 





        //int score2=40;
        //int scoreAll;

        //if (score>50 && score2>50) {
            //grade = 'F';
        //}
        //System.out.println("Final Grade:" + grade);






    }
