package de.vierundsechzig.app;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;


public class AppTest {
    public AppTest() {
    }

    @Test
    public void testStringCoercionWithLeadingString() {
        assertEquals("Leading with a string should concatenate everything", "123", Adder.add("1", 2, 3));         
    }

    @Test
    public void testStringCoercionWithLeadingInt() {
        assertEquals("Leading numbers should be added, trailing string concatenated", Adder.add(1, 2, "3"), "33");
    }

    @Test
    public void testStringCoercionWithVarArgs() {
        assertEquals("Summing up integer should return with the proper sum", 6, Adder.varAdd(1, 2, 3));
    }

    @Test
    public void testStringCoercionWithVarArgsLeadingString() {
        assertEquals("Leading string should coerce all numbers into  string", "123", Adder.varAdd("1", 2, 3));
    }

    @Test
    public void testStringCoercionWithTrailingString() {
        assertEquals("Leading numbers should be added up, trailing string coerced", "33", Adder.varAdd(1, 2, "3"));
    }

    @Test
    public void testStringCoercionWithMoreVariables() {
        assertEquals("Adding up more than 3 variables", "6FOO", Adder.varAdd(1, 2, 3, "FOO"));
    }
    @Test
    public void testCallingTheAdderWithNonIntegerString() {
        int[] numbers = {1, 2, 3};
        assertThrows(ClassCastException.class, () -> Adder.varAdd(1, 2, numbers, "FOO"));
    }



}
