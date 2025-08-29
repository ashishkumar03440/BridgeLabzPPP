package JavaBasics.ArrayFunctions.Level3;

import java.util.*;

class FootballTeamStats {
    // Generate random heights
    public static int[] generateHeights() {
        int[] heights = new int[11];
        Random rand = new Random();
        for (int i = 0; i < 11; i++) {
            heights[i] = rand.nextInt(101) + 150; // 150–250
        }
        return heights;
    }

    // Find sum
    public static int sum(int[] arr) {
        int s = 0;
        for (int h : arr) s += h;
        return s;
    }

    // Find mean
    public static double mean(int[] arr) {
        return (double) sum(arr) / arr.length;
    }

    // Find shortest
    public static int shortest(int[] arr) {
        int min = arr[0];
        for (int h : arr) if (h < min) min = h;
        return min;
    }

    // Find tallest
    public static int tallest(int[] arr) {
        int max = arr[0];
        for (int h : arr) if (h > max) max = h;
        return max;
    }

    public static void main(String[] args) {
        int[] heights = generateHeights();
        System.out.println("Players' Heights: " + Arrays.toString(heights));
        System.out.println("Shortest Height: " + shortest(heights));
        System.out.println("Tallest Height: " + tallest(heights));
        System.out.println("Mean Height: " + mean(heights));
    }
}
