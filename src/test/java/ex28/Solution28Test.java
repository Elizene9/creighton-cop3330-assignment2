package ex28;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution28Test {

    @Test
    void sum_numbers_returns_correct() {
        int i, sum = 0;
        int array[];
        array = new int[]{1, 2, 3, 4, 5};

        assertEquals(15, Solution28.sum_numbers(array));
    }

    @Test
    void sum_numbers_returns_correct_2() {
        int i;
        int array[];
        array = new int[]{9, 10, 11, 12, 13};

        assertEquals(55, Solution28.sum_numbers(array));
    }
}