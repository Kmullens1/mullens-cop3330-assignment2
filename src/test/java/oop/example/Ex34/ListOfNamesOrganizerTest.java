package oop.example.Ex34;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListOfNamesOrganizerTest {

    @Test
    void deleteNameFromList_Delete_First_Name() {
        ListOfNamesOrganizer organize = new ListOfNamesOrganizer();

        String[] expected = {"Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"};
        String[] actual = organize.deleteNameFromList("John Smith");

        assertEquals(expected[0], actual[0]);
        assertEquals(expected[1], actual[1]);
        assertEquals(expected[2], actual[2]);
        assertEquals(expected[3], actual[3]);
    }

    @Test
    void deleteNameFromList_Delete_Second_Name() {
        ListOfNamesOrganizer organize = new ListOfNamesOrganizer();

        String[] expected = {"John Smith", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"};
        String[] actual = organize.deleteNameFromList("Jackie Jackson");

        assertEquals(expected[0], actual[0]);
        assertEquals(expected[1], actual[1]);
        assertEquals(expected[2], actual[2]);
        assertEquals(expected[3], actual[3]);
    }

    @Test
    void deleteNameFromList_Delete_Third_Name() {
        ListOfNamesOrganizer organize = new ListOfNamesOrganizer();

        String[] expected = {"John Smith", "Jackie Jackson", "Amanda Cullen", "Jeremy Goodwin"};
        String[] actual = organize.deleteNameFromList("Chris Jones");

        assertEquals(expected[0], actual[0]);
        assertEquals(expected[1], actual[1]);
        assertEquals(expected[2], actual[2]);
        assertEquals(expected[3], actual[3]);
    }

    @Test
    void deleteNameFromList_Delete_Fourth_Name() {
        ListOfNamesOrganizer organize = new ListOfNamesOrganizer();

        String[] expected = {"John Smith", "Jackie Jackson", "Chris Jones", "Jeremy Goodwin"};
        String[] actual = organize.deleteNameFromList("Amanda Cullen");

        assertEquals(expected[0], actual[0]);
        assertEquals(expected[1], actual[1]);
        assertEquals(expected[2], actual[2]);
        assertEquals(expected[3], actual[3]);
    }
    @Test
    void deleteNameFromList_Delete_Fifth_Name() {
        ListOfNamesOrganizer organize = new ListOfNamesOrganizer();

        String[] expected = {"John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen"};
        String[] actual = organize.deleteNameFromList("Jeremy Goodwin");

        assertEquals(expected[0], actual[0]);
        assertEquals(expected[1], actual[1]);
        assertEquals(expected[2], actual[2]);
        assertEquals(expected[3], actual[3]);
    }

}