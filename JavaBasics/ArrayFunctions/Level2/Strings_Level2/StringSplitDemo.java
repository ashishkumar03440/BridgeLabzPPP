package Strings_Level2;

import java.util.Scanner;

public class StringSplitDemo {
    
// Method to find length of a string without using length()
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count); // try accessing character
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // stop when index out of range
        }
        return count;
    }

    // Method to split text into words without using split()
    public static String[] customSplit(String str) {
        int n = findLength(str);
        
        // Step 1: Count spaces (for number of words)
        int spaceCount = 0;
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        // Number of words = spaces + 1
        int wordCount = spaceCount + 1;

        // Step 2: Store indexes of spaces
        int[] spaceIndexes = new int[wordCount + 1];
        int idx = 0;
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == ' ') {
                spaceIndexes[idx++] = i;
            }
        }
        spaceIndexes[idx] = n; // last boundary is end of string

        // Step 3: Extract words
        String[] words = new String[wordCount];
        int start = 0;
        int wordIndex = 0;

        for (int i = 0; i < wordCount; i++) {
            int end = spaceIndexes[i];
            StringBuilder sb = new StringBuilder();
            for (int j = start; j < end; j++) {
                sb.append(str.charAt(j));
            }
            words[wordIndex++] = sb.toString();
            start = end + 1; // move to next word after space
        }

        return words;
    }

    // Method to compare two string arrays
    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input text (full sentence)
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        // Custom split
        String[] customWords = customSplit(input);

        // Built-in split
        String[] builtInWords = input.split(" ");

        // Compare arrays
        boolean isSame = compareArrays(customWords, builtInWords);

        // Display results
        System.out.println("\nCustom Split Result:");
        for (String w : customWords) {
            System.out.println(w);
        }

        System.out.println("\nBuilt-in Split Result:");
        for (String w : builtInWords) {
            System.out.println(w);
        }

        System.out.println("\nComparison Result: " + (isSame ? "Arrays are same" : "Arrays are different"));

        sc.close();
    }
}
