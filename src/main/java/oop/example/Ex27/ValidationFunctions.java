package oop.example.Ex27;

public class ValidationFunctions {
    //The first name must be filled in.
    boolean validateFirstNameNotBlank(String firstName)
    {
        return true;
    }

    //The last name must be filled in.
    boolean validateLastNameNotBlank(String lastName)
    {
        return true;
    }

    //The first and last names must be at least two characters long.
    boolean validateFirstNameLength(String firstName)
    {
        return true;
    }

    boolean validateLastNameLength(String lastName)
    {
        return true;
    }

    //An employee ID is in the format AA-1234. So, two letters, a hyphen, and four numbers.
    boolean validateEmployeeIDFormat(String employeeID)
    {
        return true;
    }

    //The ZIP code must be a number.
    boolean validateZipCode(String zipCode)
    {
        return true;
    }

}
