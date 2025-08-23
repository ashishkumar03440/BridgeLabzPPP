package Arrayspractice.level2;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step A: Input number
        System.out.print("Enter a number: ");
        long number = sc.nextLong();

        // Step B: Start with array of size 10
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        // Step C: Extract digits of the number
        while (number != 0) {
            int digit = (int)(number % 10);

            // ✅ Hint f modification:
            // If array is full, increase size by 10
            if (index == maxDigit) {
                maxDigit += 10; // expand capacity
                int[] temp = new int[maxDigit];
                // copy old array into new temp
                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }
                digits = temp; // assign back
            }

            // store the digit
            digits[index] = digit;
            index++;

            number /= 10; // reduce the number
        }

        // Step D: Find largest and second-largest digits
        int largest = -1;
        int secondLargest = -1;

        for (int i = 0; i < index; i++) {
            int d = digits[i];

            if (d > largest) {
                secondLargest = largest;
                largest = d;
            } else if (d > secondLargest && d != largest) {
                secondLargest = d;
            }
        }

        // Step E: Display result
        System.out.println("Largest digit = " + largest);
        if (secondLargest != -1) {
            System.out.println("Second largest digit = " + secondLargest);
        } else {
            System.out.println("Second largest digit not found (all digits are same).");
        }

        sc.close();
    }
}
