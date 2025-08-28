package ClassWork.Arrays;

public class UnitCapital {
    public static void main(String[] args) {
        String str = "hello world";
        String result = Cap(str);
        System.out.println(result);  // Output: Hello World
    }

    public static String Cap(String str) {
        char[] ch = str.toCharArray();
        boolean foundSpace = true;

        for (int i = 0; i < ch.length; i++) {
            if ((ch[i] >= 'a' && ch[i] <= 'z') || (ch[i] >= 'A' && ch[i] <= 'Z')) {
                if (foundSpace) {
                    // convert lowercase to uppercase
                    if (ch[i] >= 'a' && ch[i] <= 'z') {
                        ch[i] = (char) (ch[i] - 32);
                    }
                    foundSpace = false;
                } else {
                    // convert uppercase to lowercase
                    if (ch[i] >= 'A' && ch[i] <= 'Z') {
                        ch[i] = (char) (ch[i] + 32);
                    }
                }
            } else {
                foundSpace = true;
            }
        }
        return new String(ch);
    }
}
