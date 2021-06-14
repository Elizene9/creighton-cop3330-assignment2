package ex29.challenge;

import ex29.base.readData;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class readDataChallengeTest {

    @Test
    void callReadInputDataCheckCorrectReturn() {

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

    @Test
    void divideZeroShouldReturnFlagStatement() {

        readDataChallenge check = new readDataChallenge();
        String correct = "You cannot divide by zero";
        var flag = check.DivideZero(0);
        assertEquals(correct, flag);

    }

    @Test
    void notDividingByZeroShouldNotReturnFlagStatement() {

        readDataChallenge check = new readDataChallenge();
        String correct = "";
        var flag = check.DivideZero(10);
        assertEquals(correct, flag);

    }
}