//: net/mindview/atunit/Test.java
// The @Test tag.
package com.pengttyy.annations.example;
import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Test {} ///:~
