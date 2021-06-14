package ex24;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void Anagram_length_and_anagram_check_is_correct() {

        App check = new App();

        boolean given = check.isAnagram("cape", "pace");

        assertEquals(true, given);
    }

    @Test
    void Anagram_length_and_anagram_check_is_correct_2() {

        App check2 = new App();

        boolean given = check2.isAnagram("tarped", "depart");

        assertEquals(true, given);
    }

    @Test
    void Anagram_length_and_anagram_check_is_correct_3() {

        App check3 = new App();

        boolean given = check3.isAnagram("criticize", "criticize");

        assertEquals(true, given);
    }

    @Test
    void Anagram_length_and_anagram_check_is_incorrect_1() {

        App check1 = new App();

        boolean given = check1.isAnagram("piece", "peace");

        assertEquals(false, given);
    }

    @Test
    void Anagram_length_and_anagram_check_is_incorrect_2() {

        App check2 = new App();

        boolean given = check2.isAnagram("favor", "flavor");

        assertEquals(false, given);
    }

    @Test
    void Anagram_length_and_anagram_check_is_incorrect_3() {

        App check3 = new App();

        boolean given = check3.isAnagram("eeeee", "plead");

        assertEquals(false, given);
    }

}