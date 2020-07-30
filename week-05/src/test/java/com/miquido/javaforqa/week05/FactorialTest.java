package com.miquido.javaforqa.week05;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FactorialTest {

  Factorial subject;

  @BeforeAll
  static void beforeAll() {
    System.out.println("beforeAll");
  }

  @AfterAll
  static void afterAll() {
    System.out.println("afterAll");
  }

  @BeforeEach
  void beforeEach() {
    subject = new Factorial();
    System.out.println("beforeEach");
  }

  @AfterEach
  void afterEach() {
    System.out.println("afterEach");
  }

  // @Test
  // @DisplayName("should throw ArithmeticException one for negative number with message 'Number cannot be negative'")
  // void shouldThrowExceptionForNegativeNumber() {
  //   ArithmeticException ex = assertThrows(ArithmeticException.class, () -> subject.get(-5));
  //   assertEquals("Number cannot be negative", ex.getMessage());
  // }


  @Test
  @DisplayName("should return minus one for negative number")
  void shouldReturnMinusOneForNegativeNumber() {
    assertEquals(-1, subject.get(-5));
  }

  // 0! = 1
  // AAA - Arrange / Act / Assert
  @Test
  void shouldReturnOneForZero() {
  //  when
    long result = subject.get(0);
  //  then
    assertEquals(1, result);
  }

  @Test
  void shouldCalculateFactorialForPositiveNumber() {
    assertEquals(1, subject.get(1));
    assertEquals(2, subject.get(2));
    assertEquals(6, subject.get(3));
    assertEquals(24, subject.get(4));
    assertEquals(362_880, subject.get(9));
  }

}