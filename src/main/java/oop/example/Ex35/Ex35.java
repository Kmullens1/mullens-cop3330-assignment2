/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Keri Mullens
 */
package oop.example.Ex35;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex35 {
    private static final Scanner input = new Scanner(System.in);

    public static void readUserInput() {

        List<String> names = new ArrayList();

        System.out.print("Enter a name: ");
        String newName = input.nextLine();

        while (!(newName.equals(""))) {
            names.add(newName);
            System.out.print("Enter a name: ");
            newName = input.nextLine();
        }

        SelectAWinner select = new SelectAWinner();
        int randNum = select.randomWinner(names);

        String winner = (String) names.get(randNum);

        System.out.print("The winner is... " + winner + ".");
    }

    public static void main(String[] args) {
        //Picking a Winner
        /*Arrays don’t have to be hard-coded. You can take user input and store it
        in an array and then work with it.
        Create a program that picks a winner for a contest or prize drawing. Prompt
        for names of contestants until the user leaves the entry blank. Then randomly
        select a winner.
        Example Output
            Enter a name: Homer
            Enter a name: Bart
            Enter a name: Maggie
            Enter a name: Lisa
            Enter a name: Moe
            Enter a name:
            The winner is... Maggie.
        Constraints
            Use a loop to capture user input into an array.
            Use a random number generator to pluck a value from the array.
            Don’t include a blank entry in the array.
            Some languages require that you define the length of the array ahead of time.
            You may need to find another data structure, like an ArrayList.*/

        readUserInput();

    }
}
