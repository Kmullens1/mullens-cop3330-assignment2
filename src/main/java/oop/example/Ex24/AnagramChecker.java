package oop.example.Ex24;

import java.util.Arrays;

public class AnagramChecker {
    public Boolean isAnagram(String first, String second)
    {
        int length1 = first.length();
        int length2 = second.length();

        if (length2 != length1)
            return false;

        else
        {
            char tempChar1[] = first.toCharArray();
            char tempChar2[] = second.toCharArray();
            Arrays.sort(tempChar1);
            Arrays.sort(tempChar2);

            for (int i = 0; i < length1; i++)
            {
                if(tempChar1[i] != tempChar2[i])
                {
                    return false;
                }//Add in a way to convert uppercase letters to lowercase letters for more accuracy
            }
        }
        return true;
    }
}
