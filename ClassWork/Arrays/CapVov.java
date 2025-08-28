package ClassWork.Arrays;

public class CapVov {
    public static void main(String[] args) {
        String str = "hello world".toLowerCase();
        StringBuilder sb = new StringBuilder(str);
        String S  = "";
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch =='a'|| ch =='i'|| ch == 'e'|| ch =='o'||ch=='u') {
                char s = ch.toUpperCase();
            }
    }
    
}
