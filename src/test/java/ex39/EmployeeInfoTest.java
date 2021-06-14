package ex39;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeInfoTest {

    @Test
    void LastNamesSortedCorrectly() {

        String[] organized = {"This", "Project", "Took", "Way", "Too", "Long"};
        String[] unsorted = {"Project", "Way", "Too", "This", "Took", "Long"};
        EmployeeInfo call = new EmployeeInfo();

        int check = call.correct(unsorted, organized);

        assertEquals(1, check);
    }
}