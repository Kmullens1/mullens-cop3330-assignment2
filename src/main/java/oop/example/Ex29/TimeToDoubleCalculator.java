package oop.example.Ex29;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TimeToDoubleCalculator {

    void timeToDouble()
    {
        boolean valid = false;

        String data = "";
        while(!valid)
        {
            System.out.print("What is the rate of return? ");
            data = inputReader();

            if (data.equals("0") || containsLetters(data))
            {
                System.out.print("Sorry. That's not a valid input.\n");
            }
            else
            {
                valid = true;
            }
        }

        double rateOfReturn = Double.parseDouble(data);


        double yearsToDouble = doubleEquation(rateOfReturn);

        DecimalFormat df = new DecimalFormat("###.###");
        System.out.print("It will take " + df.format(yearsToDouble) + " years to double your initial investment.");

    }


    private String inputReader()
    {
        Scanner input = new Scanner(System.in);

        String data = input.nextLine();

        return data;
    }

    private boolean containsLetters(String data)
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

    private double doubleEquation(double rateOfReturn)
    {
        double yearsToDouble = 72 / rateOfReturn;
        return yearsToDouble;
    }
}





