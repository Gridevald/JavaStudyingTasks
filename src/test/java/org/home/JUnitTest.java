package org.home;

import org.home.jUnit.JUnitClass;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class JUnitTest {

    @Test
    public void testOne() {
        double d = new JUnitClass().methodZeroDivide(1);
        assertEquals(d, 1, 0.0001);
    }

    @Test(expected = ArithmeticException.class)
    public void testZero() {
        new JUnitClass().methodZeroDivide(0);
    }

    @Ignore("test ignore annotation")
    @Test
    public void testTrue() {
        assertTrue(true);
    }
}
