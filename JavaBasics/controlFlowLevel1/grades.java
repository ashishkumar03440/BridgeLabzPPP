package controlFlowLevel1;

import java.util.Scanner;

public class grades {
    public static void main(String[] args) {
        System.out.println("Enter the marks of students:");
        Scanner sc = new Scanner(System.in);
        int Marks = sc.nextInt();
        if (Marks >= 90) {
            System.out.println("Grade A");
        }
        else if (Marks >= 89 && Marks < 74) {
            System.out.println("Grade B");
        }   
        else if (Marks >= 74 && Marks < 60) {
            System.out.println("Grade C");
         }
         else {
            System.out.println("fail");
         }
}
}
