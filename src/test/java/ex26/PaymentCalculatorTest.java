package ex26;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {

    @Test
    void calculateMonthsUntilPaidOffReturnsCorrectNumberOfMonths_Set1() {

        // Given
        PaymentCalculator check = new PaymentCalculator();

        // when
        int months = check.calculateMonthsUntilPaidOff(5000, .12, 100);

        // then
        assertEquals(70, months);
    }
}