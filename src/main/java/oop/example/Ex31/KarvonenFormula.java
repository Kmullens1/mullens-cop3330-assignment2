package oop.example.Ex31;

import java.text.DecimalFormat;

public class KarvonenFormula {

    public String calculateRate(int age, double rhr) {

        DecimalFormat df = new DecimalFormat("###.###");
        String table = "Resting Pulse: " + df.format(rhr) + " Age: " + age +
                "\n\nIntensity    | Rate\n-------------|-------- ";

        for(int intensity = 55; intensity <= 95; intensity += 5)
        {
            //(((220 − age) − restingHR) × intensity) + restingHR
            double targetRate = (((220 - age) - rhr) * (intensity * 0.01)) + rhr;

            String roundedTargetRate = String.format("%.0f", targetRate);
            table = table + "\n         " + intensity + "% | " + roundedTargetRate + " bpm";
        }

        return table;
    }

}
