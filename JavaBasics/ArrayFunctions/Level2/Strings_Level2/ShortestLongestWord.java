package Strings_Level2;

import java.util.Scanner;

public class ShortestLongestWord {
    // Method to find length of a string without using length()
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // stop when out of range
        }
        return count;
    }

    // Method to split text into words without split()
    public static String[] customSplit(String str) {
        int n = findLength(str);

        // Count spaces to find number of words
        int spaceCount = 0;
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == ' ') {
                spaceCount++;
            }
        }
        int wordCount = spaceCount + 1;

        // Store positions of spaces
        int[] spaceIndexes = new int[wordCount + 1];
        int idx = 0;
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == ' ') {
                spaceIndexes[idx++] = i;
            }
        }
        spaceIndexes[idx] = n; // last boundary = end of string

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

    // Method to return 2D array [word, length]
    public static String[][] wordsWithLength(String[] words) {
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i]; // word
            result[i][1] = String.valueOf(findLength(words[i])); // length as string
        }
        return result;
    }

    // Method to find shortest and longest word
    // Returns {indexOfShortest, indexOfLongest}
    public static int[] findShortestAndLongest(String[][] wordTable) {
        int minIdx = 0, maxIdx = 0;
        int minLen = Integer.parseInt(wordTable[0][1]);
        int maxLen = Integer.parseInt(wordTable[0][1]);

        for (int i = 1; i < wordTable.length; i++) {
            int len = Integer.parseInt(wordTable[i][1]);
            if (len < minLen) {
                minLen = len;
                minIdx = i;
            }
            if (len > maxLen) {
                maxLen = len;
                maxIdx = i;
            }
        }
        return new int[]{minIdx, maxIdx};
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        // Step 1: Split into words
        String[] words = customSplit(input);

        // Step 2: Build 2D array [word, length]
        String[][] wordTable = wordsWithLength(words);

        // Step 3: Find shortest and longest
        int[] indices = findShortestAndLongest(wordTable);
        int minIdx = indices[0];
        int maxIdx = indices[1];

        // Display full table
        System.out.println("\nWord\tLength");
        System.out.println("-------------------");
        for (int i = 0; i < wordTable.length; i++) {
            String word = wordTable[i][0];
            int length = Integer.parseInt(wordTable[i][1]);
            System.out.println(word + "\t" + length);
        }

        // Display results
        System.out.println("\nShortest Word: " + wordTable[minIdx][0] +
                           " (Length: " + wordTable[minIdx][1] + ")");
        System.out.println("Longest Word: " + wordTable[maxIdx][0] +
                           " (Length: " + wordTable[maxIdx][1] + ")");

        sc.close();
    }

}
