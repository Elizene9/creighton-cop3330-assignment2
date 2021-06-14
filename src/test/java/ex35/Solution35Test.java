package ex35;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Solution35Test {

    @Test

    // Test that index of random number is not out of bounds
    void ListHasSizeOfNumberOfItemsEqualToRandomNumberBound() {

        List<String> array = Solution35.list;
        array.add("Bobby");
        array.add("Susan");
        array.add("Lily");
        array.add("Ben");
        int flag = Solution35.list(array, 4);
        assertEquals(4, flag);
    }

    @Test

        // Test that index of random number is not out of bounds
    void ListHasSizeOfNumberOfItemsEqualToRandomNumberBound1() {

        List<String> array = Solution35.list;
        array.add("Bobby");
        array.add("Susan");
        array.add("Lily");
        int flag = Solution35.list(array, 3);
        assertEquals(3, flag);

    }
}