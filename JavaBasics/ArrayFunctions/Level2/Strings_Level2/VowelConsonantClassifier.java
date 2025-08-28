package Strings_Level2;

import java.util.Scanner;

public class VowelConsonantClassifier {
    // Method to check if the character is Vowel, Consonant, or Not a Letter
    public static String checkCharType(char ch) {
        // Convert uppercase to lowercase using ASCII
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32); // difference between A-Z and a-z = 32
        }

        // Check if it's a lowercase alphabet
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter";
    }

    // Method to classify all characters in a string
    // Returns a 2D array [char, type]
    public static String[][] classifyString(String str) {
        int length = 0;

        // Count characters manually
        try {
            while (true) {
                str.charAt(length);
                length++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // stop when out of range
        }

        String[][] result = new String[length][2];

        for (int i = 0; i < length; i++) {
            char ch = str.charAt(i);
            result[i][0] = String.valueOf(ch);       // character
            result[i][1] = checkCharType(ch);        // type
        }

        return result;
    }

    // Method to display 2D array in tabular format
    public static void displayTable(String[][] data) {
        System.out.println("\nCharacter\tType");
        System.out.println("--------------------------");

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t\t" + data[i][1]);
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Classify characters
        String[][] classified = classifyString(input);

        // Display results
        displayTable(classified);

        sc.close();
    }
}
