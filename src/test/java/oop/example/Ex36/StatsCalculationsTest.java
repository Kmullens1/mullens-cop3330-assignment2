package oop.example.Ex36;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsCalculationsTest {
    ////CALCULATE AVERAGE//////////////////////////////////////////////////////////////////////
    @Test
    void calculateAverage() {
        StatsCalculationsTest calculate = new StatsCalculationsTest();
        double[] newStats = {2, 9, 4, 5, 6, 8};

        double expected = 17/3;
        double actual = calculate.calculateAverage(newStats);

        assertEquals(expected, actual);
    }

    ////CALCULATE MINIMUM//////////////////////////////////////////////////////////////////////
    @Test
    void calculateMinimum() {
        StatsCalculationsTest calculate = new StatsCalculationsTest();
        double[] newStats = {2, 9, 4, 5, 6, 8};

        double expected = 2;
        double actual = calculate.calculateMinimum(newStats);

        assertEquals(expected, actual);
    }

    ////CALCULATE MAXIMUM//////////////////////////////////////////////////////////////////////
    @Test
    void calculateMaximum() {
        StatsCalculationsTest calculate = new StatsCalculationsTest();
        double[] newStats = {2, 9, 4, 5, 6, 8};

        double expected = 9;
        double actual = calculate.calculateMaximum(newStats);

        assertEquals(expected, actual);
    }

    ////CALCULATE STANDARD DEVIATION///////////////////////////////////////////////////////////
    @Test
    void calculateStandardDev() {
        StatsCalculationsTest calculate = new StatsCalculationsTest();
        double[] newStats = {56, 33, 2, 56, 98};

        double expected = Math.sqrt(1241);
        double actual = calculate.calculateStandardDev(newStats);

        assertEquals(expected, actual);
    }

}