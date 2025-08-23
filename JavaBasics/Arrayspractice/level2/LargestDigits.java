package Arrayspractice.level2;

import java.util.Scanner;

public class LargestDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take user input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Step 2: Define array with maxDigit = 10
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        // Step 3: Extract digits
        while (number != 0) {
            int digit = number % 10;   // get last digit
            digits[index] = digit;     // store in array
            index++;

            if (index == maxDigit) {
                System.out.println("Maximum digits reached (10), remaining digits ignored.");
                break;
            }

            number /= 10;  // remove last digit
        }

        // Step 4: Find largest and second largest digit
        int largest = 0;
        int secondLargest = 0;

        for (int i = 0; i < index; i++) {
            int d = digits[i];
            if (d > largest) {
                secondLargest = largest;
                largest = d;
            } else if (d > secondLargest && d != largest) {
                secondLargest = d;
            }
        }

        // Step 5: Display results
        System.out.println("\nLargest digit = " + largest);
        if (secondLargest == 0 && largest != 0) {
            System.out.println("Second largest digit = Not found (all digits are same or only one unique digit)");
        } else {
            System.out.println("Second largest digit = " + secondLargest);
        }

        sc.close(); 
    }
}
