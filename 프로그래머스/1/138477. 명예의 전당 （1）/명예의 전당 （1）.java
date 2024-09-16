import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        // 리스트 점수에 k개가 초과하면 작은 값 지우고 새로운 값 업데이트
        int[] answer = new int[score.length]; // 결과
        List<Integer> showList = new ArrayList<>();

        for (int i = 0; i < score.length; i++) {
            showList.add(score[i]);

            if (showList.size() > k) {
                showList.remove(Collections.min(showList)); 
                // k개 초과하면 가장 작은 값 제거
            }
            answer[i] = Collections.min(showList);
            // 리스트에서 가장 작은 값 저장
        }
        return answer;
    }
}