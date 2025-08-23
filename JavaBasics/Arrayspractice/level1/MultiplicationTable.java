package Arrayspractice.level1;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a number to print its multiplication table: ");
        int number = sc.nextInt();

        int[] table = new int[10];

        for (int i = 0; i < table.length; i++) {
            table[i] = number * (i + 1);
        }

        System.out.println("\nMultiplication Table of " + number + ":");
        for (int i = 0; i < table.length; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + table[i]);
        }

        sc.close();
    }
}


