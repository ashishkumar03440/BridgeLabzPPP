package ClassWork.Arrays;

public class CountVar {
    public static void main(String[] args) {
        String str = "hello world".toLowerCase();
        int count = 0;
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch =='a'|| ch =='i'|| ch == 'e'|| ch =='o'||ch=='u') {
                count++;
            }
            
        }
        System.out.println("Number of vowels in the string: " + count);
            System.out.println("number  of consonants in the string: " + (str.length() - count));
    }
    
}
