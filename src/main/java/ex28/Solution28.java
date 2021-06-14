/*
* UCF COP 3330 Summer 2021 Assignment 2 Solutions
* Copyright 2021 Charlene Creighton
 */

/*
Write a program that prompts the user for five numbers and computes the total of the numbers.

Example Output
Enter a number: 1
Enter a number: 2
Enter a number: 3
Enter a number: 4
Enter a number: 5
The total is 15.

Constraints
The prompting must use repetition, such as a counted loop, not three separate prompts.
Create a flowchart before writing the program.
 */
package ex28;

import java.util.Scanner;

public class Solution28 {

    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        int i;
        int array[] = new int[5];
        for (i = 0; i < array.length; i++) {
            System.out.print("\nEnter a number: ");
            array[i] = input.nextInt();
        }
    int sum = sum_numbers(array);
        System.out.printf("\nThe sum of the numbers is %d", sum);

    }

    public static int sum_numbers(int array[]) {
        int i, sum = 0;
        for (i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
}
