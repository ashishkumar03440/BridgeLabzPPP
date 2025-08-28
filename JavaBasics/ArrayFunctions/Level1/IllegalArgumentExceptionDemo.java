package Strings_Level1;

import java.util.Scanner;

public class IllegalArgumentExceptionDemo {
    // Method that generates the Exception (without handling)
    public static void generateException(String text) {
        // Using substring() with start > end will throw IllegalArgumentException
        System.out.println("Substring from index 5 to 2: " + text.substring(5, 2));
    }

    // Method that handles the Exception using try-catch
    public static void handleException(String text) {
        try {
            // Again using invalid substring range
            System.out.println("Substring from index 5 to 2: " + text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e);
        } catch (RuntimeException e) {
            System.out.println("Caught generic RuntimeException: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Call method that generates the exception
        System.out.println("\n--- Generating Exception ---");
        // Uncomment the below line to see program crash abruptly
        // generateException(input);

        // Call method that handles the exception
        System.out.println("\n--- Handling Exception ---");
        handleException(input);

        sc.close();
    }
}
