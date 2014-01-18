//: annotations/database/Uniqueness.java
// Sample of nested annotations
package com.pengttyy.annations.example.database;

public @interface Uniqueness {
  Constraints constraints()
    default @Constraints(unique=true);
} ///:~
