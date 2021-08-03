package oop.example.Ex38;

import java.util.ArrayList;

public class SortNumbers {
    public String[] filterEvenNumbers(String listOfNumbers)
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
        String[] stringOfEvenNumbers = listOfEvenNumbers.toArray(new String[0]);
    return stringOfEvenNumbers;
    }
}
