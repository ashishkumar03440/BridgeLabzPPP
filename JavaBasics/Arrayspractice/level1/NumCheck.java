package Arrayspractice.level1;

import java.util.Scanner;

public class NumCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        System.out.println("\nNumber Analysis:");
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];

            if (num > 0) {
                if (num % 2 == 0) {
                    System.out.println("Number " + num + " is Positive and Even.");
                } else {
                    System.out.println("Number " + num + " is Positive and Odd.");
                }
            } else if (num < 0) {
                System.out.println("Number " + num + " is Negative.");
            } else {
                System.out.println("Number " + num + " is Zero.");
            }
        }

        System.out.println("\nComparison of First and Last Elements:");
        if (numbers[0] == numbers[numbers.length - 1]) {
            System.out.println("First element (" + numbers[0] + ") is equal to Last element (" + numbers[4] + ").");
        } else if (numbers[0] > numbers[numbers.length - 1]) {
            System.out.println("First element (" + numbers[0] + ") is greater than Last element (" + numbers[4] + ").");
        } else {
            System.out.println("First element (" + numbers[0] + ") is less than Last element (" + numbers[4] + ").");
        }

        sc.close();
    }
}