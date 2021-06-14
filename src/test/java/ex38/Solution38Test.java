package ex38;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution38Test {

    @Test
    void ReturnsCorrectEvenNumbersFromArray() {

        int[] array = {5, 8, 9, 10, 12};
        int[] newArray;
        int[] finalArray = {8, 10, 12};

        newArray = Solution38.filterEvenNumbers(array);
        assertArrayEquals(finalArray, newArray);
    }
}