/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Keri Mullens
 */
package oop.example.Ex24;

import java.util.Scanner;

public class Ex24 {
    private static final Scanner input = new Scanner(System.in);
    private static String first;
    private static String second;

    public static void readUserInput()
    {
        System.out.print("Enter two strings and I'll tell you if they are anagrams:\nEnter the first string: ");
        first = input.nextLine();

        System.out.print("Enter the second string: ");
        second = input.nextLine();

        AnagramChecker name = new AnagramChecker();

        if (name.isAnagram(first, second)) //A function that compares the strings
            System.out.println(first + " and " + second + " are anagrams.");
        else
            System.out.println(first + " and " + second + " are not anagrams.");

    }

    public static void main(String[] args) {
        //Anagram Checker
        /*Using functions to abstract the logic away from the rest of your code makes it easier to read
        and easier to maintain.
        Create a program that compares two strings and determines if the two strings are anagrams. The
        program should prompt for both input strings and display the output as shown in the example that
        follows.
        Example Output
            Enter two strings and I'll tell you if they are anagrams:
            Enter the first string: note
            Enter the second string: tone
            "note" and "tone" are anagrams.
        Constraints
            Implement the program using a function called isAnagram, which takes in two words as its
            arguments and returns true or false. Invoke this function from your main program.
            Check that both words are the same length.*/

        readUserInput();

    }
    //FIXME Don't forget to add in test cases
    //FIXME Does case matter?
}
