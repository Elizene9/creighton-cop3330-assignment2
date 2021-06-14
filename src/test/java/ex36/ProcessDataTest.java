package ex36;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProcessDataTest {

    @Test
    void averageTest() {

        int[] array = {300, 500, 400, 600};
        ProcessData call = new ProcessData();

        double check = call.average(array);
        assertEquals(450, check);
    }

    @Test
    void maxTest() {

        int[] array = {300, 500, 400, 600};
        ProcessData call = new ProcessData();

        int check = call.max(array);
        assertEquals(600, check);
    }

    @Test
    void minTest() {
        int[] array = {300, 500, 400, 600};
        ProcessData call = new ProcessData();

        int check = call.min(array);
        assertEquals(300, check);
    }

    @Test
    void stdDevTest() {
        int[] array = {300, 100, 200, 1000};
        ProcessData call = new ProcessData();

        double check = call.std(array, 400);
        assertEquals(354, Math.round(check));
    }
}