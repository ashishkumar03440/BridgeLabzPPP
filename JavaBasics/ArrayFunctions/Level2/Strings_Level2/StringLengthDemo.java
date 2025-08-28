package Strings_Level2;

import java.util.Scanner;

public class StringLengthDemo {
    // Method to find length of a string without using length()
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count); // access characters one by one
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // exception occurs when index goes out of range
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String input = sc.next();  // takes one word, not full sentence

        // Call user-defined method
        int lengthWithoutMethod = findLength(input);

        // Call built-in length() method
        int lengthWithMethod = input.length();

        // Display results
        System.out.println("Length without using length() method: " + lengthWithoutMethod);
        System.out.println("Length using length() method: " + lengthWithMethod);

        sc.close();
    }
}
