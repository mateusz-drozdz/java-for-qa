package com.miquido.javaforqa.week01;

import java.util.Random;

public class ControlFlow {
  private static final Random rand = new Random();

  public static void main(String[] args) {

    // if-else
    int testscore = rand.nextInt(100);
    char grade;
    if (testscore >= 90) {
      grade = 'A';
    } else if (testscore >= 80) {
      grade = 'B';
    } else if (testscore >= 70) {
      grade = 'C';
    } else if (testscore >= 60) {
      grade = 'D';
    } else {
      grade = 'F';
    }
    System.out.println("Grade = " + grade);

    // switch statement
    String message;
    switch (grade) {
      case 'A':
        message = "You're so smart!";
        break;
      case 'B':
        message = "Very good!";
        break;
      case 'C':
        message = "Not so bad!";
        break;
      default:
        message = "You're dumbass";
        break;
    }
    System.out.println(message);

    // while
    System.out.println("while loop:");
    int count = 1;
    while (count < 11) {
      System.out.println("Count is: " + count);
      count++;
    }

    // infinite loop - try this
    // while (true) {
    //   System.out.println("lalala");
    // }

    // do-while - guarantee at least one execution of do-block
    System.out.println("do-while loop:");
    count = 1;
    do {
      System.out.println("Count is: " + count);
      count++;
    } while (count < 11);

    // for
    System.out.println("for loop:");
    for (int i = 1; i < 11; i++) {
      System.out.println("Count is: " + i);
    }

    // infinite for loop
    // for ( ; ; ) {
    //   System.out.println("lalala");
    // }

    // enhanced for (for-each)
    System.out.println("Enhanced for:");
    int[] numbers = {1,2,3,4,5,6,7,8,9,10};
    for (int number : numbers) {
      System.out.println("Number: " + number);
    }

  //  branching statements
    int[] randomNumbers = {-5, 12, 33, -64, 752, 9, -3, 112};
    int searchFor = 9;
    boolean found = false;
    // break
    for (int number : randomNumbers) {
      if (number == searchFor) {
        found = true;
        break;
      }
    }
    System.out.println("Found: " + found);

    // continue
    int positiveNumbers = 0;
    for (int number : randomNumbers) {
      if (number <= 0) {
        continue;
      }
      positiveNumbers++;
    }
    System.out.println("Number of positive numbers:" + positiveNumbers);

  }


  // TODO: return number corresponding to given month, e.g. monthNameToNumber("March") = 3
  // TODO: method should be case-insensitive
  // TODO: return -1 on case of invalid name
  private static int monthNameToNumber(String month) {
    return 0;
  }

// TODO: return reversed string, e.g. reverse("Hello") = "olleH"
  private static String reverse(String string) {
    return "";
  }

}
