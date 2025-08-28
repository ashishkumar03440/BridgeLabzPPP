package Strings_Level1;
import java.util.Scanner;


public class StringIndexOutOfBoundsDemo {
    // Method that generates the Exception (without handling)
    public static void generateException(String text) {
        // Accessing index beyond the length of string
        System.out.println("Character at index 10: " + text.charAt(10));
    }

    // Method that demonstrates handling with try-catch
    public static void handleException(String text) {
        try {
            // Again accessing invalid index
            System.out.println("Character at index 10: " + text.charAt(10));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e);
            System.out.println("You tried to access an invalid index. String length = " + text.length());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Call method that generates the exception
        System.out.println("\n--- Generating Exception ---");
        // This will abruptly terminate the program if not commented
        // generateException(input);

        // Call method that handles the exception
        System.out.println("\n--- Handling Exception ---");
        handleException(input);

        sc.close();
    }
}


