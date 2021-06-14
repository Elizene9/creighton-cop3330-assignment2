/*
* UCF COP 3330 Summer 2021 Assignment 2 Solution
* Copyright 2021 Charlene Creighton
 */

/*
Create a program that determines the complexity of a given password based on these rules:

A very weak password contains only numbers and is fewer than eight characters.
A weak password contains only letters and is fewer than eight characters.
A strong password contains letters and at least one number and is at least eight characters.
A very strong password contains letters, numbers,
and special characters and is at least eight characters.

Example Output
The password '12345' is a very weak password.
The password 'abcdef' is a weak password.
The password 'abc123xyz' is a strong password.
The password '1337h@xor!' is a very strong password.

Constraints
Create a passwordValidator function that takes in the password
as its argument and returns a value you can evaluate to determine
the password strength. Do not have the function return a string—you may
need to support multiple languages in the future.
Use a single output statement.
 */

package ex25;

import java.util.Scanner;
public class Exercise_25 {

    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter your new password: ");
        String pass_w = input.next();
        System.out.printf("\"%s\" is a %s password", pass_w, checkPassword(passwordValidator(pass_w)));
    }
    // Returns integer indicating password strength
    public static int passwordValidator(String password) {
        int i, digits = 0, letters = 0, str_length = 0, special = 0, sum = 0;
        char word[] = password.toCharArray();

        for (i = 0; i < password.length(); i++) {
            if (password.length() >= 8)
                str_length = 1;
            if (Character.isLetter(word[i]))
                letters = 1;
            else if (Character.isDigit(word[i]))
                digits = 1;
            else
                special = 1;
        }
        sum += (letters + digits + str_length + special);
        if (special == 1 && letters == 1 && str_length == 1 && digits == 1)
            return sum;

        else if (special == 0 && letters == 1 && str_length == 0 && digits == 0)
            return sum + 1;

        else if (special == 0 && letters == 1 && str_length == 1 && digits == 1)
            return sum;

        else
            return sum;
    }
    // Returns string indicating password strength to user
    public static String checkPassword(int flag) {
        if (flag == 4)
            return "very strong";

        else if (flag == 2)
            return "weak";

        else if (flag == 3)
            return "strong";

        else
            return "very weak";
    }
}
