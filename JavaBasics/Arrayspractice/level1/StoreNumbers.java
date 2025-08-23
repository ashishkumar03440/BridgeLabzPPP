package Arrayspractice.level1;

import java.util.Scanner;

public class StoreNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array of max 10 elements
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        System.out.println("Enter numbers (up to 10). Enter 0 or negative to stop:");

        // Infinite loop
        while (true) {
            System.out.print("Enter number " + (index + 1) + ": ");
            double num = sc.nextDouble();

            // Stop if 0 or negative is entered
            if (num <= 0) {
                break;
            }

            // Store in array if space available
            if (index < 10) {
                numbers[index] = num;
                index++;
            } else {
                System.out.println("Maximum of 10 numbers reached!");
                break;
            }
        }

        // Calculate total
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }

        // Display numbers entered
        System.out.println("\nNumbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
        }

        // Display total
        System.out.println("\n\nSum of numbers = " + total);

        sc.close();
    }
}
