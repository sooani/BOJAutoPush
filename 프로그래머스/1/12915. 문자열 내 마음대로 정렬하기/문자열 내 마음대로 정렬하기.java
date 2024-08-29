import java.util.Arrays;

class Solution {
    public String[] solution(String[] strings, int n) {
        // n번째 문자를 기준으로, 같으면 문자열 자체로 정렬
        Arrays.sort(strings, (s1, s2) -> 
            s1.charAt(n) == s2.charAt(n) ? 
                    s1.compareTo(s2) : s1.charAt(n) - s2.charAt(n)
        );
        return strings;
    }
}
