package Arrayspractice.level1;

import java.util.Scanner;

public class MultiplicationTableRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number between 6 and 9: ");
        int number = sc.nextInt();

        if (number < 6 || number > 9) {
            System.out.println("Invalid input! Please enter a number between 6 and 9.");
        } else {
            int[] multiplicationResult = new int[10];

            for (int i = 0; i < multiplicationResult.length; i++) {
                multiplicationResult[i] = number * (i + 1);
            }

            System.out.println("\nMultiplication Table of " + number + ":");
            for (int i = 0; i < multiplicationResult.length; i++) {
                System.out.println(number + " * " + (i + 1) + " = " + multiplicationResult[i]);
            }
        }

        sc.close();
    }
}
