/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Keri Mullens
 */
package oop.example;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Ex24 { //////////////This is NOT how you create a class in Java////////////
    public Boolean isAnagram(String first, String second)
    {
        int length1 = first.length();
        int length2 = second.length();

        if (length2 != length1)
            return false;

        else
        {
            char tempChar1[] = first.toCharArray();
            char tempChar2[] = second.toCharArray();
            Arrays.sort(tempChar1);
            Arrays.sort(tempChar2);

            for (int i = 0; i < length1; i++)
            {
                if(tempChar1[i] != tempChar2[i])
                {
                    return false;
                }//Add in a way to convert uppercase letters to lowercase letters for more accuracy
            }
        }
        return true;
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
        Ex24 name = new Ex24();
        System.out.print("Enter two strings and I'll tell you if they are anagrams:\nEnter the first string: ");
        Scanner input = new Scanner(System.in);
        String first = input.nextLine();

        System.out.print("Enter the second string: ");
        String second = input.nextLine();

        if (name.isAnagram(first, second))//A function that compares the strings
            System.out.println(first + " and " + second + " are anagrams.");
        else
            System.out.println(first + " and " + second + " are not anagrams.");

    } //Don't forget to add in Junit 5 and test cases
}
