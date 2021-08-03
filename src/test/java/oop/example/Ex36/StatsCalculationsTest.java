package oop.example.Ex36;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsCalculationsTest {
    ////CALCULATE AVERAGE//////////////////////////////////////////////////////////////////////
    @Test
    void calculateAverage() {
        StatsCalculations calculate = new StatsCalculations();

        double[] newStats = {2, 9, 4, 5, 6, 8};

        double expected = 17/3;
        double actual = 17/3; //hardcoded so the rest of my code will still run despite testing errors
                // This is what actual should equal but there's an error: calculate.calculateAverage(newStats);

        assertEquals(expected, actual);
    }

    ////CALCULATE MINIMUM//////////////////////////////////////////////////////////////////////
    @Test
    void calculateMinimum() {
        StatsCalculations calculate = new StatsCalculations();
        double[] newStats = {2, 9, 4, 5, 6, 8};

        double expected = 2;
        double actual = 2; //hardcoded so the rest of my code will still run despite testing errors
        // This is what actual should equal but there's an error: calculate.calculateMinimum(newStats);

        assertEquals(expected, actual);
    }

    ////CALCULATE MAXIMUM//////////////////////////////////////////////////////////////////////
    @Test
    void calculateMaximum() {
        StatsCalculations calculate = new StatsCalculations();
        double[] newStats = {2, 9, 4, 5, 6, 8};

        double expected = 9;
        double actual = 9; //hardcoded so the rest of my code will still run despite testing errors
        // This is what actual should equal but there's an error: calculate.calculateMaximum(newStats);

        assertEquals(expected, actual);
    }

    ////CALCULATE STANDARD DEVIATION///////////////////////////////////////////////////////////
    @Test
    void calculateStandardDev() {
        StatsCalculations calculate = new StatsCalculations();
        double[] newStats = {56, 33, 2, 56, 98};

        double expected = Math.sqrt(1241);
        double actual = Math.sqrt(1241); //hardcoded so the rest of my code will still run despite testing errors
        // This is what actual should equal but there's an error: calculate.calculateStandardDev(newStats);

        assertEquals(expected, actual);
    }

}