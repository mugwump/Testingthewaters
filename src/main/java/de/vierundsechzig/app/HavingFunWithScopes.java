package de.vierundsechzig.app;

public class HavingFunWithScopes {
  private static int v=1;
 
  public static void doStuff(int x) {
    v++; 
    x+=v;
    
  }

  public static int stuffCaller() {
    int v = 10;
    doStuff(v);
    return v;
  }
}
