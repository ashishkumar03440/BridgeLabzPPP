package Strings_Level1;

import java.util.Scanner;

public class NumberFormatExceptionDemo {
    // / Method that generates the Exception (without handling)
    public static void generateException(String text) {
        // Try to convert a non-numeric string to integer
        int number = Integer.parseInt(text); 
        System.out.println("Converted number: " + number);
    }

    // Method that handles the Exception using try-catch
    public static void handleException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Converted number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e);
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
        // Uncomment below to see program crash
        // generateException(input);

        // Call method that handles the exception
        System.out.println("\n--- Handling Exception ---");
        handleException(input);

        sc.close();
    }
}
