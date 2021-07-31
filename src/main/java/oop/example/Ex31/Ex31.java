/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Keri Mullens
 */
package oop.example.Ex31;

import java.util.Scanner;

public class Ex31 {
    private static final Scanner input = new Scanner(System.in);
    private static String table;

    public static void readUserInput()
    {
        int age = -1500;    //Both values are initialized to invalid integers as a failsafe
        double rhr = -1500;
        boolean valid = false;

        while(!valid)
        {
            System.out.print("What is your age? ");
            age = input.nextInt();

            System.out.print("What is your resting heart rate? ");
            rhr = input.nextDouble();

            if (age < 0 || rhr < 0)
                System.out.print("Sorry. Those values are not valid inputs. Try again:\n");
            else
                valid = true;
        }

        KarvonenFormula formula = new KarvonenFormula();
        table = formula.calculateRate(age, rhr);

        System.out.print(table);
    }

    public static void main(String[] args) {

        //Karvonen Heart Rate
        /*When you loop, you can control how much you increment the counter; you don’t
        always have to increment by one.
        When getting into a fitness program, you may want to figure out your target heart
        rate so you don’t overexert yourself. The Karvonen heart rate formula is one method
        you can use to determine your rate. Create a program that prompts for your age and your
        resting heart rate. Use the Karvonen formula to determine the target heart rate based
        on a range of intensities from 55% to 95%. Generate a table with the results as shown
        in the example output. The formula is
                TargetHeartRate = (((220 − age) − restingHR) × intensity) + restingHR
        Example Output
            Resting Pulse: 65 Age: 22

            Intensity    | Rate
            -------------|--------
                     55% | 138 bpm
                     60% | 145 bpm
                     65% | 151 bpm
                     :      :         (extra lines omitted)
                     85% | 178 bpm
                     90% | 185 bpm
                     95% | 191 bpm
        Constraints
            Don’t hard-code the percentages. Use a loop to increment the percentages from 55 to 95.
            Ensure that the heart rate and age are entered as numbers. Don’t allow the user
            to continue without entering valid inputs.
            Display the results in a tabular format.*/

        readUserInput();

    }
}
