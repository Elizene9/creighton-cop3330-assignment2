/*
 * UCF COP 3330 Summer 2021 Assignment 2 Solutions
 * Copyright 2021 Charlene Creighton
 */

/*
Create a program that picks a winner for a contest or prize drawing.
Prompt for names of contestants until the user leaves the entry blank.
 Then randomly select a winner.

Example Output
Enter a name: Homer
Enter a name: Bart
Enter a name: Maggie
Enter a name: Lisa
Enter a name: Moe
Enter a name:
The winner is... Maggie.

Constraints
Use a loop to capture user input into an array.
Use a random number generator to pluck a value from the array.
Don’t include a blank entry in the array.
Some languages require that you define the length of the array ahead of time.
 You may need to find another data structure, like an ArrayList.
 */

package ex35;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class Solution35 {

    static Scanner input = new Scanner(System.in);
    static Random rand = new Random();
    static List<String> list = new ArrayList<>();
    public static void main(String[] args) {

        // Create list and scan info

        int counter = 0;
        while (true) {

            System.out.print("\nEnter a name: ");
            String name = input.nextLine();
            list.add(name);
            counter++;

            if (name.isEmpty())
                break;
        }
        int count = list(list, counter);
    }

    // This method reads in a random number of names and prints random winner
    public static int list(List<String> array, int counter) {

        int index;

        index = rand.nextInt(counter);

        System.out.printf("\nAnd the winner is... %s", array.get(index));

        return counter;
    }
}
