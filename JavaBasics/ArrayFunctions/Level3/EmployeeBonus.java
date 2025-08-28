package JavaBasics.ArrayFunctions.Level3;

import java.util.*;

class EmployeeBonus {
    public static void main(String[] args) {
        int[][] employees = new int[10][2]; // [salary, years]
        int[][] newData = new int[10][2];  // [new salary, bonus]
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            int salary = rand.nextInt(90000) + 10000; // 5-digit
            int years = rand.nextInt(11); // 0–10
            employees[i][0] = salary; employees[i][1] = years;

            double bonusRate = (years > 5) ? 0.05 : 0.02;
            int bonus = (int)(salary * bonusRate);
            int newSalary = salary + bonus;

            newData[i][0] = newSalary; newData[i][1] = bonus;
        }

        int totalOld = 0, totalNew = 0, totalBonus = 0;
        System.out.println("Salary\tYears\tNewSalary\tBonus");
        for (int i = 0; i < 10; i++) {
            System.out.println(employees[i][0] + "\t" + employees[i][1] + "\t" + newData[i][0] + "\t" + newData[i][1]);
            totalOld += employees[i][0];
            totalNew += newData[i][0];
            totalBonus += newData[i][1];
        }
        System.out.println("\nTotal Old Salary: " + totalOld);
        System.out.println("Total New Salary: " + totalNew);
        System.out.println("Total Bonus Paid: " + totalBonus);
    }
}
