/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
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
       GenerateMultiplicationTables generate = new GenerateMultiplicationTables();
       String output = generate.generateTables();

       System.out.print(output);

    }
}
