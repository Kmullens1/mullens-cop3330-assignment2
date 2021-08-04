/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Keri Mullens
 */
package oop.example.Ex30;

public class GenerateMultiplicationTables {

    String generateTables()
    {
        String output = "";

        for (int i = 0; i < 13; i++) {
            for (int j = 0; j < 13; j++) {
                int product = i * j;
                output = output + (i + " X " + j + " = " + product + "\n");
            }
        }
        return output;
    }
}
