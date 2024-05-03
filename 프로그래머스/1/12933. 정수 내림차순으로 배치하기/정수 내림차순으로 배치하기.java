import java.util.Arrays;

class Solution {
    public long solution(long n) {
        char[] ch = Long.toString(n).toCharArray();
        Arrays.sort(ch);
        StringBuilder sortedStr = new StringBuilder(new String(ch));
        sortedStr.reverse();
        
        long result = Long.parseLong(sortedStr.toString());
        return result;
    }
}