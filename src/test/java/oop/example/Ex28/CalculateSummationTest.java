package oop.example.Ex28;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculateSummationTest {

    @Test
    void calculateSum_All_Five_Numbers_Are_Same() {
        CalculateSummation check = new CalculateSummation();
        double expected = 15;

        double[] first = new double[]{3, 3, 3, 3, 3};
        double actual = check.calculateSum(first);

        assertEquals(expected, actual);
    }

    @Test
    void calculateSum_All_Five_Numbers_Are_Different() {
        CalculateSummation check = new CalculateSummation();
        double expected = 15;

        double[] first = new double[]{1, 2, 3, 4, 5};
        double actual = check.calculateSum(first);

        assertEquals(expected, actual);
    }

    @Test
    void calculateSum_All_Five_Numbers_Are_Large() {
        CalculateSummation check = new CalculateSummation();
        double expected = 36288;

        double[] first = new double[]{100, 500, 10032, 23423, 2233};
        double actual = check.calculateSum(first);

        assertEquals(expected, actual);
    }

    @Test
    void calculateSum_Negative_And_Positive_Numbers_Positive_Outcome() {
        CalculateSummation check = new CalculateSummation();
        double expected = 21145;

        double[] first = new double[]{-100, 5, 50, 23423, -2233};
        double actual = check.calculateSum(first);

        assertEquals(expected, actual);
    }

    @Test
    void calculateSum_Negative_And_Positive_Numbers_Negative_Outcome() {
        CalculateSummation check = new CalculateSummation();
        double expected = -25701;

        double[] first = new double[]{-100, 5, 50, -23423, -2233};
        double actual = check.calculateSum(first);

        assertEquals(expected, actual);
    }

    @Test
    void calculateSum_Negative_And_Positive_Decimal_Numbers() {
        CalculateSummation check = new CalculateSummation();
        double expected = 21145.34977;

        double[] first = new double[]{-100.5, 5.3, 50.55, 23423.234, -2233.23423};
        double actual = check.calculateSum(first);

        assertEquals(expected, actual);
    }
}