package Strings_Level1;

import java.util.Scanner;

public class UppercaseComparison {
     // Method to convert text to uppercase manually using ASCII
    public static String manualToUpperCase(String text) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // if character is lowercase (a-z)
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32);  // convert to uppercase
            }

            result.append(ch);
        }
        return result.toString();
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;  // mismatch found
            }
        }
        return true; // all characters matched
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take full text input
        System.out.print("Enter text: ");
        String input = sc.nextLine();

        // Convert using built-in method
        String builtInUpper = input.toUpperCase();

        // Convert using manual method
        String manualUpper = manualToUpperCase(input);

        // Compare both results
        boolean isSame = compareStrings(builtInUpper, manualUpper);

        // Display results
        System.out.println("\n--- Conversion Results ---");
        System.out.println("Built-in toUpperCase(): " + builtInUpper);
        System.out.println("Manual Conversion    : " + manualUpper);

        System.out.println("\n--- Comparison Result ---");
        if (isSame) {
            System.out.println("✅ Both methods produce the same result.");
        } else {
            System.out.println("❌ The results are different.");
        }

        sc.close();
    }

}
