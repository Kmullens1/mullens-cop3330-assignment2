package oop.example.Ex35;

import java.util.List;
import java.util.Random;

public class SelectAWinner {


    public String randomWinner(List names) {
        Random rand = new Random();
        int randNum = rand.nextInt(names.size()); //FIXME - double check that I don't need to +1

        String winner = (String) names.get(randNum);
        return winner;
    }


}
