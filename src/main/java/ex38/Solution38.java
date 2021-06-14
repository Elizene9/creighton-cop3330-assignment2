/*
 * UCF COP 3330 Summer 2021 Assignment 2 Solutions
 * Copyright 2021 Charlene Creighton
 */

/*
Create a program that prompts for a list of numbers, separated by spaces.
Have the program print out a new list containing only the even numbers.

Example Output
Enter a list of numbers, separated by spaces: 1 2 3 4 5 6 7 8
The even numbers are 2 4 6 8.

Constraints
Convert the input to an array. Many languages can easily convert strings to arrays
with a built-in function that splits apart a string based on a specified delimiter.
Write your own algorithm—don’t rely on the language’s built-in filter or similar enumeration feature.
Use a function called filterEvenNumbers to encapsulate the logic for this.
The function takes in the old array and returns the new array.
 */

package ex38;

import java.util.Scanner;
public class Solution38 {

    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        int i;
        int []array;
        String []entry;
        System.out.print("Enter a list of numbers separated by spaces: ");

        entry = input.nextLine().split(" ");
        array = new int[entry.length];

        for (i = 0; i < entry.length; i++) {

            array[i] = Integer.parseInt(entry[i]);
        }
        System.out.print("\nThe even numbers are: ");
        int[]newArray = filterEvenNumbers(array);

    }

    static int[] filterEvenNumbers(int[] oldArray) {

        int counter = 0;
        int[] New = new int[oldArray.length];
        int[] Final;
        for (int j : oldArray) {

            if (j % 2 == 0) {
                New[counter] = j;
                counter++;
            }
        }

        Final = new int[counter];
        for (int k = 0; k < counter; k++) {
            Final[k] = New[k];

            System.out.printf("%d ", Final[k]);
        }

        return Final;
    }
}
