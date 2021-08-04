/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Keri Mullens
 */
package oop.example.Ex38;

import java.util.ArrayList;

public class SortNumbers {
    public ArrayList<String> filterEvenNumbers(String listOfNumbers)
    {
        String[] arrayOfNumbers = listOfNumbers.split(" ");
        ArrayList<String> listOfEvenNumbers = new ArrayList<>();

        for(int i = 0; i < arrayOfNumbers.length; i++)
        {
            int integerValue = Integer.parseInt(arrayOfNumbers[i]);
            int modulatedValue = integerValue % 2;
            if(modulatedValue == 0)
            {
                listOfEvenNumbers.add(arrayOfNumbers[i]);
            }
        }

    return listOfEvenNumbers;
    }
}
