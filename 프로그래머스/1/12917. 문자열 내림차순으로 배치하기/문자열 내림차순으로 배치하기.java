import java.util.Arrays;

class Solution {
    public String solution(String s) {
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        
        StringBuilder answer = new StringBuilder(new String(ch)).reverse();
        return answer.toString();
    }
}