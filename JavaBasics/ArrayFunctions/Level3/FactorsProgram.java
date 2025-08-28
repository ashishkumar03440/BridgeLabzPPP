package JavaBasics.ArrayFunctions.Level3;

import java.util.*;

class FactorsProgram {
    public static int[] getFactors(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) if (n % i == 0) list.add(i);
        return list.stream().mapToInt(i -> i).toArray();
    }

    public static int greatestFactor(int[] arr) {
        return arr[arr.length - 1];
    }

    public static int sumFactors(int[] arr) {
        int sum = 0; for (int x : arr) sum += x; return sum;
    }

    public static int productFactors(int[] arr) {
        int prod = 1; for (int x : arr) prod *= x; return prod;
    }

    public static double productCubes(int[] arr) {
        double prod = 1;
        for (int x : arr) prod *= Math.pow(x, 3);
        return prod;
    }

    public static void main(String[] args) {
        int n = 12;
        int[] factors = getFactors(n);
        System.out.println("Factors: " + Arrays.toString(factors));
        System.out.println("Greatest Factor: " + greatestFactor(factors));
        System.out.println("Sum of Factors: " + sumFactors(factors));
        System.out.println("Product of Factors: " + productFactors(factors));
        System.out.println("Product of Cubes of Factors: " + productCubes(factors));
    }
}
