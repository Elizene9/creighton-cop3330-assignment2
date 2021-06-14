/*
* UCF COP 3330 Summer 2021 Assignment 2 Solutions
* Copyright 2021 Charlene Creighton
 */

/*
Create a program that prompts for your age and your resting heart rate.
Use the Karvonen formula to determine the target heart rate based on a range
of intensities from 55% to 95%. Generate a table with the results as shown in the example output.
 The formula is TargetHeartRate = (((220 − age) − restingHR) × intensity) + restingHR
Example Output
Resting Pulse: 65        Age: 22

Intensity    | Rate
-------------|--------
55%          | 138 bpm
60%          | 145 bpm
65%          | 151 bpm
:               :        (extra lines omitted)
85%          | 178 bpm
90%          | 185 bpm
95%          | 191 bpm

Constraints
Don’t hard-code the percentages. Use a loop to increment the percentages from 55 to 95.
Ensure that the heart rate and age are entered as numbers.
Don’t allow the user to continue without entering valid inputs.
Display the results in a tabular format.
 */
package ex31;

public class Solution31 {

    public static void main(String[] args) {

        Karvonen call = new Karvonen();

        call.generateTable(call.determineRate(call.exceptionHandlePulse(), call.exceptionHandleAge()));
    }
}
