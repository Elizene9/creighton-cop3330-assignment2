package ex31;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KarvonenTest {

    // First test determining if method returns correct array
    @Test
    void determineRateHasCorrectInputValues() {

        Karvonen call = new Karvonen();

        int[] array = call.determineRate(65, 22);

        int[] check = {138, 145, 151, 158, 165, 171, 178, 185, 191};

        for (int i = 0; i < check.length; i++)
            assertEquals(check[i], array[i]);
    }

    // Second Test determining if method returns correct array
    @Test
    void determineRateHasCorrectInputValues_2() {

        Karvonen call = new Karvonen();

        int[] array = call.determineRate(75, 55);

        int[] check = {125, 129, 134, 138, 143, 147, 152, 156, 161};

        for (int i = 0; i < check.length; i++)
            assertEquals(check[i], array[i]);
    }
}