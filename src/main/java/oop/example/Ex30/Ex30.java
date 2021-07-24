/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Keri Mullens
 */
package oop.example.Ex30;

public class Ex30 {
    public static void main(String[] args) {
        //Multiplication Table
        /*Create a program that generates multiplication tables for the numbers 0 through 12.
        Example Output
            0 X 0 = 0
            0 X 1 = 0
            ...
            12 x 11 = 132
            12 x 12 = 144
        Constraint
            Use a nested loop to complete this program.*/
        for(int i = 0; i < 13; i++)
        {
            for(int j = 0; j<13; j++)
            {
                int product = i * j;
                System.out.println(i + "x" + j + "=" + product);
            }
        }

    }
}
