package com.miquido.javaforqa.week01;

public class Strings {
  public static void main(String[] args) {
    String hello = "Hello!";

    // is equivalent to
    char[] helloArray = { 'H', 'e', 'l', 'l', 'o', '!' };
    String helloString = new String(helloArray);

    // String Length
    int len = helloString.length();

    // comparing
    String first = "JavaForQA";
    String second = "JavaForQA";
    System.out.println(first == second); // ???

    String third = new String("JavaForQA");
    String fourth = new String("JavaForQA");
    System.out.println(third == fourth); // ???

    String fifth = "JavaForQA";
    String sixth = new String("JavaForQA");
    System.out.println(fifth == sixth); // ???

    // using equals
    System.out.println(fifth.equals(sixth)); // ???
    System.out.println(fifth.equals("javaforqa")); // ???
    System.out.println(fifth.equalsIgnoreCase("javaforqa")); // ???
  }
}
