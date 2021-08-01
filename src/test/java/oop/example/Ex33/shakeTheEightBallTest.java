package oop.example.Ex33;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class shakeTheEightBallTest {

    @Test
    void possibleResponses_If_Random_Number_Is_Zero() {
        shakeTheEightBall shake = new shakeTheEightBall();

        String expected = "Yes.";
        String actual = shake.possibleResponses(0);

        assertEquals(expected, actual);
    }

    @Test
    void possibleResponses_If_Random_Number_Is_One() {
        shakeTheEightBall shake = new shakeTheEightBall();

        String expected = "No.";
        String actual = shake.possibleResponses(1);

        assertEquals(expected, actual);
    }

    @Test
    void possibleResponses_If_Random_Number_Is_Two() {
        shakeTheEightBall shake = new shakeTheEightBall();

        String expected = "Maybe.";
        String actual = shake.possibleResponses(2);

        assertEquals(expected, actual);
    }

    @Test
    void possibleResponses_If_Random_Number_Is_Three() {
        shakeTheEightBall shake = new shakeTheEightBall();

        String expected = "Ask again later.";
        String actual = shake.possibleResponses(3);

        assertEquals(expected, actual);
    }
}