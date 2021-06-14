package ex27;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// Tests conditions if validateInput returns proper info
class Solution27Test {

    @Test
    void validateInputReturnsCorrect() {

        int validate;

        validate = Solution27.validateInput("charlene", "creighton", "ab-1234", 11111);

        assertEquals(0, validate);
    }

    @Test
    void validateInputReturnsCorrect_2() {

        int validate;

        validate = Solution27.validateInput("c", "creighton", "ab-1234", 11111);

        assertEquals(1, validate);
    }

    @Test
    void validateInputReturnsCorrect_3() {

        int validate;

        validate = Solution27.validateInput("", "creighton", "ab-1234", 11111);

        assertEquals(2, validate);
    }

    @Test
    void validateInputReturnsCorrect_4() {

        int validate;

        validate = Solution27.validateInput("Charlene", "creighton", "12-ab341", 1034);

        assertEquals(2, validate);
    }

    @Test
    void validateInputReturnsCorrect_5() {

        int validate;

        validate = Solution27.validateInput("", "", "b34", 25);

        assertEquals(6, validate);
    }
}