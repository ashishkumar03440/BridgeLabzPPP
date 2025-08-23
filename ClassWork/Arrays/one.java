package ClassWork.Arrays;
import java.util.Scanner;

public class one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        int[] arr1 = new int[size];
        for(int i = 0; i < arr1.length; i++) {
            System.out.println("Enter element " + (i + 1) + ":");
             int a = sc.nextInt();
             arr1[i] = a;
             
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i] + " ");
        }
           int sum = 0;
    for(int i = 0; i < arr1.length; i++) {
        sum += arr1[i];


    }
    System.out.println("sum of all elements of array is :"+sum);
    }

    
}
    
 
