package oop.example.Ex38;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class SortNumbersTest {

    @Test
    void filterEvenNumbers_Test_Normal_Inputs() {
        SortNumbers sort = new SortNumbers();

        String expected = "682278";
        String listOfNumbers = "1 3 5 6 8 22 45 78";
        ArrayList<String> actual = sort.filterEvenNumbers(listOfNumbers);

        String newActual = "";
        for(int i = 0; i < actual.size(); i++)
        {
            newActual = newActual + actual.get(i);
        }

        assertEquals(expected, newActual);
    }

    @Test
    void filterEvenNumbers_Test_Normal_Inputs_Again() {
        SortNumbers sort = new SortNumbers();

        String expected = "234456982234";
        String listOfNumbers = "234 456 33 98 22 34 55";
        ArrayList<String> actual = sort.filterEvenNumbers(listOfNumbers);

        String newActual = "";
        for(int i = 0; i < actual.size(); i++)
        {
            newActual = newActual + actual.get(i);
        }

        assertEquals(expected, newActual);
    }

    @Test
    void filterEvenNumbers_Test_Negative_Even_Numbers_and_Zero() {
        SortNumbers sort = new SortNumbers();

        String expected = "-234456-9822340";
        String listOfNumbers = "-234 456 -33 -98 22 34 55 0";
        ArrayList<String> actual = sort.filterEvenNumbers(listOfNumbers);

        String newActual = "";
        for(int i = 0; i < actual.size(); i++)
        {
            newActual = newActual + actual.get(i);
        }

        assertEquals(expected, newActual);
    }
}