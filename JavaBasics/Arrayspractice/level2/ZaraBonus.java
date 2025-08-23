package Arrayspractice.level2;

import java.util.Scanner;

public class ZaraBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Arrays for employee data
        double[] salary = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        // Totals
        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        // Take input for 10 employees
        for (int i = 0; i < 10; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1) + ":");

            System.out.print("Salary: ");
            double s = sc.nextDouble();
            System.out.print("Years of Service: ");
            double y = sc.nextDouble();

            // Validation
            if (s <= 0 || y < 0) {
                System.out.println("Invalid input! Please enter again.");
                i--; // decrement index to re-enter data
                continue;
            }

            salary[i] = s;
            yearsOfService[i] = y;
        }

        // Calculate bonus, new salary and totals
        for (int i = 0; i < 10; i++) {
            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05; // 5%
            } else {
                bonus[i] = salary[i] * 0.02; // 2%
            }

            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // Display results
        System.out.println("\n===== Employee Salary Details =====");
        for (int i = 0; i < 10; i++) {
            System.out.println("Employee " + (i + 1) +
                    " | Old Salary: " + salary[i] +
                    " | Bonus: " + bonus[i] +
                    " | New Salary: " + newSalary[i]);
        }

        System.out.println("\n===== Company Totals (Zara) =====");
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total New Salary: " + totalNewSalary);

        sc.close();
    }
}
