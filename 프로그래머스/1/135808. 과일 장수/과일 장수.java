import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
        // 점수를 오름차순 정렬
        Arrays.sort(score);
        
        // 최대 이익을 계산할 변수
        int answer = 0;
        int n = score.length;
        
        // 상자에 들어가는 사과 개수 m 만큼 반복, 배열의 뒤부터 선택
        for (int i = n - m; i >= 0; i -= m) {
            // 상자에 담을 사과의 최저 점수 (현재 i 위치의 점수)
            answer += score[i] * m;
        }

        return answer;
    }
}