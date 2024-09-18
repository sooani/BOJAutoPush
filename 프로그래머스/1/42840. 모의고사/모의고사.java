import java.util.ArrayList;

class Solution {
    public int[] solution(int[] answers) {
        int[] num1 = {1, 2, 3, 4, 5};
        int[] num2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] num3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int score1 = 0, score2 = 0, score3 = 0;
        
        ArrayList<Integer> result = new ArrayList<>();
        
        // 맞힌 문제 수 계산
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == num1[i % num1.length]) {
                score1++;
            }
            if (answers[i] == num2[i % num2.length]) {
                score2++;
            }
            if (answers[i] == num3[i % num3.length]) {
                score3++;
            }
        }
        
        // 가장 높은 점수를 계산
        int maxScore = Math.max(score1, Math.max(score2, score3));
        
        if (score1 == maxScore) {
            result.add(1);
        }
        if (score2 == maxScore) {
            result.add(2);
        }
        if (score3 == maxScore) {
            result.add(3);
        }
        return result.stream().mapToInt(i -> i).toArray();
    }
}