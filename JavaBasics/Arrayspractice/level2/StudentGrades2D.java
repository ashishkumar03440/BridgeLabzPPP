package Arrayspractice.level2;

import java.util.Scanner;

public class StudentGrades2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // Step 2: Arrays
        int[][] marks = new int[n][3];  // 2D array for Physics, Chemistry, Maths
        double[] percentage = new double[n];
        String[] grade = new String[n];

        // Step 3: Input marks
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1));

            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";

                int mark;
                do {
                    System.out.print(subject + " marks (0-100): ");
                    mark = sc.nextInt();

                    if (mark < 0 || mark > 100) {
                        System.out.println("⚠ Marks must be between 0 and 100. Try again.");
                    }
                } while (mark < 0 || mark > 100);

                marks[i][j] = mark;
            }

            // Step 4: Compute percentage using 2D array
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += marks[i][j];
            }
            percentage[i] = (total / 300.0) * 100;

            // Step 5: Assign grade
            if (percentage[i] >= 90) {
                grade[i] = "A";
            } else if (percentage[i] >= 75) {
                grade[i] = "B";
            } else if (percentage[i] >= 50) {
                grade[i] = "C";
            } else {
                grade[i] = "F";
            }
        }

        // Step 6: Display results
        System.out.println("\n--- Student Report ---");
        System.out.printf("%-10s %-10s %-10s %-12s %-12s%n",
                          "Physics", "Chemistry", "Maths", "Percentage", "Grade");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-10d %-10d %-10d %-12.2f %-12s%n",
                              marks[i][0], marks[i][1], marks[i][2], percentage[i], grade[i]);
        }

        sc.close();
    }
}
