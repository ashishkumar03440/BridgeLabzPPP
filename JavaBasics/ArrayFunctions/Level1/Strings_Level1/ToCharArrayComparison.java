package Strings_Level1;

import java.util.Scanner;

public class ToCharArrayComparison {
    static char[] toCharArrayManual(String text) {
        char[] arr = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            arr[i] = text.charAt(i);
        }
        return arr;
    }

    // Method to compare two char arrays
    static boolean compareCharArrays(char[] a, char[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String text = sc.next();

        // Convert using user-defined method
        char[] manualArr = toCharArrayManual(text);

        // Convert using built-in method
        char[] builtinArr = text.toCharArray();

        // Compare both arrays
        boolean areEqual = compareCharArrays(manualArr, builtinArr);

        // Display results
        System.out.println("\nManual char array: ");
        for (char c : manualArr) {
            System.out.print(c + " ");
        }

        System.out.println("\nBuilt-in char array: ");
        for (char c : builtinArr) {
            System.out.print(c + " ");
        }

        System.out.println("\n\nAre both arrays equal? " + areEqual);

        sc.close();
    }

}
