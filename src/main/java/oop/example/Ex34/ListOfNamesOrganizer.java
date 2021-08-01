package oop.example.Ex34;

public class ListOfNamesOrganizer {
    public String[] deleteNameFromList(String nameToDelete)
    {
        String[] listOfNames = {"John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"};

        String[] newListOfNames = new String[listOfNames.length - 1];

        for (int i = 0, j = 0; i < listOfNames.length; i++) {
            if (!(listOfNames[i].equals(nameToDelete))) {
                newListOfNames[j] = listOfNames[i];
                j++;
            }
        }

        return newListOfNames; //return newListOfNames;
    }

}
