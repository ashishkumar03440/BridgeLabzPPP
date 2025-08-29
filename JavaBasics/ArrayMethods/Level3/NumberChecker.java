package JavaBasics.ArrayFunctions.Level3;

class NumberChecker {
    public static int countDigits(int n) {
        return String.valueOf(n).length();
    }

    public static int[] getDigits(int n) {
        String s = String.valueOf(n);
        int[] arr = new int[s.length()];
        for (int i = 0; i < s.length(); i++) arr[i] = s.charAt(i) - '0';
        return arr;
    }

    public static boolean isDuck(int n) {
        return String.valueOf(n).contains("0");
    }

    public static boolean isArmstrong(int n) {
        int[] d = getDigits(n);
        int sum = 0;
        for (int x : d) sum += Math.pow(x, d.length);
        return sum == n;
    }

    public static int[] largestAndSecondLargest(int[] d) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        for (int x : d) {
            if (x > max1) { max2 = max1; max1 = x; }
            else if (x > max2 && x != max1) max2 = x;
        }
        return new int[]{max1, max2};
    }

    public static int[] smallestAndSecondSmallest(int[] d) {
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        for (int x : d) {
            if (x < min1) { min2 = min1; min1 = x; }
            else if (x < min2 && x != min1) min2 = x;
        }
        return new int[]{min1, min2};
    }

    public static void main(String[] args) {
        int n = 153;
        int[] digits = getDigits(n);
        System.out.println("Number: " + n);
        System.out.println("Duck? " + isDuck(n));
        System.out.println("Armstrong? " + isArmstrong(n));
        int[] big = largestAndSecondLargest(digits);
        System.out.println("Largest: " + big[0] + ", 2nd Largest: " + big[1]);
        int[] small = smallestAndSecondSmallest(digits);
        System.out.println("Smallest: " + small[0] + ", 2nd Smallest: " + small[1]);
    }
}
