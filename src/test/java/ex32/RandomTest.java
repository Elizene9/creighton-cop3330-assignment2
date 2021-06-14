package ex32;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RandomTest {

    @Test
    void RandomNumberIsInBounds() {

        Random call = new Random();

        int check = call.num_guesses(8, 10);

        assertEquals(1, check);
    }

    @Test
    void RandomNumberIsInBounds_2() {

        Random call = new Random();

        int check = call.num_guesses(500, 1000);

        assertEquals(1, check);
    }

    @Test
    void RandomNumberIsOutOfBounds() {

        Random call = new Random();

        int check = call.num_guesses(9000, 1000);

        assertEquals(0, check);

    }

    @Test
    void RandomNumberIsOutOfBounds_2() {

        Random call = new Random();

        int check = call.num_guesses(0, 1000);

        assertEquals(0, check);

    }
}