package oop.example.Ex24;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramCheckerTest {

    @Test
    void isAnagram_true_for_same_word() {
        AnagramChecker check = new AnagramChecker();

        boolean actual = check.isAnagram("note", "note");
        assertTrue(actual);
    }

    @Test
    void isAnagram_true_for_different_word_anagrams() {
        AnagramChecker check = new AnagramChecker();

        boolean actual = check.isAnagram("note", "tone");
        assertTrue(actual);
    }

    @Test
    void isAnagram_true_for_anagrams_with_spaces() {
        AnagramChecker check = new AnagramChecker();

        boolean actual = check.isAnagram("hello world", "hello world");
        assertTrue(actual);
    }

    @Test
    void isAnagram_true_for_same_word_with_uppercase_letters() {
        AnagramChecker check = new AnagramChecker();

        boolean actual = check.isAnagram("Note", "Note");
        assertTrue(actual);
    }

    @Test
    void isAnagram_true_for_different_word_with_uppercase_letters() {
        AnagramChecker check = new AnagramChecker();

        boolean actual = check.isAnagram("Note", "toNe");
        assertTrue(actual);
    }

    @Test
    void isAnagram_false_for_same_word_with_different_case_letters() {
        //In my code uppercase letters must match in the input or it's not an anagram
        AnagramChecker check = new AnagramChecker();

        boolean actual = check.isAnagram("Note", "note");
        assertFalse(actual);
    }

    @Test
    void isAnagram_false_for_non_anagrams() {
        AnagramChecker check = new AnagramChecker();

        boolean actual = check.isAnagram("dog", "cat");
        assertFalse(actual);
    }

    @Test
    void isAnagram_false_for_words_of_different_lengths_but_same_letters() {
        AnagramChecker check = new AnagramChecker();

        boolean actual = check.isAnagram("note", "notee");
        assertFalse(actual);
    }

    @Test
    void isAnagram_false_for_words_of_different_lengths_partially_different_letters() {
        AnagramChecker check = new AnagramChecker();

        boolean actual = check.isAnagram("note", "not");
        assertFalse(actual);
    }
}





