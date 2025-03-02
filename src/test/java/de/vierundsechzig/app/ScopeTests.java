package de.vierundsechzig.app;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ScopeTests {
  public ScopeTests() {
  }

  @Test
  public void testStringCoercionWithLeadingString() {
      assertTrue(HavingFunWithScopes.stuffCaller() == 10);         
  }
}