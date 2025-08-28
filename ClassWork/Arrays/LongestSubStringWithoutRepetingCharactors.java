package ClassWork.Arrays;
public class LongestSubStringWithoutRepetingCharactors {
    public static void main(String[] args) {
        String str = "abcabcbb";
        int n = str.length();
        int res = 0;
        for(int i = 0; i < n; i++) {
            boolean[] visited = new boolean[256];
            for(int j = i; j < n; j++) {
                if(visited[str.charAt(j)] == true) {
                    break;
                } else {
                    res = Math.max(res, j - i + 1);
                    visited[str.charAt(j)] = true;
                }
            }
            visited[str.charAt(i)] = false;
        }
        System.out.println("The length of the longest substring without repeating characters is: " + res);
    }   
}