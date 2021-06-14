package ex31;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Karvonen {

    static Scanner input = new Scanner(System.in);

    // Calculates Karvonen heart rate
    int[] determineRate(int rest, int age) {

        float index = 55;
        int array[] = new int[9];

        for (int i = 0; i < 9; i++) {

            array[i] = (int) Math.round( ((((220 - age) - rest) * (index / 100.0) ) + rest));
            index += 5;
        }
        return array;
    }

    // Prints output table
    void generateTable(int[] bpm) {
        int index = 55;

        System.out.printf("Intensity%4s| Rate\n", "");
        System.out.printf("%s\n", "-------------|--------");
        for (int i = 0; i < bpm.length; i++) {

            System.out.printf("%s", index + "%");
            System.out.printf("%10s| %d bpm\n", "", bpm[i]);
            index += 5;
        }

    }

    // Handles invalid pulse input
     int exceptionHandlePulse () {
        int pulse;
        while (true) {

            try {
                System.out.print("Resting pulse: ");
                pulse = input.nextInt();
                return pulse;
                }
            catch (InputMismatchException e) {
                input.next();
                System.out.println("\nSorry, that's not a valid input.");
            }
        }
    }

    // Handles invalid age input
    int exceptionHandleAge() {
        int age;
        while (true) {
            try {
                System.out.print("Age: ");
                age = input.nextInt();
                return age;
            }
            catch (InputMismatchException e) {
                input.next();
                System.out.println("\nSorry, that's not a valid input.");
            }
        }
    }
}
