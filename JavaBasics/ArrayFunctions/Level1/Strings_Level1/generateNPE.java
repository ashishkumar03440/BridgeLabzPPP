package Strings_Level1;

public class generateNPE {
     // Method to generate NullPointerException (without handling)
    static void generateNPE() {
        String text = null; // text initialized to null
        // This will throw NullPointerException
        System.out.println("Length of text: " + text.length());
    }

    // Method to handle NullPointerException with try-catch
    static void handleNPE() {
        try {
            String text = null; // text initialized to null
            System.out.println("Length of text: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // 1. Call the method that generates the exception
        // generateNPE();  // Uncomment this line to see the program crash

        // 2. Call the method that handles the exception
        handleNPE();  // Safe execution
    }

}
