package oop.example.Ex29;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeToDoubleCalculatorTest {
    ////CONTAINS LETTERS//////////////////////////////////////////////////////////
    @Test
    void containsLetters_Uppercase_Letters() {
        TimeToDoubleCalculator verify = new TimeToDoubleCalculator();

        boolean input = verify.containsLetters("ABC");
        assertTrue(input);
    }

    @Test
    void containsLetters_Lowercase_Letters() {
        TimeToDoubleCalculator verify = new TimeToDoubleCalculator();

        boolean input = verify.containsLetters("xyz");
        assertTrue(input);
    }

    @Test
    void containsLetters_Upper_and_Lowercase_Letters() {
        TimeToDoubleCalculator verify = new TimeToDoubleCalculator();

        boolean input = verify.containsLetters("Keri");
        assertTrue(input);
    }

    @Test
    void containsLetters_Numbers_and_Letters_Imputed() {
        TimeToDoubleCalculator verify = new TimeToDoubleCalculator();

        boolean input = verify.containsLetters("Abc123");
        assertTrue(input);
    }

    @Test
    void containsLetters_Only_Numbers_Imputed() {
        TimeToDoubleCalculator verify = new TimeToDoubleCalculator();

        boolean input = verify.containsLetters("123");
        assertFalse(input);
    }

    ////DOUBLE EQUATION///////////////////////////////////////////////////////////
    @Test
    void doubleEquation_Computes_Properly_With_Small_Numbers() {
        TimeToDoubleCalculator calculate = new TimeToDoubleCalculator();
        double expected = 72;
        double actual = calculate.doubleEquation("1");

        assertEquals(expected, actual);
    }

    @Test
    void doubleEquation_Computes_Properly_With_Large_Numbers() {
        TimeToDoubleCalculator calculate = new TimeToDoubleCalculator();
        double expected = (1.3525664779848954E-6);
        double actual = calculate.doubleEquation("53232134");

        assertEquals(expected, actual);

    }

}