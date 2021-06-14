/*
 * UCF COP 3330 Summer 2021 Assignment 2 Solutions
 * Copyright 2021 Charlene Creighton
 */

/*
Write a program that prompts for response times from a website in milliseconds.
It should keep asking for values until the user enters “done.”

The program should print the average time (mean), the minimum time, the maximum time,
 and the population standard deviation.

Example Output
Enter a number: 100
Enter a number: 200
Enter a number: 1000
Enter a number: 300
Enter a number: done
Numbers: 100, 200, 1000, 300
The average is 400.0
The minimum is 100
The maximum is 1000
The standard deviation is 353.55

Constraints
Use functions called average, max, min, and std, which take in a list of numbers and return the results.
Use loops and arrays to perform the input and mathematical operations.
Be sure to exclude the "done" entry from the inputs.
Be sure to properly ignore any invalid inputs.
Keep the input separate from the processing and the output.
 */

package ex36;

import java.util.List;
import java.util.Scanner;
public class Solution36 {

    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        Exception36 summons = new Exception36();
        callFunction(summons.readInput());
    }
    // Calling all functions and inserting list values into array
    public static void callFunction(List<Integer>list) {
        ProcessData call = new ProcessData();

        int[]array = new int[list.size()];

        for (int i = 0; i < array.length; i++)
            array[i] = list.get(i);

        call.printData(call.average(array), call.max(array), call.min(array),
                call.std(array, call.average(array)));

    }
}
