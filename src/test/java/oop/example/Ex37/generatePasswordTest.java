package oop.example.Ex37;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class generatePasswordTest {

    @Test
    void passwordBuilder_Check_The_Length() {
        generatePassword generate = new generatePassword();
        String password = generate.passwordBuilder(8, 2, 2);

        int expected = 8;
        int actual = password.length();
        assertEquals(expected, actual);
    }

    @Test
    void passwordBuilder_Check_Length_If_NumOfChars_and_Numbers_Is_Greater_Than_Length()
    {
        generatePassword generate = new generatePassword();
        String password = generate.passwordBuilder(8, 2, 9);

        int expected = 11;      //Minimum length is 8, but 11 characters are required
        int actual = password.length();
        assertEquals(expected, actual);
    }

    @Test
    void passwordBuilder_Check_The_Length_If_Zero() {
        generatePassword generate = new generatePassword();
        String password = generate.passwordBuilder(0, 2, 2);

        int expected = 0;
        int actual = password.length();
        assertEquals(expected, actual);
    }

    @Test
    void passwordBuilder_Check_The_Length_If_NumOfSpecialChars_Is_Zero() {
        generatePassword generate = new generatePassword();
        String password = generate.passwordBuilder(8, 0, 2);

        int expected = 8;
        int actual = password.length();
        assertEquals(expected, actual);
    }

    @Test
    void passwordBuilder_Check_The_Length_If_NumOfNumbers_Is_Zero() {
        generatePassword generate = new generatePassword();
        String password = generate.passwordBuilder(8, 3, 0);

        int expected = 8;
        int actual = password.length();
        assertEquals(expected, actual);
    }
}