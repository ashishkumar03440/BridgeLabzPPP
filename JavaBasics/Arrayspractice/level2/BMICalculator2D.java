package Arrayspractice.level2;

import java.util.Scanner;

public class BMICalculator2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Number of persons
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        // Step 2: Create 2D array [Height, Weight, BMI]
        double[][] personData = new double[n][3]; 
        String[] weightStatus = new String[n];

        // Step 3: Input weight and height
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Person " + (i + 1));

            // Input weight with validation
            double weight;
            do {
                System.out.print("Enter weight (kg): ");
                weight = sc.nextDouble();
                if (weight <= 0) {
                    System.out.println("⚠ Weight must be positive. Try again.");
                }
            } while (weight <= 0);

            // Input height with validation
            double height;
            do {
                System.out.print("Enter height (meters): ");
                height = sc.nextDouble();
                if (height <= 0) {
                    System.out.println("⚠ Height must be positive. Try again.");
                }
            } while (height <= 0);

            // Calculate BMI
            double bmi = weight / (height * height);

            // Store in personData [0=Height, 1=Weight, 2=BMI]
            personData[i][0] = height;
            personData[i][1] = weight;
            personData[i][2] = bmi;

            // Determine Weight Status
            if (bmi < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (bmi < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Step 4: Display results
        System.out.println("\n--- BMI Report ---");
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Height", "Weight", "BMI", "Status");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s%n", 
                              personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }

        sc.close();
    }
}
