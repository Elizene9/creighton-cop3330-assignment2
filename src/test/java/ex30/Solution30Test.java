package ex30;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution30Test {

    @Test
    void tableHasCorrectValues() {
        int array[][];

        array = Solution30.table(12);

        var flag = array[4][4];
        assertEquals(25, flag);
    }

    @Test
    void tableHasCorrectValues_1() {
        int array[][];

        array = Solution30.table(12);

        var flag = array[11][11];
        assertEquals(144, flag);
    }
}