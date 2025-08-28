package ClassWork.Arrays;

public class RevString {
    public static void main(String[] args) {
        String str="Hello";
    StringBuilder sb=new StringBuilder(str);
    String s1 = "";
    for(int i=sb.length()-1;i>=0;i--){
        s1=s1+sb.charAt(i);
    }
    System.out.println(s1);
}}