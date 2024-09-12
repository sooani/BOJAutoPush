import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        Map<String, Integer> scoreMap = new HashMap<>();

        // 이름과 점수를 매핑하여 저장
        for (int i = 0; i < name.length; i++) {
            scoreMap.put(name[i], yearning[i]);
        }

        for (int i = 0; i < photo.length; i++) {
            int sum = 0;
            for (String person : photo[i]) {
                // 이름이 존재하면 점수를 더함
                sum += scoreMap.getOrDefault(person, 0);
            }
            answer[i] = sum;
        }

        return answer;
    }
}