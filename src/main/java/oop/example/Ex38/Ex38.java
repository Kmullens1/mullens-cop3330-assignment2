/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Keri Mullens
 */
package oop.example.Ex38;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex38 {
    private static final Scanner input = new Scanner(System.in);

    public static void readUserInput()
    {
        System.out.print("Enter a list of numbers, separated by spaces: ");
        String listOfNumbers = input.nextLine();

        SortNumbers sort = new SortNumbers();
        ArrayList<String> listOfEvenNumbers = sort.filterEvenNumbers(listOfNumbers);

        if(listOfEvenNumbers.size() == 0)
        {
            System.out.print("There are no even numbers in that list.");
        }
        else
        {
            System.out.print("The even numbers are");
            for (int i = 0; i < listOfEvenNumbers.size(); i++) {
                System.out.print(" " + listOfEvenNumbers.get(i));
            }
            System.out.print(".");
        }
    }

    public static void main(String[] args) {
        //Filtering Values
        /*Sometimes input you collect will need to be filtered down. Data structures
        and loops can make this process easier.
        Create a program that prompts for a list of numbers, separated by spaces.
        Have the program printout a new list containing only the even numbers.
        Example Output
            Enter a list of numbers, separated by spaces: 1 2 3 4 5 6 7 8
            The even numbers are 2 4 6 8.
        Constraints
            Convert the input to an array. Many languages can easily convert strings
            to arrays with a built-in function that splits apart a string based on a
            specified delimiter.
            Write your own algorithm—don’t rely on the language’s built-in filter or
            similar enumeration feature.
            Use a function called filterEvenNumbers to encapsulate the logic for this.
            The function takes in the old array and returns the new array.
         */

        readUserInput();

    }
}
