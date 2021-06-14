/*
 * UCF COP 3330 Summer 2021 Assignment 2 Solutions
 * Copyright 2021 Charlene Creighton
 */

/*
Create a small program that contains a list of employee names.
Print out the list of names when the program runs the first time.
Prompt for an employee name and remove that specific name from the list of names.
Display the remaining employees, each on its own line.

Example Output
There are 5 employees:
John Smith
Jackie Jackson
Chris Jones
Amanda Cullen
Jeremy Goodwin

Enter an employee name to remove: Chris Jones

There are 4 employees:
John Smith
Jackie Jackson
Amanda Cullen
Jeremy Goodwin
Constraint
Use an array or list to store the names.
 */

package ex34;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
public class Solution34 {

    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        String chosen;
        List <String> array = new ArrayList<>();
             array.add("John Smith");
             array.add("Jackie Jackson");
             array.add("Chris Jones");
             array.add("Amanda Cullen");
             array.add("Jeremy Goodwin");

        System.out.println(array);
        System.out.print("Enter an employee name to remove: ");
        var remove = input.nextLine();

         chosen = name(array, remove);
    }

    // Removes designated employee from list
    public static String name(List<String> array, String item) {
        int i, index = 0;
        String employee = null;

        for (i = 0; i < 5; i++) {
            if (item.equals(array.get(i))) {
                employee = array.get(i);
                index = i;
            }
        }

        array.remove(index);

        for (i = 0; i < 4; i++)
            System.out.println(array);

        return employee;

    }
}
