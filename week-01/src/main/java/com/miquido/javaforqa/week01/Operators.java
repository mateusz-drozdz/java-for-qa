package com.miquido.javaforqa.week01;

public class Operators {
  public static void main(String[] args) {
    System.out.println("isEven(84) = " + isEven(84));
    System.out.println("isEven(73) = " + isEven(73));

    System.out.println("Last digit of 837465 is " + lastDigit(837465));
    System.out.println("Last digit of 9999 is " + lastDigit(9999));

    System.out.println("abs(4) = " + abs(4));
    System.out.println("abs(-4) = " + abs(-4));

    System.out.println("compare(12, 33) = " + compare(12, 33));
    System.out.println("compare(11, 11) = " + compare(11, 11));
    System.out.println("compare(784, 98) = " + compare(784, 98));
  }

  // TODO: check if given number is divisible by two
  private static boolean isEven(int number) {
    return false;
  }

  // TODO: return the last digit of given number, e.g. lastDigit(837465) = 5
  private static int lastDigit(int number) {
    return 0;
  }

  // TODO: return the absolute value of a number, e.g. abs(4) = abs(-4) = 4
  private static int abs(int number) {
    return 0;
  }

  // TODO: return
  //   1  if a is greater than b
  //   0  if a equals b
  //  -1  if a is smaller than b
  private static int compare(int a, int b) {
    return 0;
  }
}
