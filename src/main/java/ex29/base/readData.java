package ex29.base;

import ex29.base.Solution29;

import java.util.InputMismatchException;

// This class uses methods to read and process what user enters
public class readData {

    // This method reads user info and uses try catch to prevent invalid input
    public int readInputData() {
        int userData;
        while (true) {

            System.out.print("What is the rate of return? ");
            try {
                userData = Solution29.input.nextInt();

                while (userData == 0) {
                    System.out.println("\nSorry, that's not a valid input.");
                    System.out.print("What is the rate of return? ");
                    userData = Solution29.input.nextInt();
                }
                return userData;
            }
            catch (InputMismatchException e) {
                Solution29.input.next();
                System.out.println("\nSorry, that's not a valid input.");
            }
        }
    }

    // This method returns 72 divided by user's entry and can be tested by junit
    public int callReadInputData (int user) {

        if (72 % user != 0)
            return (72 / user) + 1;
        return 72 / user;
    }

}
