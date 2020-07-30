package com.miquido.javaforqa.week05;

import java.util.stream.IntStream;

public class Factorial {

  /**
   * n! = n * (n-1) * (n-2) * .. * 2 * 1
   * @param n
   * @return n! for n >= 0
   *         -1 for n < 0
   *         (ArithmeticException for n < 0)
   */
  public long get(int n) {
    if (n < 0) {
      // throw new ArithmeticException("Number cannot be negative");
      return -1;
    }
    // lambda expression: (a, b) -> a + b
    return IntStream.rangeClosed(1, n)
        .reduce(1, (accumulator, value) -> accumulator * value);
  }

}
