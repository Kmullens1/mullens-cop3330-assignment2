package oop.example.Ex32;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RandomNumberGeneratorTest {

    @Test
    void generateNumber_Level_One() {
        RandomNumberGenerator generate = new RandomNumberGenerator();
        int randomNumber = generate.generateNumber(1);

        assertTrue(randomNumber >= 0 && randomNumber <= 10);
    }

    @Test
    void generateNumber_Level_Two() {
        RandomNumberGenerator generate = new RandomNumberGenerator();
        int randomNumber = generate.generateNumber(2);

        assertTrue(randomNumber >= 0 && randomNumber <= 100);
    }

    @Test
    void generateNumber_Level_Three() {
        RandomNumberGenerator generate = new RandomNumberGenerator();
        int randomNumber = generate.generateNumber(3);

        assertTrue(randomNumber >= 0 && randomNumber <= 1000);
    }

}