package Strings_Level2;

public class CustomTrimDemo {
    
  // Method to find start and end index after trimming spaces
    public static int[] findTrimIndexes(String str) {
        int n = 0;
        try {
            while (true) {
                str.charAt(n);
                n++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // found string length
        }

        int start = 0, end = n - 1;

        // Trim leading spaces
        while (start < n && str.charAt(start) == ' ') {
            start++;
        }

        // Trim trailing spaces
        while (end >= 0 && str.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    // Method to create substring using charAt()
    public static String customSubstring(String str, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i <= end; i++) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) {
        int len1 = 0, len2 = 0;

        try {
            while (true) { s1.charAt(len1); len1++; }
        } catch (StringIndexOutOfBoundsException e) {}

        try {
            while (true) { s2.charAt(len2); len2++; }
        } catch (StringIndexOutOfBoundsException e) {}

        if (len1 != len2) return false;

        for (int i = 0; i < len1; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string with leading/trailing spaces: ");
        String input = sc.nextLine();

        // Step 1: Get trim indexes
        int[] indexes = findTrimIndexes(input);
        int start = indexes[0];
        int end = indexes[1];

        // Step 2: Get trimmed string using custom substring
        String customTrimmed = "";
        if (start <= end) { // handle case with only spaces
            customTrimmed = customSubstring(input, start, end);
        }

        // Step 3: Get built-in trimmed string
        String builtinTrimmed = input.trim();

        // Step 4: Compare both
        boolean isSame = compareStrings(customTrimmed, builtinTrimmed);

        // Display results
        System.out.println("\nCustom Trimmed String: \"" + customTrimmed + "\"");
        System.out.println("Built-in Trimmed String: \"" + builtinTrimmed + "\"");
        System.out.println("Are both same? " + isSame);

        sc.close();
    }
}
