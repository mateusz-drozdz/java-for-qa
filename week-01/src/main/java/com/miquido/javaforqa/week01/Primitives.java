package com.miquido.javaforqa.week01;

public class Primitives {
  public static void main(String[] args) {

    int declaredVariable; // uninitialized primitive have a default value
    int initializedVariable = 111;

    // for primitives we don't need to use the 'new' keyword
    boolean result = true;
    char capitalC = 'C';
    byte b = 100;
    short s = 10000;
    int i = 100000;
    long l = 20000000L; // 'L' denotes that it's long
    float pi = 3.1415f;
    double d = 123.456d;

    // numbers can also be hexadecimal or binary ('0x'/'0b' prefix) - rarely used but possible
    // TODO: check hexVal/binVal values
    int hexVal = 0x1a;
    int binVal = 0b11010;

    // we can place underscore between digits in numeric literals - can be used to improve readability
    // TODO: is it good to store credit card / pesel as a numeric value?
    long creditCardNumber = 1234_5678_9012_3456L;
    long peselNumber = 89_01_01_34_566L;
    float longFloat =  12.67_88f;
    long hexBytes = 0xFF_EC_DE_5E;
    long hexWords = 0xCAFE_BABE;
    long maxLong = 0x7fff_ffff_ffff_ffffL;

    // chars
    char decimalLiteral = 65; // decimal format
    char secretChar = '\u0041'; // unicode format
    char anotherChar = '\101'; // octal format


    // TODO: Create `byte` variable and assign value outside the range (-128-127), ex. 128. Check the result.


    // TODO: What will be the result of: 1.0 - 9 * 0.1 ?


  }
}
