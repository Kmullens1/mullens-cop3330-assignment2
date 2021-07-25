/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Keri Mullens
 */
package oop.example.Ex28;

import java.util.Scanner;

//FIXME - Check requirements
//FIXME - Fix classes
//FIXME - Add in Test Cases

public class Ex28 {
    static int calculateSum()
    {
        Scanner input = new Scanner(System.in);

        int sum = 0;
        for(int i = 0; i < 5; i++)
        {
            System.out.print("Enter a number: ");
            sum = sum + input.nextInt();
        }
        return sum;
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

        int sum = calculateSum();

        System.out.println("The total is " + sum + ".");
    }
}
