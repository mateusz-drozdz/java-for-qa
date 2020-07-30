package com.miquido.javaforqa.week05

import spock.lang.Specification
import spock.lang.Unroll

class FactorialSpec extends Specification {

  Factorial subject

  def setup() {
    subject = new Factorial()
  }

  def cleanup() { } // after every

  def setupSpec() {} // before first
  def cleanupSpec() {} // after last

  def 'should return minus one for negative number'() {
    when: 'factorial computed'
    def result = subject.get(-5)

    then: 'result equals one'
    result == -1
  }

  def 'should return one for zero'() {
    expect:
    subject.get(0) == 1
  }

  @Unroll("Factorial for #n should be #result")
  def 'should calculate factorial for positive number'() {
    expect:
    subject.get(n) == result

    where:
    n | result
    1 | 1
    2 | 2
    3 | 6
    4 | 24
    9 | 362_880
  }

}
