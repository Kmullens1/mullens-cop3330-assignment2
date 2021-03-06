/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Keri Mullens
 */
package oop.example.Ex29;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex29 {
    private static final Scanner input = new Scanner(System.in);
    private static double yearsToDouble;

    public static void inputReader()
    {
        boolean valid = false;

        String data = "";
        while(!valid)
        {
            System.out.print("What is the rate of return? ");
            data = input.nextLine();

            TimeToDoubleCalculator verify = new TimeToDoubleCalculator();
            if (data.equals("0") || verify.containsLetters(data))
            {
                System.out.print("Sorry. That's not a valid input.\n");
            }
            else
                valid = true;
        }

        TimeToDoubleCalculator calculate = new TimeToDoubleCalculator();
        yearsToDouble = calculate.doubleEquation(data);

        DecimalFormat df = new DecimalFormat("###.###");
        System.out.print("It will take " + df.format(yearsToDouble) + " years to double your initial investment.");
    }


    public static void main(String[] args) {
        //Handling Bad Input
        /*The rule of 72 is a quick method for estimating how long it will take to
        double your investment, by taking the number 72 and dividing it by the expected
        rate of return. It’s a good tool that helps you figure out if the stock, bond, or
        savings account is right for you. It’s also a good program to write to test for
        and prevent bad input because computers can’t divide by zero. And instead of exiting
        the program when the user enters invalid input, you can just keep prompting for inputs
        until you get one that’s valid.
        Write a quick calculator that prompts for the rate of return on an investment and calculates
        how many years it will take to double your investment.
            The formula is
                years = 72 / r
            where r is the stated rate of return.
        Example Output
            What is the rate of return? 0
            Sorry. That's not a valid input.
            What is the rate of return? ABC
            Sorry. That's not a valid input.
            What is the rate of return? 4
            It will take 18 years to double your initial investment.
        Constraints
            Don’t allow the user to enter 0.
            Don’t allow non-numeric values.
            Use a loop to trap bad input, so you can ensure that the user enters valid values.*/

        inputReader();

    }
}

