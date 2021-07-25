/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Keri Mullens
 */
package oop.example.Ex36;

import java.util.Scanner;

public class Ex36 {
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

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String number = input.nextLine();       //FIXME - String or int???

        System.out.print("Numbers: "); //print the list after quotation

        double average = -1500;
        double min = -1500;
        double max = -1500;
        double standardDev = -1500;

        System.out.print("The average is " + average + ".\n" +
                "The minimum is " + min + ".\n" +
                "The maximum is " + max + ".\n" +
                "The standard deviation is " + standardDev + ".");

    }
}
