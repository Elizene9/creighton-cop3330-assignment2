/*
* UCF COP 3330 Summer 2021 Assignment 2 Solutions
* Copyright 2021 Charlene Creighton
 */

/*
Write a program that prompts for a first name, last name, employee ID, and ZIP code.
Ensure that the input is valid according to these rules:

The first name must be filled in.
The last name must be filled in.
The first and last names must be at least two characters long.
An employee ID is in the format AA-1234. So, two letters, a hyphen, and four numbers.
The ZIP code must be a number.
Display appropriate error messages on incorrect data.

Example Output
Enter the first name: J
Enter the last name:
Enter the ZIP code: ABCDE
Enter the employee ID: A12-1234
The first name must be at least 2 characters long.
The last name must be at least 2 characters long.
The last name must be filled in.
The employee ID must be in the format of AA-1234.
The zipcode must be a 5 digit number.
Or

Enter the first name: John
Enter the last name: Johnson
Enter the ZIP code: 55555
Enter the employee ID: TK-4321
There were no errors found.
Constraints
Create a function for each type of validation you need to write. Then create a validateInput function that takes in all of the input data and invokes the specific validation functions.
Use a single output statement to display the outputs.
 */

package ex27;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution27 {

    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("\nEnter the first name: ");
        String firstname = input.nextLine();

        System.out.print("\nEnter the last name: ");
        String lastname = input.nextLine();

        System.out.print("\nEnter the zipcode: ");
        int zipcode = 0;
        try {
            zipcode = input.nextInt();
        } catch (InputMismatchException ignored) {
            input.next();
        }

        System.out.print("\nEnter the employee ID: ");
        String id = input.next();

        if (validateInput(firstname, lastname, id, zipcode) == 0)
            System.out.println("There were no errors found.");
    }

    // Returns number of errors and prints output
    public static int validateInput(String first, String last, String id, int zip) {
        Exceptions value = new Exceptions();
        int sum = 0;

        if (value.first_name_null(first) == 1)
            System.out.println("The first name must be filled in");
        sum += value.first_name_null(first);

        if (value.first_name_length(first) == 1)
            System.out.println("The first name must be at least 2 characters long");
        sum += value.first_name_length(first);

        if(value.last_name_null(last) == 1)
            System.out.println("The last name must be filled in");
        sum+= value.last_name_null(last);

        if (value.last_name_length(last) == 1)
            System.out.println("The last name must be at least 2 characters long");
        sum += value.last_name_length(last);

        if (value.id_invalid(id) == 1)
            System.out.println("The employee ID must be in the format of AA-1234");
        sum += value.id_invalid(id);

        if (value.zip(zip) == 1)
            System.out.println("The zipcode must be a 5 digit number");
        sum += value.zip(zip);

        return sum;
    }
}
