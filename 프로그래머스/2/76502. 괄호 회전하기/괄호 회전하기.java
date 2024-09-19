import java.util.Stack;

public class Solution {
    
    // 올바른 괄호 문자열인지 확인하는 함수
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) { // 문자열을 문자 배열로 변환
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if (c == ')' && top != '(') return false;
                if (c == '}' && top != '{') return false;
                if (c == ']' && top != '[') return false;
            }
        }
        return stack.isEmpty(); // 스택이 비어 있어야 올바른 문자열
    }
    
    // 주어진 문자열을 왼쪽으로 회전하며 올바른 괄호 문자열이 되는 횟수를 계산하는 함수
    public static int solution(String s) {
        int answer = 0;
        int len = s.length();
        
        for (int i = 0; i < len; ++i) {
            // 문자열을 왼쪽으로 i만큼 회전
            String rotated = s.substring(i) + s.substring(0, i);
            if (isValid(rotated)) {
                answer++;
            }
        }
        return answer;
    }
}