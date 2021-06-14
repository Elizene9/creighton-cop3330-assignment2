package ex26;

import java.lang.Math;
public class PaymentCalculator {

    // This method takes in 3 doubles and returns amount of months to pay off debt
    public int calculateMonthsUntilPaidOff(double balance, double apr, double monthly) {
        double power = Math.pow(1 + apr / 365, 30);
        double log1 = Math.log(1 + ((balance / monthly) * (1 - power)));
        double log2 = Math.log(1 + apr / 365);
        double x = (-(1/30.0) * log1 / log2);
        int n = (int) x;

        if (n % x != 0)
            n += 1;

        return n;
    }
}
