package ex32;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Random {

    static int counter;
    static Scanner input = new Scanner(System.in);

    // Prompts user for info and calls other methods to handle exceptions
    void ProcessLevel() {
        int guess, flag;
        char play = 'y';
        String prompt = "I have my number. What's your guess? ";

        while (play != 'n' && play != 'N') {

            switch (level() ){
                case 1: {
                   var rand = Solution32.num;
                   int correct = rand.nextInt(10) + 1;
                    System.out.println(prompt);
                    guess = guessExceptions();
                    flag = num_guesses(correct, 10);

                    while (guess != correct) {
                        if (guess < correct) {
                            System.out.print("Too low. Guess again: ");
                            guess = guessExceptions();
                        }
                        else {
                            System.out.print("Too high. Guess again: ");
                            guess = guessExceptions();
                        }
                   }
                    break;
                }

                case 2: {
                    var rand = Solution32.num;
                    int correct = rand.nextInt(100) + 1;
                    System.out.println(prompt);
                    guess = guessExceptions();
                    flag = num_guesses(guess, 100);
                    while (guess != correct) {

                        if (guess < correct) {
                            System.out.print("Too low. Guess again: ");
                            guess = guessExceptions();
                        }

                        else {
                            System.out.print("Too high. Guess again: ");
                            guess = guessExceptions();
                        }
                    }
                    break;
                }

                case 3: {
                    var rand = Solution32.num;
                    int correct = rand.nextInt(1000) + 1;
                    System.out.println(prompt);
                    guess = guessExceptions();
                    flag = num_guesses(guess, 1000);

                    while (guess != correct) {

                        if (guess < correct) {
                            System.out.print("Too low. Guess again: ");
                            guess = guessExceptions();
                        }
                        else {
                            System.out.print("Too high. Guess again: ");
                            guess = guessExceptions();
                        }

                    }
                    break;
                }
                default:
                    break;
            }
            System.out.printf("You got it in %d guesses!\n", counter);
            counter = 0;
            System.out.print("Do you wish to play again (Y / N)? ");
            play = input.next().charAt(0);
        }
    }

    // Prompts user for difficulty level and handles exceptions
    int level () {

        int diff;
        while (true) {

            try {
                System.out.print("Enter the difficulty level (1, 2, or 3): ");
                diff = input.nextInt();
                return diff;
            }
            catch (InputMismatchException e) {
                input.next();
                System.out.println("\nSorry, that's not a valid input.");
            }
        }
    }

    // Prevents invalid guesses
    int guessExceptions() {
        int guess;
        while (true) {
            try {
                guess = input.nextInt();
                Random.counter++;
                return guess;
            }
            catch (InputMismatchException e) {
                input.next();
                System.out.println("\nSorry, that's not a valid input. What's your guess?");
            }
        }
    }

    // Allows random number to be tested
    int num_guesses(int guess, int guess_bound) {
        if (guess <= 0 || guess > guess_bound)
            return 0;

        return 1;
    }
}
