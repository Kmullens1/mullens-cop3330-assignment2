/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Keri Mullens
 */
package oop.example.Ex36;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex36 {
    private static final Scanner input = new Scanner(System.in);

    public static ArrayList<String> readUserInput()
    {
        String number = "";
        ArrayList<String> stats = new ArrayList<>();
        while(!(number.equals("done")))
        {
            System.out.print("Enter a number: ");
            number = input.nextLine();
            if(!(number.equals("done")))
                stats.add(number);
        }

        return stats;
    }

    public static void main(String[] args) {
        //Computing Statistics
        /*Statistics is important in our field. When measuring response times or
        rendering times, it’s helpful to collect data so you can easily spot abnormalities.
        For example, the standard deviation helps you determine which values are outliers
        and which values are within normal ranges.
        Write a program that prompts for response times from a website in milliseconds.
        It should keep asking for values until the user enters “done.”
        The program should print the average time (mean), the minimum time, the maximum time,
        and the standard deviation.
        Example Output
            Enter a number: 100
            Enter a number: 200
            Enter a number: 1000
            Enter a number: 300
            Enter a number: done
            Numbers: 100, 200, 1000, 300
            The average is 400.
            The minimum is 100.
            The maximum is 1000.
            The standard deviation is 400.25.
        Constraints
            Use loops and arrays to perform the input and mathematical operations.
            Be sure to exclude the "done" entry from the array of inputs.
            Be sure to properly convert numeric values to strings.
            Keep the input separate from the processing and the output.*/

        ArrayList<String> stats;
        stats = readUserInput();
        double[] newStats = new double[stats.size()];

        ArrayList<Double> convertStats = new ArrayList<>();
        for (int i = 0; i < stats.size(); i++) {
            convertStats.add(Double.valueOf(stats.get(i)));
            newStats[i] = convertStats.get(i);
        }


        StatsCalculations calculate = new StatsCalculations();
        double average = calculate.calculateAverage(newStats);
        double min = calculate.calculateMinimum(newStats);
        double max = calculate.calculateMaximum(newStats);
        double standardDev = calculate.calculateStandardDev(newStats, average);

        DecimalFormat df = new DecimalFormat("###.###");
        System.out.print("The average is " + df.format(average) + ".\n" +
                "The minimum is " + df.format(min) + ".\n" +
                "The maximum is " + df.format(max) + ".\n" +
                "The standard deviation is " + df.format(standardDev) + ".");
    }

}
