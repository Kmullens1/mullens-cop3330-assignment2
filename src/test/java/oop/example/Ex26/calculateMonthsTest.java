package oop.example.Ex26;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class calculateMonthsTest {

    @Test
    void calculateMonthsUntilPaidOff_correct_output_1st_test() {
        calculateMonths calculate = new calculateMonths();

        double expected = 70.0;
        double actual = calculate.calculateMonthsUntilPaidOff(5000, 12, 100);

        assertEquals(expected, actual);
    }

    @Test
    void calculateMonthsUntilPaidOff_correct_output_2nd_test() {
        calculateMonths calculate = new calculateMonths();

        double expected = 394.0;
        double actual = calculate.calculateMonthsUntilPaidOff(4000, 15, 50);

        assertEquals(expected, actual);
    }


////VALID INPUT CHECKER TESTS//////////////////////////////////////////////////////////////////////
    @Test
    void validInputChecker_Negative_Balances_Return_Invalid() {
        calculateMonths calculate = new calculateMonths();

        boolean output = calculate.validInputChecker(-1500, 12, 100);

        assertFalse(output);
    }

    @Test
    void validInputChecker_Zero_Balances_Return_Invalid() {
        calculateMonths calculate = new calculateMonths();

        boolean output = calculate.validInputChecker(0, 12, 100);

        assertFalse(output);
    }

    @Test
    void validInputChecker_Negative_Percentages_Return_Invalid() {
        calculateMonths calculate = new calculateMonths();

        boolean output = calculate.validInputChecker(1500, -12, 100);

        assertFalse(output);
    }

    @Test
    void validInputChecker_Percentages_Over_100_Return_Invalid() {
        calculateMonths calculate = new calculateMonths();

        boolean output = calculate.validInputChecker(1500, 345, 100);

        assertFalse(output);
    }

    @Test
    void validInputChecker_Zero_Percent_Returns_Invalid() {
        calculateMonths calculate = new calculateMonths();

        boolean output = calculate.validInputChecker(1500, 0, 100);

        assertFalse(output);
    }

    @Test
    void validInputChecker_Negative_Monthly_Payment_Values_Return_Invalid() {
        calculateMonths calculate = new calculateMonths();

        boolean output = calculate.validInputChecker(1500, 12, -100);

        assertFalse(output);
    }

    @Test
    void validInputChecker_Monthly_Payments_Of_Zero_Return_Invalid() {
        calculateMonths calculate = new calculateMonths();

        boolean output = calculate.validInputChecker(1500, 12, 0);

        assertFalse(output);
    }

    @Test
    void validInputChecker_Decimal_Percentages_Return_Valid() {
        calculateMonths calculate = new calculateMonths();

        boolean output = calculate.validInputChecker(1500, 0.5, 100);

        assertTrue(output);
    }

    @Test
    void validInputChecker_Normal_Values_Return_Valid() {
        calculateMonths calculate = new calculateMonths();

        boolean output = calculate.validInputChecker(1500, 12, 100);

        assertTrue(output);
    }
}