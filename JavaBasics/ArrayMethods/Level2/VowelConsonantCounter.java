package Strings_Level2;

import java.util.Scanner;

public class VowelConsonantCounter {
     // Method to check if a character is vowel, consonant, or not a letter
    public static String checkCharType(char ch) {
        // If uppercase, convert to lowercase using ASCII
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32); // ASCII difference between A-Z and a-z is 32
        }

        // Check if it's a lowercase letter
        if (ch >= 'a' && ch <= 'z') {
            // Check vowels
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter";
    }

    // Method to count vowels and consonants in a string
    // Returns array: [vowelCount, consonantCount]
    public static int[] countVowelsAndConsonants(String str) {
        int vowels = 0, consonants = 0;

        int index = 0;
        try {
            while (true) {
                char ch = str.charAt(index);
                String type = checkCharType(ch);

                if (type.equals("Vowel")) {
                    vowels++;
                } else if (type.equals("Consonant")) {
                    consonants++;
                }

                index++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // loop ends when charAt goes out of range
        }

        return new int[]{vowels, consonants};
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int[] result = countVowelsAndConsonants(input);

        System.out.println("\nVowel Count: " + result[0]);
        System.out.println("Consonant Count: " + result[1]);

        sc.close();
    }
}
