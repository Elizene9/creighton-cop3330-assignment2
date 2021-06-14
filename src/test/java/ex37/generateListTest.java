package ex37;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class generateListTest {

    @Test
    // Test that password has correct amount of numbers
    void PasswordSatisfiesUserConditionsOfNumber() {

        int numCounter = 0;
        generateList call = new generateList();

        char[] passwordTest = call.list(8, 2, 2);

        for (char c : passwordTest) {

            if (Character.isDigit(c))
                numCounter++;
        }

        assertEquals(2, numCounter);
    }

    @Test
        // Test that password has correct amount of letters
    void PasswordSatisfiesUserConditionsOfLetter() {

        int letterCounter = 0;
        generateList call = new generateList();

        char[] passwordTest = call.list(8, 2, 2);

        for (char c : passwordTest) {

            if (Character.isLetter(c))
                letterCounter++;
        }

        assertEquals(passwordTest.length - 4, letterCounter);
    }

    @Test
        // Test that password has correct amount of special characters
    void PasswordSatisfiesUserConditionsOfSpecial() {

        int specialCounter = 0;
        generateList call = new generateList();

        char[] passwordTest = call.list(8, 2, 2);

        for (char c : passwordTest) {

            if (!Character.isDigit(c) && !Character.isLetter(c))
                specialCounter++;
        }

        assertEquals(2, specialCounter);
    }
}