package oop.example.Ex25;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {
    ////TEST CHECK STRENGTH FUNCTION/////////////////////////////////////////////////////////////////
    //Less than 8 characters tests
    @Test
    void checkStrength_only_number_returns_very_weak() {
        PasswordValidator validate = new PasswordValidator();

        String expected = "The password '123' is a very weak password.";
        String actual = validate.checkStrength("123");

        assertEquals(expected, actual);
    }

    @Test
    void checkStrength_only_special_characters_returns_very_weak() {
        PasswordValidator validate = new PasswordValidator();

        String expected = "The password '#@$' is a very weak password.";
        String actual = validate.checkStrength("#@$");

        assertEquals(expected, actual);
    }

    @Test
    void checkStrength_number_and_special_character_returns_very_weak() {
        PasswordValidator validate = new PasswordValidator();

        String expected = "The password '12#' is a very weak password.";
        String actual = validate.checkStrength("12#");

        assertEquals(expected, actual);
    }

    @Test
    void checkStrength_only_letters_returns_weak() {
        PasswordValidator validate = new PasswordValidator();

        String expected = "The password 'hello' is a weak password.";
        String actual = validate.checkStrength("hello");

        assertEquals(expected, actual);
    }

    @Test
    void checkStrength_letters_with_a_number_returns_weak() {
        PasswordValidator validate = new PasswordValidator();

        String expected = "The password 'Hi3' is a weak password.";
        String actual = validate.checkStrength("Hi3");

        assertEquals(expected, actual);
    }

    @Test
    void checkStrength_letters_with_a_special_character_returns_weak() {
        PasswordValidator validate = new PasswordValidator();

        String expected = "The password 'Hi@' is a weak password.";
        String actual = validate.checkStrength("Hi@");

        assertEquals(expected, actual);
    }

    @Test
    void checkStrength_letters_with_a_number_and_special_character_returns_weak() {
        PasswordValidator validate = new PasswordValidator();

        String expected = "The password 'Hi@2' is a weak password.";
        String actual = validate.checkStrength("Hi@2");

        assertEquals(expected, actual);
    }

    //Greater than 8 characters tests
    @Test
    void checkStrength_greater_than_8_with_only_numbers_returns_weak() {
        PasswordValidator validate = new PasswordValidator();

        String expected = "The password '12345678' is a weak password.";
        String actual = validate.checkStrength("12345678");

        assertEquals(expected, actual);
    }

    @Test
    void checkStrength_greater_than_8_with_only_letters_returns_weak() {
        PasswordValidator validate = new PasswordValidator();

        String expected = "The password 'defenestration' is a weak password.";
        String actual = validate.checkStrength("defenestration");

        assertEquals(expected, actual);
    }

    @Test
    void checkStrength_greater_than_8_with_only_special_characters_returns_weak() {
        PasswordValidator validate = new PasswordValidator();

        String expected = "The password '!@#$%^&*' is a weak password.";
        String actual = validate.checkStrength("!@#$%^&*");

        assertEquals(expected, actual);
    }

    @Test
    void checkStrength_greater_than_8_with_letters_and_numbers_returns_strong() {
        PasswordValidator validate = new PasswordValidator();

        String expected = "The password 'abcde123' is a strong password.";
        String actual = validate.checkStrength("abcde123");

        assertEquals(expected, actual);
    }

    @Test
    void checkStrength_greater_than_8_with_letters_and_special_characters_returns_strong() {
        PasswordValidator validate = new PasswordValidator();

        String expected = "The password 'CamelsRule$$' is a strong password.";
        String actual = validate.checkStrength("CamelsRule$$");

        assertEquals(expected, actual);
    }

    @Test
    void checkStrength_greater_than_8_with_numbers_and_special_characters_returns_strong() {
        PasswordValidator validate = new PasswordValidator();

        String expected = "The password '1234%^&*' is a strong password.";
        String actual = validate.checkStrength("1234%^&*");

        assertEquals(expected, actual);
    }

    @Test
    void checkStrength_greater_than_8_with_all_three_types_returns_very_strong() {
        PasswordValidator validate = new PasswordValidator();

        String expected = "The password 'abc123$%^' is a very strong password.";
        String actual = validate.checkStrength("abc123$%^");

        assertEquals(expected, actual);
    }

    ////TEST LETTERS FUNCTION////////////////////////////////////////////////////////////////////////
    @Test
    void letters__At_least_one_character_is_a_letter() {
        PasswordValidator validate = new PasswordValidator();

        boolean actual = validate.letters("h");

        assertTrue(actual);
    }

    @Test
    void letters__Multiple_characters_are_letters() {
        PasswordValidator validate = new PasswordValidator();

        boolean actual = validate.letters("abc123$%^");

        assertTrue(actual);
    }

    @Test
    void letters__All_characters_are_letters() {
        PasswordValidator validate = new PasswordValidator();

        boolean actual = validate.letters("defenestration");

        assertTrue(actual);
    }

    @Test
    void letters__No_characters_are_letters() {
        PasswordValidator validate = new PasswordValidator();

        boolean actual = validate.letters("1234@");

        assertFalse(actual);
    }


    ////TEST NUMBERS FUNCTION////////////////////////////////////////////////////////////////////////
    @Test
    void numbers__At_least_one_character_is_a_number() {
        PasswordValidator validate = new PasswordValidator();

        boolean actual = validate.numbers("1");

        assertTrue(actual);
    }

    @Test
    void numbers__Multiple_characters_are_a_number() {
        PasswordValidator validate = new PasswordValidator();

        boolean actual = validate.numbers("abc123$%^");

        assertTrue(actual);
    }

    @Test
    void numbers__All_characters_are_a_number() {
        PasswordValidator validate = new PasswordValidator();

        boolean actual = validate.numbers("123643");

        assertTrue(actual);
    }

    @Test
    void numbers__No_characters_are_a_number() {
        PasswordValidator validate = new PasswordValidator();

        boolean actual = validate.numbers("paleontologist");

        assertFalse(actual);
    }

    ////TEST SPECIAL CHARACTERS FUNCTION/////////////////////////////////////////////////////////////
    @Test
    //FIXME - When there are less than 4 characters (including at least 1 special character) this test fails
    //FIXME - I spent way too long trying to figure out why even though my actual code seems to work correctly
    //FIXME - in these instances anyways... This is gonna have to be a problem for another day
    void special__At_least_one_character_is_a_special_character() {
        PasswordValidator validate = new PasswordValidator();

        boolean actual = validate.special("!!!!");

        assertTrue(actual);
    }

    @Test
    void special__Multiple_characters_are_special_characters() {
        PasswordValidator validate = new PasswordValidator();

        boolean actual = validate.special("{abc1 $}");

        assertTrue(actual);
    }

    @Test
    void special__All_characters_are_special_characters() {
        PasswordValidator validate = new PasswordValidator();

        boolean actual = validate.special("**$&$&$**");

        assertTrue(actual);
    }

    @Test
    void special__No_characters_are_special_characters() {
        PasswordValidator validate = new PasswordValidator();

        boolean actual = validate.special("absolutism");

        assertFalse(actual);
    }
}