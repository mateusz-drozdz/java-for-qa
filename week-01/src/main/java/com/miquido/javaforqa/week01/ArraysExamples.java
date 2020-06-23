package com.miquido.javaforqa.week01;

import java.util.Arrays;

public class ArraysExamples {
  public static void main(String[] args) {
    // array declaration
    int[] arrayOfInts;
    char[] arrayOfChars;

    // initialization
    arrayOfInts = new int[10]; // fixed size
    int[] anotherArray = new int[5];
    int[] array = {10, 20, 30, 40, 50};

    // misc
    System.out.println("Array length: " + array.length);
    System.out.println("First element: " + array[0]);
    System.out.println("Last element: " + array[array.length - 1]);
    array[0] = 111;
    System.out.println(array[0]);

    // manipulation
    char[] hello = {'h', 'e', 'l', 'l',  'o', '!'};
    char[] copy = Arrays.copyOfRange(hello, 1, 5);
    System.out.println(new String(copy));

    // exercise
    int[] someNumbers = {33, 55, 66, 77};
    int[] someNumbersSwitched = switchFirstWithLast(someNumbers);
    System.out.println(Arrays.toString(someNumbersSwitched)); // should return [77, 55, 66, 33]
    System.out.println(Arrays.toString(someNumbers)); // should return [33, 55, 66, 77]
  }

  // TODO: return array with replaced the first and last element, e.g. {1, 3, 5} -> {5, 3, 1}
  // TODO: ! Do not modify the existing array !
  public static int[] switchFirstWithLast(int[] array) {
    int tmp = array[0];
    int[] copy = Arrays.copyOf(array, array.length);
    copy[0] = array[copy.length - 1];
    copy[array.length-1] = array[0];
    return copy;
  }
}
