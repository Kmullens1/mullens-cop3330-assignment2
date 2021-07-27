package oop.example.Ex26;

import java.text.DecimalFormat;

public class calculateMonths {

    static double calculateMonthsUntilPaidOff(double balance, double APR, double mPay)
    {
        APR = APR * 0.01;
        double dailyRate = APR/365;  //divided by 365 not multiplied??
        //n = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)
        double numOfMonths = -(0.03333333333333) * Math.log10(1 + balance/mPay * (1 - Math.pow((1 + dailyRate), 30))) / Math.log10(1 + dailyRate);

        /*double one = -(1/30);
        double two = 1 - Math.pow((1 + dailyRate), 30);   //looks correct
        double three = Math.log10(10);    //(1 + ((balance/mPay) * two)); commented part looks correct
        double four = Math.log(1 + dailyRate);

        System.out.print("\none: " + one + "\ntwo: " + two + "\nthree: " + three + "\nfour: " + four);*/

        //double numOfMonths = one * three / four;

        numOfMonths = Math.ceil(numOfMonths);

        return numOfMonths;
    }

}
