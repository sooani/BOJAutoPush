import java.util.HashMap;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0 ,0};
        HashMap<String, Integer> Map = new HashMap<String, Integer>();
        Map.put(words[0], 0);

        for(int i = 1; i < words.length; ++i) {
            Map.put(words[i], 0);

            // 단어의 끝 , 시작이 일치하지 않거나 단어가 중복된 경우
            if (words[i-1].charAt(words[i-1].length()-1) != words[i].charAt(0)
                || Map.size() < i + 1) {
                answer[0] = i % n + 1; // 사람의 번호
                answer[1] = i / n + 1; // 순서
                break;
            }
        }

        return answer;
    }
}