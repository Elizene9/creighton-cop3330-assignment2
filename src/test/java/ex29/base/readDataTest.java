package ex29.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class readDataTest {

    @Test // Tests both readData methods; both must be working for callReadInputData to return correct
    void readInputDataReturnsCorrect() {

        readData check = new readData();

        int flag = check.callReadInputData(4);
        assertEquals(18, flag);
    }

    @Test // Tests both readData methods; both must be working for callReadInputData to return correct
    void readInputDataReturnsCorrect_1() {

        readData check = new readData();

        int flag = check.callReadInputData(30);
        assertEquals(3, flag);
    }
}