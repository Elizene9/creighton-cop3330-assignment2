/*
 * UCF COP 3330 Summer 2021 Assignment 2 Solutions
 * Copyright 2021 Charlene Creighton
 */

/*
Given the following data set create a program that lets a user locate all records that
match the search string by comparing the search string to the first or last name field.

First Name	Last Name	Position	Separation Date
John	Johnson	Manager	2016-12-31
Tou	Xiong	Software Engineer	2016-10-05
Michaela	Michaelson	District Manager	2015-12-19
Jake	Jacobson	Programmer
Jacquelyn	Jackson	DBA
Sally	Webber	Web Developer	2015-12-18

Example Output
Enter a search string: Jac

Results:
Name                | Position          | Separation Date
--------------------|-------------------|----------------
Jacquelyn Jackson   | DBA               |
Jake Jacobson       | Programmer        |

Constraint
Store the data using a list of maps.
 */

package ex40;

import java.util.*;

public class Solution40 {

    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("\nEnter a search string: ");
        String user = input.next();

        Traverse call = new Traverse();
        EmployeeInfo access = new EmployeeInfo();

        List <Map> list = new ArrayList<>();
        List <String> records = new ArrayList<>();

        HashMap emp1 = new HashMap();
        HashMap emp2 = new HashMap();
        HashMap emp3 = new HashMap();
        HashMap emp4 = new HashMap();

        for (int i = 0; i < 6; i++) {

            emp1.put(access.lname[i], access.lname[i]);
            emp2.put(access.fname[i], access.fname[i]);
            emp3.put(access.title[i], access.title[i]);
            emp4.put(access.date[i], access.date[i]);

            list.add(emp1);
            list.add(emp2);
            list.add(emp3);
            list.add(emp4);
        }


        for (int j = 0; j < 6; j++) {

            records.add(access.lname[j]);
            records.add(access.fname[j]);
            records.add(access.title[j]);
            records.add(access.date[j]);
        }

        records = call.traverse(user, records);
    }
}
