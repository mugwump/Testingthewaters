package de.vierundsechzig.app;

import java.util.Arrays;


public class Adder {

  public static String add(int a, int b, String c) {
    return a + b + c;
  }

  public static String add(String a, int b, int c) {
    return a + b + c;
  }

  public static Object varAdd(Object... varObjects) {
    
    Object addedUp = Arrays.asList(varObjects)
                           .stream()
                           .reduce(null, (a, b) -> {
                              if (a == null) {
                                return b;
                              } 
                              if(b instanceof String) {
                                return a + (String)b;
                              }
                              if(a instanceof Integer) {
                                return (Integer)a + (Integer)b;
                              }
                              return (String)a + b;

        });

    return addedUp;

  }
    
}
