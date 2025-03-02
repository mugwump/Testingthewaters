package de.vierundsechzig.app;

import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class AppTest {
    public AppTest() {
    }

    @Test
    public void testStringCoercionWithLeadingString() {
        assertTrue(Adder.add("1", 2, 3).equals("123"));         
    }

    @Test
    public void testStringCoercionWithLeadingInt() {
        assertTrue(Adder.add(1, 2, "3").equals("33"));
    }
}
