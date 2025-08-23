package ClassWork.Arrays;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();

        int[] arr1 = new int[size];

        
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Enter element " + (i + 1) + ":");
            arr1[i] = sc.nextInt();
        }


        System.out.print("Array elements are: ");
        for (int num : arr1) {
            System.out.print(num + " ");
        }
        System.out.println();

        
        System.out.println("Prime numbers in the array are:");
        for (int num : arr1) {
            if (isPrime(num)) {
                System.out.println(num);
            }
        }
    }


    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false; 
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; 
            }
        }
        return true;
    }
}
