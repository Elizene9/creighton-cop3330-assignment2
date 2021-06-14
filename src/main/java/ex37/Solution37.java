/*
 * UCF COP 3330 Summer 2021 Assignment 2 Solutions
 * Copyright 2021 Charlene Creighton
 */

/*
Create a program that generates a secure password.
Prompt the user for the minimum length, the number of special characters,
and the number of numbers. Then generate a password for the user using those inputs.

Example Output
What's the minimum length? 8
How many special characters? 2
How many numbers? 2
Your password is aurn2$1s#

Constraints
Use lists to store the characters you’ll use to generate the passwords.
Ensure that the generated password is random.
Ensure that there are at least as many letters are there are special characters and number.
 */

package ex37;

import java.util.Scanner;

public class Solution37 {

    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        generateList call = new generateList();
        char[] password;

        System.out.print("\nWhat's the minimum length? ");
        int length = input.nextInt();

        System.out.print("\nHow many special characters? ");
        int character = input.nextInt();

        System.out.print("\nHow many numbers? ");
        int numbers = input.nextInt();

        password = call.list(length, character, numbers);
        System.out.print("\nYour password is ");

        for (char c : password) {
            System.out.print(c);
        }
    }
}
