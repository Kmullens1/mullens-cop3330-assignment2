/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Keri Mullens
 */
package oop.example.Ex33;

import java.util.Random;

public class shakeTheEightBall {

    public String generateRandomNum()
    {
        Random rand = new Random();
        int randNum = rand.nextInt(4);

        String randomResponse = possibleResponses(randNum);

        return randomResponse;
    }

    public String possibleResponses(int randNum){
        String[] responses = {"Yes.", "No.", "Maybe.", "Ask again later."};
        String randomResponse = responses[randNum];

        return randomResponse;
    }
}
