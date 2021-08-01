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
