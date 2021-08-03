package oop.example.Ex38;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SortNumbersTest {

    @Test
    void filterEvenNumbers() {
        SortNumbersTest sort = new SortNumbersTest();

        String[] expected = {"6", "8", "22", "78"};
        String listOfNumbers = "1 3 5 6 8 22 45 78";
        String[] actual = sort.filterEvenNumbers(listOfNumbers);

        assertEquals(expected, actual);

    }
}