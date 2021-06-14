/*
* UCF COP 3330 Summer 2021 Assignment 2 Solutions
* Copyright 2021 Charlene Creighton
 */

/*
Write a program that will help you determine how many months it will
 take to pay off a credit card balance. The program should ask the
 user to enter the balance of a credit card, the APR of the card,
 and their monthly payment. The program should then return the number
 of months needed (rounded up to the next integer value).

The formula for this is n = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)
where n is the number of months.
i is the daily rate (APR divided by 365).
b is the balance.
p is the monthly payment.
Example Output
What is your balance? 5000
What is the APR on the card (as a percent)? 12
What is the monthly payment you can make? 100
It will take you 70 months to pay off this card.
Constraints
Prompt for the card’s APR. Do the division internally.
Prompt for the APR as a percentage, not a decimal.
Use a class called PaymentCalculator with a public method called
calculateMonthsUntilPaidOff, which returns the number of months.
Round fractions of a cent up to the next cent.
 */

package ex26;

import java.util.Scanner;
public class Solution26 {

    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        // Creates object of class type PaymentCalculator to call PaymentCalculator methods
        PaymentCalculator access = new PaymentCalculator();
        double bal, per, payment;

        System.out.print("What is your balance? ");
        bal = input.nextDouble();

        System.out.print("\nWhat is the APR on the card(as a percent)? ");
        per = input.nextDouble();

        System.out.print("\nWhat is the monthly payment you can make? ");
        payment = input.nextDouble();

        System.out.printf("\nIt will take you %d months to pay off this card",
                access.calculateMonthsUntilPaidOff(bal, per / 100, payment));
    }
}
