/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Keri Mullens
 */
package oop.example.Ex26;

public class calculateMonths {

    static double calculateMonthsUntilPaidOff(double balance, double APR, double mPay)
    {

        APR = APR * 0.01;
        double dailyRate = APR/365;
        double fraction = ((double) 1) / 30;


        //n = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)
        double numOfMonths = -(fraction) * Math.log10(1 + balance/mPay * (1 - Math.pow((1 + dailyRate), 30))) / Math.log10(1 + dailyRate);


        numOfMonths = Math.ceil(numOfMonths);

        return numOfMonths;
    }

    static boolean validInputChecker(double balance, double APR, double mPay)
    {
        boolean valid = true;
        if(balance <= 0)
            valid = false;


        if((APR <= 0) || (APR > 100))
            valid = false;


        if(mPay <= 0)
            valid = false;

        return valid;
    }

}
