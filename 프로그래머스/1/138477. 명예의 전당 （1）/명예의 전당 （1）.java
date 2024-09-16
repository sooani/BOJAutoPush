import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        // 우선순위 큐
        PriorityQueue<Integer> showList = new PriorityQueue<>();

        for (int i = 0; i < score.length; i++) {
            showList.offer(score[i]);
            
            if (showList.size() > k) {
                showList.poll(); // 가장 작은 값을 제거
            }
            answer[i] = showList.peek(); // 큐의 맨 앞 값 저장
        }
        return answer;
    }
}