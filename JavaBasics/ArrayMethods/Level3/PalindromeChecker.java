package JavaBasics.ArrayFunctions.Level3;

import java.util.*;

class PalindromeChecker {
    public static int[] getDigits(int n) {
        String s = String.valueOf(n);
        int[] arr = new int[s.length()];
        for (int i = 0; i < s.length(); i++) arr[i] = s.charAt(i) - '0';
        return arr;
    }

    public static int[] reverse(int[] arr) {
        int[] rev = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
            rev[i] = arr[arr.length - 1 - i];
        return rev;
    }

    public static boolean compare(int[] a, int[] b) {
        return Arrays.equals(a, b);
    }

    public static boolean isPalindrome(int n) {
        int[] d = getDigits(n);
        int[] rev = reverse(d);
        return compare(d, rev);
    }

    public static void main(String[] args) {
        int n = 1221;
        System.out.println("Number: " + n);
        System.out.println("Palindrome? " + isPalindrome(n));
    }
}
