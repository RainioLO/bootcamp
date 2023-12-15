package src;

import java.util.Random;
import java.util.Scanner;

public class DemoRandom {
  public static void main(String[] args) {

    // int target = new Random().nextInt(3);
    // System.out.println("randon number=" + target);

    int target = new Random().nextInt(3) + 1;
    System.out.println("randon number= " + target);


    // Game
    // 1-100 (random target: 47)
    // Round 1: "Please input a number (1-100):" User input 49 (wrong)
    // Round 2: "Please input a number (1-48):" User input 35 (wrong)
    // Round 3: "Please input a number (36-47)" User input 47 (correct)
    // if the input number is out of the range being asked, keep asking

    Scanner scanner = new Scanner(System.in);
    int input;
    int max = 100;
    int min = 1;
    target = 44;
    // while loop
    // if user input same as target -> Exit
    // otherwise keep asking
    do {
      System.out.println("please input a number (" + min + "-" + max + "):");
      input = scanner.nextInt();
      if (input < min || input > max) {
        System.out.println("Out of range. Please input again.");
        continue;
      }

      if (input > target) {
        max = input - 1;
      } else if (input < target) {
        min = input + 1;
        System.out.println("please input a number (" + min + "-" + max + "):");
      }

    } while (input != target);
    scanner.close();

    System.out.println("bump!!!!");



    // int secretNum = 46;
    // int numberofDraw=1;
    // while (target != secretNum ) {
    // target = new Random ().nextInt(100) + 1;
    // (numberofDraw)++;
    // if (target == secretNum) {
    // break;
    // }
    // }
    // System.out.println("numberofDraw: " + numberofDraw + " secretNumber= " + secretNum);



  }

}
