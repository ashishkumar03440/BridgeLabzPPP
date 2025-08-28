package Strings_Level2;

import java.util.Scanner;

public class WordLengthTable {
     // Method to find length of a string without using length()
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // stop when index out of range
        }
        return count;
    }

    // Method to split text into words (no split() used)
    public static String[] customSplit(String str) {
        int n = findLength(str);

        // Count spaces for word count
        int spaceCount = 0;
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == ' ') {
                spaceCount++;
            }
        }
        int wordCount = spaceCount + 1;

        // Store space positions
        int[] spaceIndexes = new int[wordCount + 1];
        int idx = 0;
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == ' ') {
                spaceIndexes[idx++] = i;
            }
        }
        spaceIndexes[idx] = n; // last boundary = string end

        // Extract words
        String[] words = new String[wordCount];
        int start = 0, wordIndex = 0;

        for (int i = 0; i < wordCount; i++) {
            int end = spaceIndexes[i];
            StringBuilder sb = new StringBuilder();
            for (int j = start; j < end; j++) {
                sb.append(str.charAt(j));
            }
            words[wordIndex++] = sb.toString();
            start = end + 1;
        }
        return words;
    }

    // Method to return 2D array with word and its length
    public static String[][] wordsWithLength(String[] words) {
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i]; // word
            result[i][1] = String.valueOf(findLength(words[i])); // length as String
        }
        return result;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        // Step 1: Split text into words
        String[] words = customSplit(input);

        // Step 2: Create 2D array [word, length]
        String[][] wordTable = wordsWithLength(words);

        // Step 3: Display in tabular format
        System.out.println("\nWord\tLength");
        System.out.println("------------------");
        for (int i = 0; i < wordTable.length; i++) {
            String word = wordTable[i][0];
            int length = Integer.parseInt(wordTable[i][1]); // convert back to integer
            System.out.println(word + "\t" + length);
        }

        sc.close();
    }
}


