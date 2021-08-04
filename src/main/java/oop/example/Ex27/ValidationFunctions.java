/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Keri Mullens
 */
package oop.example.Ex27;

public class ValidationFunctions {
    //The first name must be filled in.
    boolean validateFirstNameNotBlank(String firstName)
    {
        boolean result = true;
        if(firstName.equals(""))
            result = false;

        return result;
    }

    //The last name must be filled in.
    boolean validateLastNameNotBlank(String lastName)
    {
        boolean result = true;
        if(lastName.equals(""))
            result = false;

        return result;
    }

    //The first and last names must be at least two characters long.
    boolean validateFirstNameLength(String firstName)
    {
        boolean result = true;
        if(firstName.length() == 1)
            result = false;

        return result;
    }

    boolean validateLastNameLength(String lastName)
    {
        boolean result = true;
        if(lastName.length() == 1)
            result = false;

        return result;
    }


    //FIXME - This function doesn't work properly - Find out why
    //An employee ID is in the format AA-1234. So, two letters, a hyphen, and four numbers.
    boolean validateEmployeeIDFormat(String employeeID)
    {
        boolean result = true;

        //check for initial letters
        char arrayVersion[] = employeeID.toCharArray();
        for(int c = 0; c < 2; c++)
        {
            if (!(Character.isLetter(c)))
                result = false;
        }

        //Check for hyphen position
        if(!(arrayVersion[2] == '-'))
            result = false;

        //Check for numbers at end
        for(int c = 3; c < employeeID.length(); c++)
        {
            if (!Character.isDigit(c))
                result = false;
        }

        //check length
        if(employeeID.length() > 7)
            result = false;

        return result;
    }

    //The ZIP code must be a number.
    boolean validateZipCode(String zipCode)
    {
        boolean result = true;
        for(char c : zipCode.toCharArray())
        {
            if (!Character.isDigit(c))
                result = false;
        }

        return result;
    }

}
