package Strings_Level1;

import java.util.Scanner;

public class CompareStrings {
    static boolean compareUsingCharAt(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter first string: ");
        String str1 = sc.next();

        System.out.print("Enter second string: ");
        String str2 = sc.next();

        // Compare using charAt()
        boolean manualCompare = compareUsingCharAt(str1, str2);

        // Compare using built-in equals()
        boolean builtInCompare = str1.equals(str2);

        // Display results
        System.out.println("\nComparison using charAt(): " + manualCompare);
        System.out.println("Comparison using equals(): " + builtInCompare);

        // Check if both results are same
        if (manualCompare == builtInCompare) {
            System.out.println("✅ Both methods give the same result.");
        } else {
            System.out.println("❌ Results are different.");
        }

        sc.close();
    }
}
