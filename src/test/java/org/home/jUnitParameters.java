package org.home;

import org.home.jUnit.jUnitClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class jUnitParameters {

    private int input;
    private boolean answer;

    public jUnitParameters(int input, boolean answer) {
        this.input = input;
        this.answer = answer;
    }

    @Parameterized.Parameters public static Collection<Object[]> testValues() {
        return Arrays.asList(new Object[][] {
                {1, false},
                {100, false},
                {101, true},
                {-5, false},
                {1000, true}
        });
    }

    @Test
    public void checkValueParametrized() {
        boolean expected = answer;
        boolean current = new jUnitClass().methodCheckValue(input);
        assertTrue(expected == current);
    }
}
