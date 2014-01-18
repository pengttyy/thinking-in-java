//: annotations/Testable.java
package com.pengttyy.annations.example;


public class Testable {
  public void execute() {
    System.out.println("Executing..");
  }
  @Test void testExecute() { execute(); }
} ///:~
