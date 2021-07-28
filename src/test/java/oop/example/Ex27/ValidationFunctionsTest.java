package oop.example.Ex27;

import oop.example.Ex24.AnagramChecker;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidationFunctionsTest {
    ////VALIDATE FIRST NAME ISN'T BLANK////////////////////////////////////////////////
    @Test
    void validateFirstNameNotBlank_If_Left_Blank() {
        ValidationFunctions check = new ValidationFunctions();

        boolean actual = check.validateFirstNameNotBlank("");
        assertFalse(actual);
    }

    @Test
    void validateFirstNameNotBlank_If_Only_One_Uppercase_Letter() {
        ValidationFunctions check = new ValidationFunctions();

        boolean actual = check.validateFirstNameNotBlank("K");
        assertTrue(actual);
    }

    @Test
    void validateFirstNameNotBlank_If_Only_One_Lowercase_Letter() {
        ValidationFunctions check = new ValidationFunctions();

        boolean actual = check.validateFirstNameNotBlank("k");
        assertTrue(actual);
    }

    @Test
    void validateFirstNameNotBlank_If_Only_One_Number() {
        ValidationFunctions check = new ValidationFunctions();

        boolean actual = check.validateFirstNameNotBlank("1");
        assertTrue(actual);
    }

    @Test
    void validateFirstNameNotBlank_If_MultipleLetters() {
        ValidationFunctions check = new ValidationFunctions();

        boolean actual = check.validateFirstNameNotBlank("Keri");
        assertTrue(actual);
    }

    ////VALIDATE LAST NAME ISN'T BLANK/////////////////////////////////////////////////

    @Test
    void validateLastNameNotBlank_If_Left_Blank() {
        ValidationFunctions check = new ValidationFunctions();

        boolean actual = check.validateLastNameNotBlank("");
        assertFalse(actual);
    }

    @Test
    void validateLastNameNotBlank_If_Only_One_Uppercase_Letter() {
        ValidationFunctions check = new ValidationFunctions();

        boolean actual = check.validateLastNameNotBlank("K");
        assertTrue(actual);
    }

    @Test
    void validateLastNameNotBlank_If_Only_One_Lowercase_Letter() {
        ValidationFunctions check = new ValidationFunctions();

        boolean actual = check.validateLastNameNotBlank("k");
        assertTrue(actual);
    }

    @Test
    void validateLastNameNotBlank_If_Only_One_Number() {
        ValidationFunctions check = new ValidationFunctions();

        boolean actual = check.validateLastNameNotBlank("1");
        assertTrue(actual);
    }

    @Test
    void validateLastNameNotBlank_If_MultipleLetters() {
        ValidationFunctions check = new ValidationFunctions();

        boolean actual = check.validateLastNameNotBlank("Mullens");
        assertTrue(actual);
    }

    ////VALIDATE FIRST NAME LENGTH/////////////////////////////////////////////////////
    @Test
    void validateFirstNameLength_If_Length_Is_One() {
        ValidationFunctions check = new ValidationFunctions();

        boolean actual = check.validateFirstNameLength("K");
        assertFalse(actual);
    }

    @Test
    void validateFirstNameLength_If_Length_Is_Two() {
        ValidationFunctions check = new ValidationFunctions();

        boolean actual = check.validateFirstNameLength("KM");
        assertTrue(actual);
    }

    @Test
    void validateFirstNameLength_If_Length_Is_Eleven() {
        ValidationFunctions check = new ValidationFunctions();

        boolean actual = check.validateFirstNameLength("KeriMullens");
        assertTrue(actual);
    }

    @Test
    void validateFirstNameLength_If_Space_Is_Second_Character() {
        ValidationFunctions check = new ValidationFunctions();

        boolean actual = check.validateFirstNameLength("K Mullens");
        assertTrue(actual);
    }

    ////VALIDATE LAST NAME LENGTH//////////////////////////////////////////////////////
    @Test
    void validateLastNameLength_If_Length_Is_One() {
        ValidationFunctions check = new ValidationFunctions();

        boolean actual = check.validateLastNameLength("K");
        assertFalse(actual);
    }

    @Test
    void validateLastNameLength_If_Length_Is_Two() {
        ValidationFunctions check = new ValidationFunctions();

        boolean actual = check.validateLastNameLength("KM");
        assertTrue(actual);
    }

    @Test
    void validateLastNameLength_If_Length_Is_Eleven() {
        ValidationFunctions check = new ValidationFunctions();

        boolean actual = check.validateLastNameLength("KeriMullens");
        assertTrue(actual);
    }

    @Test
    void validateLastNameLength_If_Space_Is_Second_Character() {
        ValidationFunctions check = new ValidationFunctions();

        boolean actual = check.validateLastNameLength("K Mullens");
        assertTrue(actual);
    }

    ////VALIDATE EMPLOYEE ID FORMAT////////////////////////////////////////////////////
    @Test
    void validateEmployeeIDFormat_Number_In_First_Space() {
        ValidationFunctions check = new ValidationFunctions();

        boolean actual = check.validateEmployeeIDFormat("8k-3212");
        assertFalse(actual);
    }

    @Test
    void validateEmployeeIDFormat_Number_In_Third_Space() {
        ValidationFunctions check = new ValidationFunctions();

        boolean actual = check.validateEmployeeIDFormat("ke34444");
        assertFalse(actual);
    }

    @Test
    void validateEmployeeIDFormat_Letter_In_Fourth_Space() {
        ValidationFunctions check = new ValidationFunctions();

        boolean actual = check.validateEmployeeIDFormat("ke-m123");
        assertFalse(actual);
    }

    @Test
    void validateEmployeeIDFormat_More_Than_Four_Numbers_At_End() {
        ValidationFunctions check = new ValidationFunctions();

        boolean actual = check.validateEmployeeIDFormat("Ke-12345");
        assertFalse(actual);
    }

    @Test
    void validateEmployeeIDFormat_Correct_Format() {
        ValidationFunctions check = new ValidationFunctions();

        boolean actual = check.validateEmployeeIDFormat("Ke-1234");
        assertTrue(actual);
    }

    ////VALIDATE ZIP CODE//////////////////////////////////////////////////////////////
    @Test
    void validateZipCode_Only_Letters() {
        ValidationFunctions check = new ValidationFunctions();

        boolean actual = check.validateZipCode("KeriRocks");
        assertFalse(actual);
    }

    @Test
    void validateZipCode_Letters_And_Numbers() {
        ValidationFunctions check = new ValidationFunctions();

        boolean actual = check.validateZipCode("Ke1234");
        assertFalse(actual);
    }

    @Test
    void validateZipCode_Only_Special_Characters() {
        ValidationFunctions check = new ValidationFunctions();

        boolean actual = check.validateZipCode("@#$%");
        assertFalse(actual);
    }

    @Test
    void validateZipCode_Numbers_With_Spaces() {
        ValidationFunctions check = new ValidationFunctions();

        boolean actual = check.validateZipCode("12 34 5");
        assertFalse(actual);
    }

    @Test
    void validateZipCode_Only_Numbers() {
        ValidationFunctions check = new ValidationFunctions();

        boolean actual = check.validateZipCode("12345");
        assertTrue(actual);
    }
}