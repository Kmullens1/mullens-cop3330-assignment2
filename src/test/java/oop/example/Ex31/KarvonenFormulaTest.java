package oop.example.Ex31;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KarvonenFormulaTest {

    @Test
    void calculateRate_Young_Age_Low_RHR() {
        KarvonenFormula test = new KarvonenFormula();
        String expected = ("Resting Pulse: 65 Age: 22\n\n" +
                "Intensity    | Rate\n" +
                "-------------|-------- \n" +
                "         55% | 138 bpm\n" +
                "         60% | 145 bpm\n" +
                "         65% | 151 bpm\n" +
                "         70% | 158 bpm\n" +
                "         75% | 165 bpm\n" +
                "         80% | 171 bpm\n" +
                "         85% | 178 bpm\n" +
                "         90% | 185 bpm\n" +
                "         95% | 191 bpm");

        String actual = test.calculateRate(22, 65);

        assertEquals(expected, actual);
    }

    @Test
    void calculateRate_Older_Age_Higher_RHR() {
        KarvonenFormula test = new KarvonenFormula();
        String expected = ("Resting Pulse: 100 Age: 98\n\n" +
                "Intensity    | Rate\n" +
                "-------------|-------- \n" +
                "         55% | 112 bpm\n" +
                "         60% | 113 bpm\n" +
                "         65% | 114 bpm\n" +
                "         70% | 115 bpm\n" +
                "         75% | 117 bpm\n" +
                "         80% | 118 bpm\n" +
                "         85% | 119 bpm\n" +
                "         90% | 120 bpm\n" +
                "         95% | 121 bpm");

        String actual = test.calculateRate(98, 100);

        assertEquals(expected, actual);
    }
}