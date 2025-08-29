package Strings_Level1;

import java.util.Scanner;

public class SubStringComparison {
    static String substringUsingCharAt(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    // Method to compare two strings manually using charAt()
    static boolean compareUsingCharAt(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String text = sc.next();

        System.out.print("Enter start index: ");
        int start = sc.nextInt();

        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        // Manual substring
        String manualSub = substringUsingCharAt(text, start, end);

        // Built-in substring
        String builtinSub = text.substring(start, end);

        // Compare manually
        boolean areEqual = compareUsingCharAt(manualSub, builtinSub);

        // Display results
        System.out.println("\nManual substring: " + manualSub);
        System.out.println("Built-in substring: " + builtinSub);
        System.out.println("Are both substrings equal? " + areEqual);

        sc.close();
    }
}
