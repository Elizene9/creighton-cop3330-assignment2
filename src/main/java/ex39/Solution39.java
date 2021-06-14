/*
 * UCF COP 3330 Summer 2021 Assignment 2 Solutions
 * Copyright 2021 Charlene Creighton
 */

/*
Given the following data set, create a program that sorts all employees by
last name and prints them to the screen in a tabular format.

First Name	Last Name	Position	Separation Date
John	Johnson	Manager	2016-12-31
Tou	Xiong	Software Engineer	2016-10-05
Michaela	Michaelson	District Manager	2015-12-19
Jake	Jacobson	Programmer
Jacquelyn	Jackson	DBA
Sally	Webber	Web Developer	2015-12-18

Example Output
Name                | Position          | Separation Date
--------------------|-------------------|----------------
Jacquelyn Jackson   | DBA               |
Jake Jacobson       | Programmer        |
John Johnson        | Manager           | 2016-12-31
Michaela Michaelson | District Manager  | 2015-12-19
Sally Weber         | Web Developer     | 2015-12-18
Tou Xiong           | Software Engineer | 2016-10-05
Constraint
Store the data using a list of maps.
 */

package ex39;

import java.util.*;

public class Solution39 {

    public static void main(String[] args) {

        EmployeeInfo access = new EmployeeInfo();

        List<Map> list = new ArrayList<>();

        HashMap emp1 = new HashMap();
        HashMap emp2 = new HashMap();
        HashMap emp3 = new HashMap();
        HashMap emp4 = new HashMap();

        for (int i = 0; i < 6; i++) {

            emp1.put(access.lname[i], access.lname[i]);
            emp2.put(i + 1, access.fname[i]);
            emp3.put(i + 1, access.title[i]);
            emp4.put(i + 1, access.date[i]);
            list.add(emp1);
            list.add(emp2);
            list.add(emp3);
            list.add(emp4);
        }

        access.sortList(list);
    }
}
