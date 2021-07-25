/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Keri Mullens
 */
package oop.example.Ex37;

import java.util.Scanner;

public class Ex37 {
    public static void main(String[] args) {
        //Password Generator
        /*Coming up with a password that meets specific requirements is something
        your computer can do.And it will give you practice using random number
        generators in conjunction with a list of known values.
        Create a program that generates a secure password. Prompt the user for the
        minimum length, the number of special characters, and the number of numbers.
        Then generate a password for the user using those inputs.
        Example Output
            What's the minimum length? 8
            How many special characters? 2
            How many numbers? 2
            Your password is aurn2$1s#
        Constraints
            Use lists to store the characters you’ll use to generate the passwords.
            Add some randomness to the password generation.*/

        Scanner input = new Scanner(System.in);
        System.out.print("What's the minimum length? ");
        int minLength = input.nextInt();

        System.out.print("How many special characters? ");
        String numOfSpecialCharacters = input.nextLine();

        System.out.print("How many numbers? ");
        int numOfNumbers = input.nextInt();

        String password = "";
        System.out.print("Your password is " + password);

    }
}
