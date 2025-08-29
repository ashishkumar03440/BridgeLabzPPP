package Strings_Level1;

import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {
     // Method that generates the Exception (without handling)
    public static void generateException(String[] names) {
        // Access index larger than the array size
        System.out.println("Accessing element at index 5: " + names[5]);
    }

    // Method that handles the Exception using try-catch
    public static void handleException(String[] names) {
        try {
            // Again trying to access an invalid index
            System.out.println("Accessing element at index 5: " + names[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e);
        } catch (RuntimeException e) {
            System.out.println("Caught generic RuntimeException: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking array size input from user
        System.out.print("Enter the number of names: ");
        int size = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] names = new String[size];

        // Taking names input
        for (int i = 0; i < size; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = sc.nextLine();
        }

        // Call method that generates the exception
        System.out.println("\n--- Generating Exception ---");
        // Uncomment below to see program crash
        // generateException(names);

        // Call method that handles the exception
        System.out.println("\n--- Handling Exception ---");
        handleException(names);

        sc.close();
    }
}
