package com.miquido.javaforqa.week01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExercisesTest {

  @Test
  void greatest() {
    assertEquals(5, Exercises.greatest(1, 3, 5));
    assertEquals(111, Exercises.greatest(111, 3, 5));
    assertEquals(12, Exercises.greatest(-1, 12, 5));
  }

  @Test
  void describeTheNumber() {
    assertEquals("zero", Exercises.describeTheNumber(0.0f));
    assertEquals("small negative", Exercises.describeTheNumber(-0.55f));
    assertEquals("negative", Exercises.describeTheNumber(-5.12f));
    assertEquals("negative", Exercises.describeTheNumber(-123));
    assertEquals("negative", Exercises.describeTheNumber(-1_000_000));
    assertEquals("large negative", Exercises.describeTheNumber(-1_000_001));
    assertEquals("small positive", Exercises.describeTheNumber(0.75f));
    assertEquals("positive", Exercises.describeTheNumber(1));
    assertEquals("positive", Exercises.describeTheNumber(34.56f));
    assertEquals("positive", Exercises.describeTheNumber(1_000_000));
    assertEquals("large positive", Exercises.describeTheNumber(1_000_001));
    assertEquals("large positive", Exercises.describeTheNumber(2_000_001.5f));
  }

  @Test
  void firstOdds() {
    assertNotNull(Exercises.firstOdds(1));
    assertArrayEquals(new int[] {1}, Exercises.firstOdds(1));
    assertArrayEquals(new int[] {1, 3, 5}, Exercises.firstOdds(3));
    assertArrayEquals(new int[] {1, 3, 5, 7}, Exercises.firstOdds(4));
    assertArrayEquals(new int[] {1, 3, 5, 7, 9, 11}, Exercises.firstOdds(6));
  }

  @Test
  void firstDivisible() {
    assertNotNull(Exercises.firstDivisible(1, 1));
    assertArrayEquals(new int[] {1}, Exercises.firstDivisible(1, 1));
    assertArrayEquals(new int[] {2, 4}, Exercises.firstDivisible(2, 2));
    assertArrayEquals(new int[] {5, 10, 15}, Exercises.firstDivisible(3, 5));
  }

  @Test
  void printPattern1() {
    assertNotNull(Exercises.generatePattern1(1));
    assertEquals("1\n", Exercises.generatePattern1(1));
    assertEquals("1\n12\n123\n", Exercises.generatePattern1(3));
    assertEquals("1\n12\n123\n1234\n12345\n", Exercises.generatePattern1(5));
  }

  @Test
  void printPattern2() {
    assertNotNull(Exercises.generatePattern2(1));
    assertEquals("1\n", Exercises.generatePattern2(1));
    assertEquals("1\n22\n333\n", Exercises.generatePattern2(3));
    assertEquals("1\n22\n333\n4444\n55555\n", Exercises.generatePattern2(5));
  }

  @Test
  void weekDayName() {
    assertNotNull(Exercises.weekDayName(1));
    assertEquals("monday", Exercises.weekDayName(1).toLowerCase());
    assertEquals("sunday", Exercises.weekDayName(7).toLowerCase());
    assertEquals("invalid day", Exercises.weekDayName(0).toLowerCase());
    assertEquals("invalid day", Exercises.weekDayName(8).toLowerCase());
  }
}