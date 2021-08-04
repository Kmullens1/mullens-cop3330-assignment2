/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Keri Mullens
 */
package oop.example.Ex35;

import java.util.List;
import java.util.Random;

public class SelectAWinner {


    public int randomWinner(List<String> names) {
        Random rand = new Random();
        int randNum = rand.nextInt(names.size());

        return randNum;
    }


}
