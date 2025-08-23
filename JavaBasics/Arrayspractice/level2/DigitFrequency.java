package Arrayspractice.level2;

import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input number
        System.out.print("Enter a number: ");
        long num = sc.nextLong();

        // Handle negative numbers
        if (num < 0) {
            num = -num;
        }

        // Step 2: Convert number to string to find count of digits
        String numStr = Long.toString(num);
        int count = numStr.length();

        // Step 3: Store digits in an array
        int[] digits = new int[count];
        for (int i = 0; i < count; i++) {
            digits[i] = numStr.charAt(i) - '0';  // convert char → int
        }

        // Step 4: Frequency array
        int[] freq = new int[10];  // index 0–9 for digits

        for (int d : digits) {
            freq[d]++;
        }

        // Step 5: Display frequency
        System.out.println("\nDigit Frequency in " + num + ":");
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {  // only show digits that appear
                System.out.println("Digit " + i + " → " + freq[i] + " times");
            }
        }

        sc.close();
    }
}
