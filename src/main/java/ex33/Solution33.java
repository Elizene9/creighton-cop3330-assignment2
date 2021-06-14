/*
 * UCF COP 3330 Summer 2021 Assignment 2 Solutions
 * Copyright 2021 Charlene Creighton
 */

/*
Create a Magic 8 Ball game that prompts for a question
 and then displays either "Yes," "No," "Maybe," or "Ask again later."

Example Output
What's your question?
> Will I be rich and famous?

Ask again later.
Constraint
The value should be chosen randomly using a pseudo random number generator.
Store the possible choices in a list and select one at random.
 */

package ex33;

import java.util.Scanner;
import java.util.Random;

public class Solution33 {

    static Scanner input = new Scanner(System.in);
    static Random rand = new Random();

    public static void main(String[] args) {
        System.out.println("What's your question?");
        input.next();

        int random = rand.nextInt(4);
        System.out.printf("%s", response(random));
    }

    // Assigns responses to values of answer array
    public static String response(int random) {

        String[] answer = new String[4];

        answer[0] ="Yes";
        answer[1] = "No";
        answer[2] = "Maybe";
        answer[3] = "Ask again later";

        return answer[random];
    }
}
