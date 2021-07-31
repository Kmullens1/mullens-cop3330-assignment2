package oop.example.Ex32;

import java.util.Random;

public class RandomNumberGenerator {

    int generateNumber(int difficulty)
    {
        int randomNumber = -1; //Initialized to negative number just in case

        Random rand = new Random();
        if(difficulty == 1)
            randomNumber = rand.nextInt(11);
        else if(difficulty == 2)
            randomNumber = rand.nextInt(101);
        else if(difficulty == 3)
            randomNumber = rand.nextInt(1001);

        return randomNumber + 1;
    }

    String analyzeGuess(int randomNumber, int guess)
    {
        String feedback = "";

        if(guess < randomNumber)
            System.out.print("Too low. Guess again: ");
        if(guess > randomNumber)
            System.out.print("Too high. Guess again: ");

        return feedback;
    }

}
