package oop.example.Ex35;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class SelectAWinnerTest {

    @Test
    void randomWinner_Five_Contestants() {
        SelectAWinner select = new SelectAWinner();
        ArrayList<String> names = new ArrayList<String>() {
            {
                add("Keri");
                add("Lora");
                add("Marissa");
                add("Travis");
                add("Katrina");
            }
        };

        int randNum = select.randomWinner(names);

        assertTrue(randNum >= 0 && randNum <= names.size());
    }

    @Test
    void randomWinner_One_Contestant() {
        SelectAWinner select = new SelectAWinner();
        ArrayList<String> names = new ArrayList<String>() {
            {
                add("Keri");
            }
        };

        int randNum = select.randomWinner(names);

        assertTrue(randNum >= 0 && randNum <= names.size());
    }
}

//Perhaps I should make code so it doesn't crash if no names are entered, but it wasn't required, and I don't have time.
