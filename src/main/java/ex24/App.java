package ex24;

/*
 * UCF COP 3330 Summer 2021 Assignment 2 Solutions
 * Copyright 2021 Charlene Creighton
 */

/*
Create a program that compares two strings and determines if the two strings are anagrams.
The program should prompt for both input strings and
display the output as shown in the example that follows.

Example Output
Enter two strings and I'll tell you if they are anagrams:
Enter the first string: note
Enter the second string: tone
"note" and "tone" are anagrams.

Constraints
Implement the program using a function called isAnagram,
which takes in two words as its arguments and returns true or false.
Invoke this function from your main program.
Check that both words are the same length.
 */

import java.util.Arrays;
import java.util.Scanner;
public class App {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter two strings and I'll tell you if they are anagrams\n");
        System.out.print("Enter the first string: ");
        String word1 = input.next();
        System.out.print("Enter the second string: ");
        String word2 = input.next();

        if (isAnagram(word1, word2))
            System.out.printf("\n\"%s\" and \"%s\" are anagrams", word1, word2);
        else
            System.out.printf("\n\"%s\" and \"%s\" are not anagrams", word1, word2);
    }
    // Sorts both strings passed in to see if they are anagrams
    public static boolean isAnagram(String word1, String word2) {
        int i;
        char first_word[] = word1.toCharArray(), second_word[] = word2.toCharArray();

        if (word1.length() != word2.length())
            return false;

        // Sorts char array alphabetically so anagrams will have the same word stored in them
        Arrays.sort(first_word);
        Arrays.sort(second_word);

        for (i = 0; i < word1.length(); i++) {
            if (first_word[i] != second_word[i])
                return false;
        }
        return true;
    }
}
