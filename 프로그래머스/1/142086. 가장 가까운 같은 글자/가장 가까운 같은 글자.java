import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        Map<Character, Integer> lastIndexMap = new HashMap<>();
        // 문자의 마지막 인덱스 저장

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            if (lastIndexMap.containsKey(currentChar)) {
                answer[i] = i - lastIndexMap.get(currentChar);
                // 이전 위치와의 거리 계산후 저장
            } else {
                answer[i] = -1;
            }
            lastIndexMap.put(currentChar, i);
        }
        return answer;
    }
}