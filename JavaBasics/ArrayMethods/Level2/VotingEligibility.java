package Strings_Level2;

import java.util.Random;
import java.util.Scanner;

public class VotingEligibility {
    // Method to generate random 2-digit ages for n students
    public static int[] generateAges(int n) {
        Random rand = new Random();
        int[] ages = new int[n];

        for (int i = 0; i < n; i++) {
            ages[i] = rand.nextInt(90) + 10; // generate 2-digit age (10–99)
        }

        return ages;
    }

    // Method to check voting eligibility
    // Returns 2D array [age, "true/false"]
    public static String[][] checkEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            int age = ages[i];
            result[i][0] = String.valueOf(age);

            if (age < 0) {
                result[i][1] = "false"; // invalid age
            } else if (age >= 18) {
                result[i][1] = "true"; // can vote
            } else {
                result[i][1] = "false"; // cannot vote
            }
        }

        return result;
    }

    // Method to display results in tabular format
    public static void displayTable(String[][] data) {
        System.out.println("\nStudent\tAge\tCan Vote");
        System.out.println("----------------------------");

        for (int i = 0; i < data.length; i++) {
            int age = Integer.parseInt(data[i][0]);
            boolean canVote = Boolean.parseBoolean(data[i][1]);
            System.out.println((i + 1) + "\t" + age + "\t" + canVote);
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // Step 1: Generate random ages
        int[] ages = generateAges(n);

        // Step 2: Check voting eligibility
        String[][] result = checkEligibility(ages);

        // Step 3: Display result in table
        displayTable(result);

        sc.close();
    }
}
