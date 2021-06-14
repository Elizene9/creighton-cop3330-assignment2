package ex36;

import org.apache.commons.lang3.math.NumberUtils;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

// Handles any exceptions
public class Exception36 {

    // Takes in info for list and returns list
    public List <Integer> readInput () {

        String entry;
        List<Integer> userData = new ArrayList<>();

        while (true) {
            System.out.print("\nEnter a number: ");
            entry = Solution36.input.next();

            if (!entry.equals("done") && !NumberUtils.isNumber(entry)){
                System.out.println("\nSorry, that's not a valid input.");
                userData.add (validateInput());
            }
            else if (entry.equals("done") && !NumberUtils.isNumber(entry)){
                return userData;
            }

            else
                userData.add(Integer.parseInt(entry));
        }
    }
    // Handles invalid inputs
    public int validateInput() {

        int listItem;
        while (true) {

            try {
                System.out.print("\nEnter a number: ");
                listItem = Solution36.input.nextInt();
                return listItem;
            }
            catch (InputMismatchException e) {
                Solution36.input.next();
                System.out.println("\nSorry, that's not a valid input.");
            }
        }
    }
}
