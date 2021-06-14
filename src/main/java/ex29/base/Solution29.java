/*
* UCF COP 3330 Summer 2021 Assignment 2 Solutions
* Copyright 2021 Charlene Creighton
 */

/*
Write a quick calculator that prompts for the rate of return on an investment
 and calculates how many years it will take to double your investment.
The formula is years = 72 / r where r is the stated rate of return.

Example Output
What is the rate of return? 0
Sorry. That's not a valid input.
What is the rate of return? ABC
Sorry. That's not a valid input.
What is the rate of return? 4
It will take 18 years to double your initial investment.

Constraints
Don’t allow the user to enter 0.
Don’t allow non-numeric values.
Use a loop to trap bad input, so you can ensure that the user enters valid values.
 */

package ex29.base;

import java.util.Scanner;

public class Solution29 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        readData call = new readData();

        System.out.printf("\nIt will take %d years to double your initial investment.",
                call.callReadInputData(call.readInputData()));
    }
}
