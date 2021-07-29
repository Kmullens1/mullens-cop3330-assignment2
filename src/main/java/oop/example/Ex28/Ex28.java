/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Keri Mullens
 */
package oop.example.Ex28;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex28 {
    private static final Scanner input = new Scanner(System.in);
    private static double[] first = new double[]{0, 0, 0, 0, 0};

    public static String readUserInput()
    {
        for(int i = 0; i < 5; i++)
        {
            System.out.print("Enter a number: ");
            first[i] = input.nextDouble();
        }
        CalculateSummation calculate = new CalculateSummation();
        double sum = calculate.calculateSum(first);

        DecimalFormat df = new DecimalFormat("###.###");
        String output = "The total is " + df.format(sum) + ".";

        return output;
    }
    public static void main(String[] args) {
        //Adding Numbers
        /*In previous programs, you asked the user for repeated input by writing the
        input statements multiple times. But it’s more efficient to use loops to deal
        with repeated input.
        Write a program that prompts the user for five numbers and computes the total
        of the numbers.
        Example Output
            Enter a number: 1
            Enter a number: 2
            Enter a number: 3
            Enter a number: 4
            Enter a number: 5
            The total is 15.
        Constraints
            The prompting must use repetition, such as a counted loop, not three separate prompts.
            Create a flowchart before writing the program.*/

        String output = readUserInput();

        System.out.println(output);
    }
}
