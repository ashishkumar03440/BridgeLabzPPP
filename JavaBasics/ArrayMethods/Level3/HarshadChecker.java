package JavaBasics.ArrayFunctions.Level3;

import java.util.*;

class HarshadChecker {
    public static int[] getDigits(int n) {
        String s = String.valueOf(n);
        int[] arr = new int[s.length()];
        for (int i = 0; i < s.length(); i++) arr[i] = s.charAt(i) - '0';
        return arr;
    }

    public static int sumDigits(int[] arr) {
        int sum = 0; for (int x : arr) sum += x; return sum;
    }

    public static int sumSquares(int[] arr) {
        int sum = 0; for (int x : arr) sum += Math.pow(x, 2); return sum;
    }

    public static boolean isHarshad(int n) {
        int[] d = getDigits(n);
        int sum = sumDigits(d);
        return n % sum == 0;
    }

    public static int[][] digitFrequency(int n) {
        int[] d = getDigits(n);
        int[][] freq = new int[10][2];
        for (int i = 0; i < 10; i++) { freq[i][0] = i; freq[i][1] = 0; }
        for (int x : d) freq[x][1]++;
        return freq;
    }

    public static void main(String[] args) {
        int n = 21;
        int[] digits = getDigits(n);
        System.out.println("Sum of digits: " + sumDigits(digits));
        System.out.println("Sum of squares: " + sumSquares(digits));
        System.out.println("Harshad? " + isHarshad(n));
        int[][] freq = digitFrequency(n);
        System.out.println("Digit Frequencies:");
        for (int[] f : freq) if (f[1] > 0)
            System.out.println(f[0] + " -> " + f[1]);
    }
}
