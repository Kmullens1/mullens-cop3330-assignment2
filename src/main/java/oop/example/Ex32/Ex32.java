/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Keri Mullens
 */
package oop.example.Ex32;

import java.util.Scanner;

public class Ex32 {
    private static final Scanner input = new Scanner(System.in);

    public static void readUserInput() {
        String decision = "y";
        while (decision.equals("y")) {
            System.out.print("Let's play Guess the Number.\nPick a difficulty level (1, 2, or 3): ");
            int difficulty = input.nextInt();
            while(difficulty != 1 && difficulty != 2 && difficulty != 3)
            {
                System.out.print("That is an invalid difficulty level. Choose again: ");
                difficulty = input.nextInt();
            }

            RandomNumberGenerator generate = new RandomNumberGenerator();
            int randomNumber = generate.generateNumber(difficulty);

            System.out.print("I have my number. What's your guess? ");
            int guess = input.nextInt();

            int count = 1;
            while (randomNumber != guess) {
                String feedback = generate.analyzeGuess(randomNumber, guess);
                System.out.print(feedback);
                guess = input.nextInt();
                count++;
            }

            System.out.print("You got it in " + count + " guesses!\nPlay again? ");
            decision = input.next();
        }
        System.out.print("Goodbye!");

    }

    public static void main(String[] args) {
        //Guess the Number Game
        /*Write a Guess the Number game that has three levels of difficulty. The first
        level of difficulty would be a number between 1 and 10. The second difficulty set
        would be between 1 and 100. The third difficulty set would be between 1 and 1000.
        Prompt for the difficulty level, and then start the game. The computer picks a
        random number in that range and prompts the player to guess that number. Each time
        the player guesses, the computer should give the player a hint as to whether the
        number is too high or too low. The computer should also keep track of the number of
        guesses. Once the player guesses the correct number, the computer should present the
        number of guesses and ask if the player would like to play again.
        Example Output
            Let's play Guess the Number.
            Pick a difficulty level (1, 2, or 3): 1
            I have my number. What's your guess? 1
            Too low.
            Guess again: 5
            Too high. Guess again: 2
            You got it in 3 guesses!
            Play again? n
            Goodbye!
        Constraints
            Don’t allow any non-numeric data entry.
            During the game, count non-numeric entries as wrong guesses.*/
        //FIXME - Somehow allow non-numeric guesses that count against your score somehow....
        readUserInput();
    }
}