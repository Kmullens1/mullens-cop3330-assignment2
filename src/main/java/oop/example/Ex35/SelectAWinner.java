package oop.example.Ex35;

import java.util.List;
import java.util.Random;

public class SelectAWinner {


    public String randomWinner(List names) {
        Random rand = new Random();
        int randNum = rand.nextInt(names.size());

        String winner = (String) names.get(randNum);
        return winner;
    }


}
