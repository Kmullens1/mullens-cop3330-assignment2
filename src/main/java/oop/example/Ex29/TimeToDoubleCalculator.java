/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Keri Mullens
 */
package oop.example.Ex29;

public class TimeToDoubleCalculator {
    
    boolean containsLetters(String data)
    {
        boolean indicator = false;
        int counter = 0;
        for(char c : data.toCharArray())
        {
            if (Character.isLetter(c))
            {
                counter = counter + 1;
            }
        }

        if(counter >= 1)
            indicator = true;

        return indicator;
    }

    double doubleEquation(String data)
    {
        double rateOfReturn = Double.parseDouble(data);

        double yearsToDouble = 72 / rateOfReturn;
        return yearsToDouble;
    }
}





