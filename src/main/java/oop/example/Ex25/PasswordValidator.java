package oop.example.Ex25;

import java.util.Scanner;

public class PasswordValidator {

    String inputReader()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the password? ");
        String password = input.nextLine();

        return password;
    }

    boolean checkStrength(String password)
    {
        String outputStatement = "";

        if(password.length() < 8)
        {

            for(char c : password.toCharArray())
            {
                if (!Character.isDigit(c))
                {
                    return false;
                }
                else
                    return true;
            }

        }

        else
        {

        }

        // System.out.print("The password '" + password + "' is a very weak password.");
        // System.out.print("The password '" + password + "' is a weak password.");
        // System.out.print("The password '" + password + "' is a strong password.");
        // System.out.print("The password '" + password + "' is a very strong password.");

        return outputStatement;
    }

}
