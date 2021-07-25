/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Keri Mullens
 */
package oop.example.Ex26;

import java.util.Scanner;
//FIXME - INCOMPLETE
//FIXME - Fix classes format
//FIXME - Test Cases

public class Ex26 {

    static double calculateMonthsUntilPaidOff(double balance, double APR, double mPay)
    {
        APR = APR * 0.01;
        double dailyRate = APR/365;
        double Months = -(1/30) * Math.log(1 + balance/mPay * (1 - Math.pow(1 + dailyRate, 30))) / Math.log(1 + dailyRate);

        return Months;
    }

    public static void main(String[] args) {
        //Months to Pay Off a Credit Card
        /*It can take a lot longer to pay off your credit card balance than you might
        realize. And the formula for figuring that out isn’t pretty. Hiding the formula’s
        complexity with a function can help you keep your code organized.
        Write a program that will help you determine how many months it will take to pay
        off a credit card balance. The program should ask the user to enter the balance of
        a credit card and the APR of the card. The program should then return the number of
        months needed.
        The formula for this is
            n = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)
        where
            n is the number of months.
            i is the daily rate (APR divided by 365).
            b is the balance.
            p is the monthly payment.
        Example Output
            What is your balance? 5000
            What is the APR on the card (as a percent)? 12
            What is the monthly payment you can make? 100
            It will take you 70 months to pay off this card.
        Constraints
            Prompt for the card’s APR. Do the division internally.
            Prompt for the APR as a percentage, not a decimal.
            Use a function called calculateMonthsUntilPaidOff, which accepts the balance, the APR,
            and the monthly payment as its arguments and returns the number of months. Don’t access
            any of these values outside the function.
            Round fractions of a cent up to the next cent.*/

        Scanner input = new Scanner(System.in);

        System.out.print("What is your balance? ");
        double balance = input.nextInt();

        System.out.print("What is the APR on the card (as a percent)? ");
        double APR = input.nextInt();

        System.out.print("What is the monthly payment you can make? ");
        double mPay = input.nextInt();

        double numOfMonths = calculateMonthsUntilPaidOff(balance, APR, mPay);


        System.out.print("It will take you " + numOfMonths + " months to pay off this card.");
    }
}

