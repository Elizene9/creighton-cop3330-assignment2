/*
* UCF COP 3330 Summer 2021 Assignment 2 Solutions
* Copyright 2021 Charlene Creighton
 */

/*
Write a Guess the Number game that has three levels of difficulty.
 The first level of difficulty would be a number between 1 and 10.
 The second difficulty set would be between 1 and 100.
 The third difficulty set would be between 1 and 1000.

Prompt for the difficulty level, and then start the game.
The computer picks a random number in that range and prompts the player to guess that number.
Each time the player guesses, the computer should give the player a hint as to whether the
number is too high or too low. The computer should also keep track of the number of guesses.
Once the player guesses the correct number, the computer should present the number of guesses
 and ask if the player would like to play again.

Constraints
Don’t allow any non-numeric data entry.
During the game, count non-numeric entries as wrong guesses.
 */
package ex32;
import java.util.Random;

public class Solution32 {

    public static Random num = new Random();

    public static void main(String[] args) {

        ex32.Random call = new ex32.Random();
        System.out.println("Let's play Guess The Number!");

        call.ProcessLevel();
    }
}
